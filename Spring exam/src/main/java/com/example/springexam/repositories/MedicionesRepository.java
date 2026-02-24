package com.example.springexam.repositories;

import com.example.springexam.model.Mediciones;
import org.springframework.stereotype.Component;

@Component
public class MedicionesRepository {
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
    
}
