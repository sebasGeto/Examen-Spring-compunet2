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
    
}
