package com.example.springexam.services;

import com.example.springexam.model.Dispositivos;
import com.example.springexam.model.Mediciones;
import com.example.springexam.repositories.DispositivosRepository;
import com.example.springexam.repositories.MedicionesRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

public class DispositivosService {

    public List<Dispositivos> findAll() {
        return null;
    }
}
