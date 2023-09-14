package com.mateolambis.dominio;

import java.util.List;

public class Etapa {
    private int numeroEtapaML;
    private String categoria;
    private List<Equipo> equiposML;

    public  void iniciarEtapa(){
        System.out.println("Iniciando etapa...");
    }

    public void finalizarEtapa(){
        System.out.println("FInalizando la etapa...");
    }

    public Etapa(int numeroEtapaML, String categoria) {
        this.numeroEtapaML = numeroEtapaML;
        this.categoria = categoria;
    }

    public int getNumeroEtapaML() {
        return numeroEtapaML;
    }

    public List<Equipo> getEquiposML() {
        return equiposML;
    }
}
