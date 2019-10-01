package com.example.cadastrojogos;

public class Jogo {
    private String titulo;
    private String estudio;
    private int ano;
    private String plataforma;

    public Jogo(String titulo, String estudio, int ano, String plataforma) {
        this.titulo = titulo;
        this.estudio = estudio;
        this.ano = ano;
        this.plataforma = plataforma;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String tostring(){
        return "Titulo" + this.titulo;
    }
}

