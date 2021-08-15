package com.projetoutfpr.reab;

public class ListaPlantas {
    private String especie;
    private String genero;
    private String familia;
    public ListaPlantas() {}
    public ListaPlantas(String especie, String genero, String familia) {
        this.especie = especie;
        this.genero = genero;
        this.familia = familia;
    }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getFamilia() { return familia; }
    public void setFamilia(String familia) { this.familia = familia; }
}
