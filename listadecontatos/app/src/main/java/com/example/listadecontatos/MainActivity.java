package com.example.listadecontatos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button btnAdd;
    RecyclerView rclContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        rclContato = findViewById(R.id.rclContatos);

        if(Listacontatos.getLista().size() == 0){
            Listacontatos.geraLista();
        }

        ContatoAdapter contatoAdapter = new ContatoAdapter(Listacontatos.getLista(), MainActivity.this);

        rclContato.setAdapter(contatoAdapter);

        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(MainActivity.this, RecyclerView.VERTICAL,
                false);

        rclContato.setLayoutManager(meuLayout);
    }
}
