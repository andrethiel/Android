package com.example.cadastrotarefas;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

public class TarefasDAO {

    private DBGateway gateway;
    public TarefasDAO(Context context){
        gateway = DBGateway.getInstance(context);
    }
    public boolean salvarTarefa(Tarefas t){
        ContentValues values = new ContentValues();

        values.put(DBHelper.NOMETAREFA, t.getNomeTarefa());
        values.put(DBHelper.PRIORIDADE, t.getPrioridade());
        values.put(DBHelper.TEMPOESTIMADO, t.getTempoEstimado());

        long result = gateway.getDatabase().insert(
                DBHelper.TABELA, null, values);
        if(result > 0)
        {
            return true;
        }

        return false;
    }
    public void listaTarefas(){
        String sql = "SELECT * FROM " + DBHelper.TABELA;

        Cursor cursor = gateway.getDatabase().rawQuery(sql,null);

        try{
            cursor.moveToFirst();

            while(cursor != null)
            {
                int id = cursor.getInt(
                        cursor.getColumnIndex(DBHelper.ID));
                String nomeTarefa = cursor.getString(
                        cursor.getColumnIndex(DBHelper.NOMETAREFA));
                String Prioridade = cursor.getString(
                        cursor.getColumnIndex(DBHelper.PRIORIDADE));
                String tempoEstimado = cursor.getString(
                        cursor.getColumnIndex(DBHelper.TEMPOESTIMADO));

                Tarefas t = new Tarefas(id,nomeTarefa, Prioridade, tempoEstimado);

                ListaTarefas.addTarefa(t);

                cursor.moveToNext();
            }
            cursor.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean excluirTarefa(int id){

        String where = DBHelper.ID + " = ?";
        String[] args = {String.valueOf(id)};

        long result = gateway.getDatabase().delete(
                DBHelper.TABELA, where, args);

        if (result > 0){

            return true;
        }
        return false;
    }
}
