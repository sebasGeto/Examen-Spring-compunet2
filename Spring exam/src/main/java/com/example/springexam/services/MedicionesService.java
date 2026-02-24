package com.example.springexam.services;

import com.example.springexam.model.Mediciones;
import com.example.springexam.repositories.DispositivosRepository;
import com.example.springexam.repositories.MedicionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedicionesService {
    @Autorawired
    private MedicionesRepository medicionesRepository;

    @Autorawired    
    private DispositivosRepository dispositivosRepository;

    public void setMedicionRepository(MedicionesRepository medicionesRepository) {
        this.medicionesRepository = medicionesRepository;
    }

    public void addMedicion(Integer id, long timestamp, double valor, Integer idDelDispositivo) {
        Mediciones medicion = new Mediciones(idDelDispositivo, idDelDispositivo, idDelDispositivo, null);
        medicion.setId(id);
        medicion.setTimestamp(timestamp);  
        medicion.setValor(valor);
        medicion.setIdDelDispositivo(null);

        medicionesRepository.save(medicion);

    }

    public void deleteMedicion(Integer id) {
        medicionesRepository.getMedicion().setId(null);
        medicionesRepository.getMedicion().setTimestamp(0);
        medicionesRepository.getMedicion().setValor(0);
        medicionesRepository.getMedicion().setIdDelDispositivo(null);
    }

    public List<Mediciones> getAllMediciones() {
        return List.of(medicionesRepository.getMedicion());
    }

    public Mediciones getMedicionById(Integer id) {
        if (medicionesRepository.getMedicion().getId().equals(id)) {
            return medicionesRepository.getMedicion();
        } else {
            return null;
        }
    }
    
}
