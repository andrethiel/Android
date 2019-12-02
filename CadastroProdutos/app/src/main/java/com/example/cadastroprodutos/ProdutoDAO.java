package com.example.cadastroprodutos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class ProdutoDAO {

    private DBGateway gateway;

    public ProdutoDAO(Context context){
        this.gateway = DBGateway.getInstance(context);
    }

    public boolean salvaTarefa(Produto p){

        ContentValues values = new ContentValues();

        values.put(DBHelper.PRODUTO, p.getProduto());
        values.put(DBHelper.MARCA, p.getMarca());
        values.put(DBHelper.QUANTIDADE, p.getQuantidade());

        long result = 0;

        try{
            result = gateway.getDataBase().insert(DBHelper.TABELA, null, values);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        if(result > 0){
            return true;
        }
        return false;
    }
    public void getProdutos(){
        String sql = "SELECT * FROM " + DBHelper.TABELA;

        try{
            Cursor cursor = gateway.getDataBase().rawQuery(sql, null);

            cursor.moveToFirst();
            while (cursor != null){
                int id = cursor.getInt(cursor.getColumnIndex(DBHelper.ID));
                String produto = cursor.getString(cursor.getColumnIndex(DBHelper.PRODUTO));
                String marca = cursor.getString(cursor.getColumnIndex(DBHelper.MARCA));
                String quantidade = cursor.getString(cursor.getColumnIndex(DBHelper.QUANTIDADE));

                Produto p = new Produto(id, produto, marca, quantidade);

                ListaProdutos.addProduto(p);
                cursor.moveToNext();
            }
            cursor.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public boolean excluirProduto(int id){
        String where = DBHelper.ID + " = ?";
        String[] args = {String.valueOf(id)};

        long result = gateway.getDataBase().delete(DBHelper.TABELA, where, args);

        if(result > 0){
            return true;
        }
        return false;
    }
    public boolean editarProduto(Produto p){
        String where = DBHelper.ID + " = ?";
        String[] args = {String.valueOf(p.getId())};

        ContentValues values = new ContentValues();

        values.put(DBHelper.PRODUTO, p.getProduto());
        values.put(DBHelper.MARCA, p.getMarca());
        values.put(DBHelper.QUANTIDADE, p.getQuantidade());

        long result = gateway.getDataBase().update(DBHelper.TABELA, values, where, args);

        if(result >= 0){
            return true;
        }
        return false;

    }
}
