package com.example.exerciciofilmes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmeAdapter extends RecyclerView.Adapter {

    private ArrayList<Filme> ListaFilmes;

    private Context context;

    public FilmeAdapter(ArrayList<Filme> listaFilmes, Context context){
        this.ListaFilmes = listaFilmes;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.celula_filme, parent, false);
        FilmeViewHolder filmeViewHolder = new FilmeViewHolder(view);

        return filmeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        FilmeViewHolder filmeViewHolder = (FilmeViewHolder)holder;

        filmeViewHolder.txtTitulo.setText(ListaFilmes.get(position).getTitulo());
        filmeViewHolder.txtAno.setText(ListaFilmes.get(position).getAno());
        filmeViewHolder.txtGenero.setText(ListaFilmes.get(position).getGenero());
        filmeViewHolder.txtDiretor.setText(ListaFilmes.get(position).getDiretor());
    }

    @Override
    public int getItemCount() {
        return ListaFilmes.size();
    }
}
