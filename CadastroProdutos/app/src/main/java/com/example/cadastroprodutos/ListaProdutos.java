package com.example.cadastroprodutos;

import java.util.ArrayList;

public class ListaProdutos {

    private static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public static void addProduto(Produto p){
        listaProdutos.add(p);
    }
    public static Produto getProduto(int index){
        return listaProdutos.get(index);
    }
    public static ArrayList<Produto> getLista(){
        return listaProdutos;
    }
}
