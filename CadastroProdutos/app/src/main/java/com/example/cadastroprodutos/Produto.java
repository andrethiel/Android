package com.example.cadastroprodutos;

public class Produto {

    private int id;
    private String produto;
    private String marca;
    private String quantidade;

    public Produto(int id, String produto, String marca, String quantidade) {
        this.id = id;
        this.produto = produto;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
}
