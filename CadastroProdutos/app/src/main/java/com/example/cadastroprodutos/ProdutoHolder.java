package com.example.cadastroprodutos;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProdutoHolder extends RecyclerView.ViewHolder {

    TextView txtProduto ;
    TextView txtNome;

    public ProdutoHolder(@NonNull View itemView){
        super(itemView);

        txtProduto = itemView.findViewById(R.id.txtProduto);
        txtNome = itemView.findViewById(R.id.txtNome);
    }
}
