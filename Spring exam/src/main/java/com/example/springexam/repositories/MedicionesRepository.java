package com.example.springexam.repositories;

import com.example.springexam.model.Mediciones;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MedicionesRepository {

    private List<Mediciones> mediciones = new ArrayList<>();
    private int currentId;
    private Mediciones medicion;

    public MedicionesRepository() {
        this.medicion = null;
    }

    public void addMedicion(Mediciones medicion) {
        this.medicion = medicion;
    }

    public Mediciones getMedicion() {
        return medicion;
    }

    public void save(Mediciones medicion2) {
        currentId++;
        medicion2.setId(currentId);
        medicion = medicion2;
    }
    
}
