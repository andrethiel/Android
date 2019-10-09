package com.example.listadecontatos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContatoAdapter extends RecyclerView.Adapter {

    private ArrayList<Contato> listaContatos;

    private Context context;

    public ContatoAdapter(ArrayList<Contato> listaContatos, Context context) {
        this.listaContatos = listaContatos;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.celula, viewGroup, false);

        ContatoViewHolder contatoViewHolder = new ContatoViewHolder(view);


        return contatoViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int i) {

        ContatoViewHolder contatoViewHolder = (ContatoViewHolder)holder;

        contatoViewHolder.txtnome.setText(listaContatos.get(i).getNome());
        contatoViewHolder.txtemail.setText(listaContatos.get(i).getEmail());
        contatoViewHolder.txtfone.setText(listaContatos.get(i).getFone());

    }

    @Override
    public int getItemCount() {
        return listaContatos.size();
    }
}
