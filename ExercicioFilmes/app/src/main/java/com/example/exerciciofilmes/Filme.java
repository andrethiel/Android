package com.example.exerciciofilmes;

public class Filme {

    private String Titulo;
    private String Ano;
    private String Genero;
    private String Diretor;

    public Filme(String titulo, String ano, String genero, String diretor) {
        Titulo = titulo;
        Ano = ano;
        Genero = genero;
        Diretor = diretor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String ano) {
        Ano = ano;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getDiretor() {
        return Diretor;
    }

    public void setDiretor(String diretor) {
        Diretor = diretor;
    }
}
