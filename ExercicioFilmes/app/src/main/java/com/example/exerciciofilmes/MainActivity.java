package com.example.exerciciofilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;

    RecyclerView rclFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);

        rclFilmes = findViewById(R.id.rclFilmes);

        if(ListaFilme.getLista().size() == 0){
            ListaFilme.geraLista();
        }

        FilmeAdapter filmeAdapter = new FilmeAdapter(
                ListaFilme.getLista(),
                MainActivity.this
        );
        rclFilmes.setAdapter(filmeAdapter);

        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(
                MainActivity.this,
                RecyclerView.VERTICAL,
                false
        );

        rclFilmes.setLayoutManager(meuLayout);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CadastroActivity.class));
            }
        });
    }
}
