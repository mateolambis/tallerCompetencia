package com.mateolambis.dominio;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreML;
    private String paisML;
    private List<Corredor> corredoresML;

    public void agregarCorredor(Corredor corredor){
        if (corredoresML.size() <= 5){
            corredoresML.add(corredor);
            System.out.println("Los corredores han sido agregados con exito");
        }else {
            System.out.println("No se pueden agregar mas corredores");
        }
    }

    public void eliminarCorredor(Corredor corredor) {
        corredoresML.remove(corredor);
        System.out.println("Se a eliminado el corredor");
    }

    public Equipo(String nombreML, String paisML) {
        this.nombreML = nombreML;
        this.paisML = paisML;
    }

    public String getNombreML() {
        return nombreML;
    }

    public String getPaisML() {
        return paisML;
    }

    public List<Corredor> getCorredoresML() {
        return corredoresML;
    }
}
