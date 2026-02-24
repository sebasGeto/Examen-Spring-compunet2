package com.example.springexam.servlet;

import com.example.springexam.model.Dispositivos;
import com.example.springexam.model.Mediciones;
import com.example.springexam.services.DispositivosService;
import com.example.springexam.services.MedicionesService;
import com.example.springexam.views.DispositivosView;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/dispositivos")
public class DispositivosServlet extends HttpServlet {

    private Gson encoder;
    private DispositivosService dispositivosService;
    private MedicionesService medicionesService;
    private DispositivosView dispositivosView;    

    public void init() throws ServletException {
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        dispositivosService = context.getBean(DispositivosService.class);
        medicionesService = context.getBean(MedicionesService.class);
        dispositivosView = context.getBean(DispositivosView.class);
        encoder = new Gson();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Dispositivos> dispositivos = dispositivosService.findAll();
        List<Mediciones> mediciones = medicionesService.findAll();
        Dispositivos fouDispositivos = null;
        String html = dispositivosView.listDispositivos(dispositivos, mediciones, fouDispositivos);
        resp.setContentType("text/html");
        resp.getWriter().write(html);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String dispositivoName = req.getParameter("dispositivoName");
        String[] medicionIds = req.getParameterValues("medicionId");

        List<Mediciones> medicionesSeleccionadas = new ArrayList<>();
        if (medicionIds != null) {
            for (String medicionId : medicionIds) {
                Mediciones medicion = medicionesService.getMedicionById(Integer.parseInt(medicionId));
                if (medicion != null) {
                    medicionesSeleccionadas.add(medicion);
                }
            }
        }

        Dispositivos nuevoDispositivo = new Dispositivos(null, dispositivoName, dispositivoName, dispositivoName, 0, 0, 0);
        nuevoDispositivo.setName(dispositivoName);
        nuevoDispositivo.setMediciones(medicionesSeleccionadas);

        resp.sendRedirect("/dispositivos"); 

    }
    
}
