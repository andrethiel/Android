package com.example.cadastroprodutos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DBGateway {

    private static DBGateway gateway;
    private SQLiteDatabase db;

    public DBGateway(Context context){
        DBHelper helper = new DBHelper(context);

        db = helper.getWritableDatabase();
    }
    public static DBGateway getInstance(Context context){
        if(gateway == null){
            gateway = new DBGateway(context);
        }
        return gateway;
    }
    public SQLiteDatabase getDataBase(){
        return this.db;
    }
}
