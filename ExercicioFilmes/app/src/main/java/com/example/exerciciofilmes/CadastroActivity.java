package com.example.exerciciofilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    EditText edtFilme;
    EditText edtAno;
    EditText edtGenero;
    EditText edtDiretor;
    Button btnSalvar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtFilme = findViewById(R.id.edtFilme);
        edtAno = findViewById(R.id.edtAno);
        edtGenero = findViewById(R.id.edtGenero);
        edtDiretor = findViewById(R.id.edtDiretor);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String filme = edtFilme.getText().toString();
                    String ano = edtAno.getText().toString();
                    String genero = edtGenero.getText().toString();
                    String direto = edtDiretor.getText().toString();

                    Filme f = new Filme(filme, ano, genero, direto);
                    ListaFilme.addFilme(f);
                    Toast.makeText(CadastroActivity.this, "Filme Salvo com sucesso!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(CadastroActivity.this, MainActivity.class));
                }
                catch (Exception ex) {
                    Toast.makeText(CadastroActivity.this, "Erro ao cadastrar Filme...", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
