package com.example.cadastrotarefas;

import java.util.ArrayList;

public class ListaTarefas {

    private static ArrayList<Tarefas> listaTarefas = new ArrayList<>();

    public static void addTarefa(Tarefas t){
        listaTarefas.add(t);
    }
    public static Tarefas getTarefas(int index){
        return listaTarefas.get(index);
    }
    public static ArrayList<Tarefas> getLista() {
        return listaTarefas;
    }
}
