package com.example.springexam.views;

import com.example.springexam.model.Dispositivos;
import com.example.springexam.model.Mediciones;

import java.util.List;

import javax.sound.midi.Track;

public class DispositivosView {
    public String listDispositivos(List<Dispositivos> dispositivos, List<Mediciones> mediciones, Dispositivos fouDispositivos) {
        return null;
    }{

        StringBuilder builder = new StringBuilder();
        
        builder.append("<html>");
        builder.append("<head>");
        builder.append("<style>");
        builder.append("body { background-color: blue; font-family: Arial; }");
        builder.append("</style>");
        builder.append("</head>");
        builder.append("<body>");

        //crear
        builder.append("<h3>Create Dispositivo</h3>");
        builder.append("<form method='post'>");

        builder.append("Name: ");
        builder.append("<input type='text' name='dispositivoName'/> <br><br>");

        builder.append("Mediciones:<br>");




    }
}
