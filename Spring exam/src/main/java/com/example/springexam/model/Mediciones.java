package com.example.springexam.model;

import java.util.ArrayList;
import java.util.List;

public class Mediciones {
    private Integer id;
    private long timestamp;
    private double valor;
    private Dispositivos idDelDispositivo;

    public Mediciones(Integer id, long timestamp, double valor, Dispositivos idDelDispositivo) {
        this.id = id;
        this.timestamp = timestamp;
        this.valor = valor;
        this.idDelDispositivo = idDelDispositivo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Dispositivos getIdDelDispositivo() {
        return idDelDispositivo;
    }

    public void setIdDelDispositivo(Dispositivos idDelDispositivo) {
        this.idDelDispositivo = idDelDispositivo;
    }

    
    
}


