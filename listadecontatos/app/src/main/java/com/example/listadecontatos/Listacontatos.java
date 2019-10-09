package com.example.listadecontatos;

import android.widget.ListView;

import java.util.ArrayList;

public class Listacontatos {

    private static ArrayList<Contato> ListaContato = new ArrayList<>();

    public void addContato(Contato c){
        ListaContato.add(c);
    }
    public static ArrayList<Contato> getLista(){
        return ListaContato;
    }
    public static Contato getContato(int index){
        return ListaContato.get(index);
    }

    public static void geraLista(){
        ListaContato.add(new Contato("Joao da Silva", "41411414144", "jajjjaja@jajaj.com"));
        ListaContato.add(new Contato("Joao da Silva", "41411414144", "jajjjaja@jajaj.com"));
        ListaContato.add(new Contato("Joao da Silva", "41411414144", "jajjjaja@jajaj.com"));
        ListaContato.add(new Contato("Joao da Silva", "41411414144", "jajjjaja@jajaj.com"));
        ListaContato.add(new Contato("Joao da Silva", "41411414144", "jajjjaja@jajaj.com"));

    }
}
