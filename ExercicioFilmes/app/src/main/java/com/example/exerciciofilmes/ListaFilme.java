package com.example.exerciciofilmes;

import java.util.ArrayList;

public class ListaFilme {

    private static ArrayList<Filme> ListaFilmes = new ArrayList<>();

    public static void addFilme(Filme f){

        ListaFilmes.add(f);
    }

    public static ArrayList<Filme> getLista(){
        return ListaFilmes;
    }
    public static Filme getFilme(int index){
        return ListaFilmes.get(index);
    }
    public static void geraLista(){
        ListaFilmes.add(new Filme("Sempre ao seu lado", "2002", "Drama", "Alex" ));
        ListaFilmes.add(new Filme("Sempre ao seu lado", "2002", "Drama", "Alex" ));
        ListaFilmes.add(new Filme("Sempre ao seu lado", "2002", "Drama", "Alex" ));
        ListaFilmes.add(new Filme("Sempre ao seu lado", "2002", "Drama", "Alex" ));
    }


}
