package com.projetoutfpr.reab;

public class Morfologia {
    private String morfo;
    private int imagem;
    public Morfologia() { }
    public Morfologia(String morfo, int imagem) { this.morfo = morfo;this.imagem = imagem;}
    public String getMorfo() { return morfo; }
    public void setMorfo(String morfo) { this.morfo = morfo; }
    public int getImagem() { return imagem; }
    public void setImagem(int imagem) { this.imagem = imagem; }
}
