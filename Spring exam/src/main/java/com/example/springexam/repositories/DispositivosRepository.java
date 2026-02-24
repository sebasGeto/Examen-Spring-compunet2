package com.example.springexam.repositories;

import com.example.springexam.model.Dispositivos;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DispositivosRepository {
    private List<Dispositivos> dispositivosList;

    public DispositivosRepository() {
        this.dispositivosList = new ArrayList<>();
    }

    public void addDispositivo(Dispositivos dispositivo) {
        dispositivosList.add(dispositivo);
    }

    public List<Dispositivos> getAllDispositivos() {
        return dispositivosList;
    }
}