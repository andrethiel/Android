package com.example.cadastrotarefas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    RecyclerView rclTarefas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        rclTarefas = findViewById(R.id.rclTarefas);

        if(ListaTarefas.getLista().size() > 0){
            ListaTarefas.getLista().clear();
        }

        TarefasDAO dao = new TarefasDAO(MainActivity.this);

        try{
            dao.listaTarefas();
        }
        catch(Exception e){

            e.printStackTrace();
        }



        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Cadastro.class));
            }
        });

    }
}
