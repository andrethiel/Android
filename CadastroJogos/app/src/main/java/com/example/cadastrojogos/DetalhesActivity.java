package com.example.cadastrojogos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DetalhesActivity extends AppCompatActivity {

    TextView lblTitulo;
    TextView lblEstudio;
    TextView lblAno;
    TextView lblPlataforma;
    Button btnExcluir;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        lblTitulo = findViewById(R.id.lblTitulo);
        lblEstudio = findViewById(R.id.lblEstudio);
        lblAno = findViewById(R.id.lblAno);
        lblPlataforma = findViewById(R.id.lblPlataforma);
        btnExcluir = findViewById(R.id.btnExcluir);

        Intent carregar = getIntent();
        index = carregar.getIntExtra("index", -1);

        if(index == -1){
            Toast.makeText(this, "Erro", Toast.LENGTH_SHORT);
            startActivity(new Intent(DetalhesActivity.this, MainActivity.class));
        }else{
            Jogo j = ListaJogos.getJogos(index);
            lblTitulo.setText(j.getTitulo());
            lblEstudio.setText(j.getEstudio());
            lblAno.setText(String.valueOf(j.getAno()));
            lblPlataforma.setText(j.getPlataforma());

            btnExcluir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ListaJogos.exclui(index);
                    Toast.makeText(DetalhesActivity.this, "Excluido", Toast.LENGTH_SHORT);
                }
            });
        }


    }
}
