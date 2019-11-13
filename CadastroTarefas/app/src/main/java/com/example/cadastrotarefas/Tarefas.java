package com.example.cadastrotarefas;

public class Tarefas {

    private int id;
    private String nomeTarefa;
    private String Prioridade;
    private String tempoEstimado;

    public Tarefas(int id, String nomeTarefa, String prioridade, String tempoEstimado) {
        this.id = id;
        this.nomeTarefa = nomeTarefa;
        Prioridade = prioridade;
        this.tempoEstimado = tempoEstimado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public String getPrioridade() {
        return Prioridade;
    }

    public void setPrioridade(String prioridade) {
        Prioridade = prioridade;
    }

    public String getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(String tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }
}
