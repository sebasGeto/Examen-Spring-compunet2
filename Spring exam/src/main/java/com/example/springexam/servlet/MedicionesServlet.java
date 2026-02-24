package com.example.springexam.servlet;

import com.example.springexam.model.Mediciones;
import com.example.springexam.services.MedicionesService;
import com.example.springexam.views.MedicionesView;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;
import java.util.List;

@WebServlet("/mediciones")
public class MedicionesServlet extends HttpServlet {
    private MedicionesService medicionesService;
    private MedicionesView medicionesView;

    public void init() {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        medicionesService = context.getBean(MedicionesService.class);
        medicionesView = context.getBean(MedicionesView.class);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Mediciones> mediciones = medicionesService.findAll();
        String html = medicionesView.listMediciones(mediciones);
        resp.setContentType("text/html");
        resp.getWriter().write(html);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String idParam = req.getParameter("id");
        String timestampParam = req.getParameter("timestamp");
        String valorParam = req.getParameter("valor");
        String idDelDispositivoParam = req.getParameter("idDelDispositivo");

        Integer id = Integer.parseInt(idParam);
        long timestamp = Long.parseLong(timestampParam);
        double valor = Double.parseDouble(valorParam);
        Integer idDelDispositivo = Integer.parseInt(idDelDispositivoParam);

        medicionesService.addMedicion(id, timestamp, valor, idDelDispositivo);
        resp.sendRedirect(req.getContextPath() + "/mediciones");

    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String idParam = req.getParameter("id");
        Integer id = Integer.parseInt(idParam);
        medicionesService.deleteMedicion(id);
        resp.sendRedirect(req.getContextPath() + "/mediciones");
    

}
    
}
