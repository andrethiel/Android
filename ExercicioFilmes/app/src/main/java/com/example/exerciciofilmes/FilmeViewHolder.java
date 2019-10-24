package com.example.exerciciofilmes;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FilmeViewHolder extends RecyclerView.ViewHolder {

    TextView txtTitulo;
    TextView txtAno;
    TextView txtGenero;
    TextView txtDiretor;

    public FilmeViewHolder(@NonNull View itemView){
        super(itemView);

        txtTitulo = itemView.findViewById(R.id.txtTitulo);
        txtAno = itemView.findViewById(R.id.txtAno);
        txtGenero = itemView.findViewById(R.id.txtGenero);
        txtDiretor = itemView.findViewById(R.id.txtDiretor);
    }



}
