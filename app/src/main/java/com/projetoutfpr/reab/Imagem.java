package com.projetoutfpr.reab;

public class Imagem {
    private String nome;
    private String localidade;
    private String comentario;
    private int imagem;
    public Imagem() { }
    public Imagem(String nome, String localidade, String comentario, int imagem) {
        this.nome = nome;
        this.localidade = localidade;
        this.comentario = comentario;
        this.imagem = imagem; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getLocalidade() { return localidade; }
    public void setLocalidade(String localidade) { this.localidade = localidade; }
    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
    public int getImagem() { return imagem; }
    public void setImagem(int imagem) { this.imagem = imagem; }
}
