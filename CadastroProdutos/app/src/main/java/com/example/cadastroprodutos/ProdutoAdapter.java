package com.example.cadastroprodutos;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProdutoAdapter extends RecyclerView.Adapter {

    private Context context;
    private ArrayList<Produto> listaProdutos;

    public ProdutoAdapter(Context context, ArrayList<Produto> listaProdutos){
        this.context = context;
        this.listaProdutos = listaProdutos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){

        View view = LayoutInflater.from(context).inflate(R.layout.celula_produto, parent, false);

        ProdutoHolder holder = new ProdutoHolder(view);

        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position){

        ProdutoHolder tHolder =(ProdutoHolder)holder;

        String produto = listaProdutos.get(position).getProduto();
        String marca = listaProdutos.get(position).getMarca();
        String quantidade = listaProdutos.get(position).getQuantidade();

        tHolder.txtProduto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detalhes = new Intent(context, Detalhes.class);

                detalhes.putExtra("index", position);

                detalhes.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                context.startActivity(detalhes);
            }
        });
    }

    @Override
    public int getItemCount(){
        return listaProdutos.size();
    }
}
