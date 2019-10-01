package com.example.cadastrojogos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    ListView listaJogos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        listaJogos = findViewById(R.id.listaJogos);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CadastroActivity.class));
            }
        });

        ArrayAdapter<Jogo> adapter = new ArrayAdapter<Jogo>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                ListaJogos.getlista()
        );
        listaJogos.setAdapter(adapter);
    }
}
