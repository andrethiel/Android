package com.example.cadastrotarefas;

import android.content.Context;

public class TarefasDAO {

    private DBGateway gateway;
    public TarefasDAO(Context context){
        gateway = DBGateway.getInstance(context);
    }
    
}
