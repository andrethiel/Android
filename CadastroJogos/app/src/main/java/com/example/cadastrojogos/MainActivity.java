package com.example.cadastrojogos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    ListView listarJogos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        listarJogos = findViewById(R.id.listarJogos);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CadastroActivity.class));
            }
        });

        if(ListaJogos.getlista().size() == 0){
            ListaJogos.gerarLista();
        }

        ArrayAdapter<Jogo> adapter = new ArrayAdapter<Jogo>(
                MainActivity.this,
                android.R.layout.simple_list_item_1,
                ListaJogos.getlista()
        );
        listarJogos.setAdapter(adapter);



        listarJogos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
               Intent carregar = new Intent(MainActivity.this, DetalhesActivity.class);
               carregar.putExtra("index", position);
               startActivity(carregar);
            }
        });
    }
}
