package com.example.cadastrojogos;

import java.util.ArrayList;

public class ListaJogos {

    private static ArrayList<Jogo> listaJogos = new ArrayList<>();

    public static void addJogo(){
        listaJogos.add(j);
    }
    public static ArrayList<Jogo> getlista(){
        return listaJogos;
    }
    public static Jogo getJogos(int index){
        return listaJogos.get(index);
    }
}
