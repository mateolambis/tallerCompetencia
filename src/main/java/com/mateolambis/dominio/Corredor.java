package com.mateolambis.dominio;

public class Corredor {
    private String nombreML;
    private int numeroCompetenciaML;
    private String generoML;
    private int edadML;

    public Corredor(String nombreML, int numeroCompetenciaML, String generoML, int edadML) {
        this.nombreML = nombreML;
        this.numeroCompetenciaML = numeroCompetenciaML;
        this.generoML = generoML;
        this.edadML = edadML;
    }

    public String getNombre() {
        return nombreML;
    }

    public int getNumeroCompetencia() {
        return numeroCompetenciaML;
    }

    public String getGenero() {
        return generoML;
    }

    public int getEdad() {
        return edadML;
    }

    public void setNumeroCompetencia(int numeroCompetencia) {
        this.numeroCompetenciaML = numeroCompetencia;
    }
}
