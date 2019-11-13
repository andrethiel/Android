package com.example.cadastrotarefas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBGateway {
    private static DBGateway gateway;

    private SQLiteDatabase db;

    public DBGateway(Context context) {

        DBHelper
        DBHelper helper = new DBHelper(context);
        db = helper.getWritableDatabase();
    }
}
