package com.example.cadastrojogos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    EditText txtnome;
    EditText txtestudio;
    EditText txtano;
    EditText txtplataforma;
    Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        txtnome = findViewById(R.id.txtnome);
        txtestudio = findViewById(R.id.txtestudio);
        txtano = findViewById(R.id.txtano);
        txtplataforma = findViewById(R.id.txtplataforma);

       btnAdd.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               try{
                   String nome = txtnome.getText().toString();
                   String estudio = txtestudio.getText().toString();
                   int ano = Integer.parseInt(txtano.getText().toString());
                   String plataforma = txtplataforma.getText().toString();

                   Jogo j = new Jogo(nome, estudio, ano, plataforma);
                   ListaJogos.addJogo(j);
                   Toast.makeText(CadastroActivity.this, "jogo cadastrado", Toast.LENGTH_SHORT);
                   startActivity(new Intent(CadastroActivity.this, MainActivity.class));

               }catch (Exception ex){
                   Toast.makeText(CadastroActivity.this, "Todos os campos sao Obrigatorios" , Toast.LENGTH_SHORT);
               }
           }
       });
    }
}
