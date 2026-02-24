package com.example.springexam.model;

import java.util.ArrayList;
import java.util.List;

public class Dispositivos {
    private Integer id;
    private String name;
    private String serialNumber;
    private String type;
    private double maxValue;
    private double minValue;
    private long timeTolerance;

    
    public Dispositivos(Integer id, String name, String serialNumber, String type, double maxValue, double minValue,
            long timeTolerance) {
        this.id = id;
        this.name = name;
        this.serialNumber = serialNumber;
        this.type = type;
        this.maxValue = maxValue;
        this.minValue = minValue;
        this.timeTolerance = timeTolerance;
    }


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSerialNumber() {
        return serialNumber;
    }


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public double getMaxValue() {
        return maxValue;
    }


    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }


    public double getMinValue() {
        return minValue;
    }


    public void setMinValue(double minValue) {
        this.minValue = minValue;
    }


    public long getTimeTolerance() {
        return timeTolerance;
    }


    public void setTimeTolerance(long timeTolerance) {
        this.timeTolerance = timeTolerance;
    }


    public void setMediciones(List<Mediciones> medicionesSeleccionadas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMediciones'");
    }
    
}
