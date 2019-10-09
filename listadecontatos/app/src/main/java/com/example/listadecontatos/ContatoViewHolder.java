package com.example.listadecontatos;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContatoViewHolder extends RecyclerView.ViewHolder {

    TextView txtnome;
    TextView txtfone;
    TextView txtemail;

    public ContatoViewHolder(@NonNull View itemView){
        super(itemView);

        txtnome = itemView.findViewById(R.id.txtnome);
        txtfone = itemView.findViewById(R.id.txtfone);
        txtemail = itemView.findViewById(R.id.txtemail);
    }


}
