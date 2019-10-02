package com.example.cadastrojogos;

import java.util.ArrayList;

public class ListaJogos {

    private static ArrayList<Jogo> listaJogos = new ArrayList<>();

    public static void addJogo(Jogo j){
        listaJogos.add(j);
    }
    public static ArrayList<Jogo> getlista(){

        return listaJogos;
    }
    public static Jogo getJogos(int index){

        return listaJogos.get(index);
    }

    public static void exclui(int index){
        listaJogos.remove(index);
    }

    public  static void gerarLista(){
        listaJogos.add(new Jogo("Call of Duty", "Activision", 2011, "PC"));
        listaJogos.add(new Jogo("The Sims", "Ea games", 2011, "PC"));
        listaJogos.add(new Jogo("Need For Speed", "Activision", 2011, "PC"));

    }
}
