package com.example.cadastrotarefas;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB = "tarefas_db"; // nome do seu banco
    public static final String TABELA = "tarefas";

    public static final String ID = "id_tarefa";
    public static final String NOMETAREFA = "nomeTarefa";
    public static final String PRIORIDADE = "prioridade";
    public static final String TEMPOESTIMADO = "tempoEstimado";
    public static final int VERSAO = 1;

    public DBHelper(@Nullable Context context) {
        super(context, DB, null, VERSAO);
    }
}
