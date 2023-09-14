package com.mateolambis.dominio;

import java.util.ArrayList;
import java.util.List;

public class Competencia {
    private int identificacionML;
    private String nombreML;
    private List<Etapa> etapasML;
    private List<Equipo> equiposML;


    public void agregarEtapa(Etapa etapa){
        if (etapasML.size() <= 10){
            etapasML.add(etapa);
            System.out.println("Las etapas han sido agregadas con exito");
        }else {
            System.out.println("No se pueden agregar mas etapas, ");
        }
    }

    public void agregarEquipo(Equipo equipo){
        if (equiposML.size() <= 5){
            equiposML.add(equipo);
            System.out.println("Su equipo a sido agregado con exito");

        }else {
            System.out.println("No se pueden agregar mas equipos, " +
                    "ya se cumplio el maximo de quipos permitidos");
        }
    }

    public Competencia(String nombreML) {
        this.nombreML = nombreML;
        this.etapasML= new ArrayList<>();
    }

    public Competencia(List<Equipo> equiposML) {
        this.equiposML = equiposML;
    }

    public int getIdentificacionML() {
        return identificacionML;
    }

    public String getNombreML() {
        return nombreML;
    }

    public List<Etapa> getEtapasML() {
        return etapasML;
    }

    public List<Equipo> getEquiposML() {
        return equiposML;
    }
}
