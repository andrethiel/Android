package com.example.cadastroprodutos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB = "db_produtos";
    public static final String TABELA = "tb_produtos";

    public static final String ID = "id";
    public static final String PRODUTO = "produtos";
    public static final String MARCA = "marca";
    public static final String QUANTIDADE = "quantidade";
    public static final int VERSAO = 1;

    public DBHelper(@Nullable Context context){
        super(context, DB, null, VERSAO);
    }

    public void onCreate(SQLiteDatabase db){
        String sql = "CREATE TABLE IF NOT EXISTS " + TABELA + " (" +
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PRODUTO + " VARCHAR, " +
                MARCA + " VARCHAR, " +
                QUANTIDADE + " VARCHAR); ";

        db.execSQL(sql);
    }

    public void  onUpgrade(SQLiteDatabase db, int oldVersion, int wVneersion){
        db.execSQL("DROP TABLE " + TABELA);
        onCreate(db);
    }
}
