package com.example.cadastrotarefas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {

    EditText txtTarefa;
    EditText txtPrioridade;
    EditText txtTempoEstimado;
    Button btnSalvar;

    String nomeTarefa;
    String Prioridade;
    String tempoestimado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        txtTarefa = findViewById(R.id.txtTarefa);
        txtPrioridade = findViewById(R.id.txtPrioridade);
        txtTempoEstimado = findViewById(R.id.txtTempoEstimado);
        btnSalvar = findViewById(R.id.btnSalvar);


    }
}
