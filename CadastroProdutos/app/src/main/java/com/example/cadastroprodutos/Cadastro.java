package com.example.cadastroprodutos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    EditText edtProduto;
    EditText edtMarca;
    EditText edtQuantidade;
    Button btnSalvar;
    TextView txtCad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        edtProduto = findViewById(R.id.edtProduto);
        edtMarca = findViewById(R.id.edtMarca);
        edtQuantidade = findViewById(R.id.edtQuantidade);
        btnSalvar = findViewById(R.id.btnSalvar);
        txtCad = findViewById(R.id.txtCad);

        txtCad.setText("Novo Produto");

        Intent intent = getIntent();
        final int index = intent.getIntExtra("index", -1);

        if(index != -1) {
            txtCad.setText("Editar Produto");

            Produto p = ListaProdutos.getProduto(index);

            edtProduto.setText(p.getProduto());
            edtMarca.setText(p.getMarca());
            edtQuantidade.setText(p.getQuantidade());
        }

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String produto = edtProduto.getText().toString();
                String marca = edtMarca.getText().toString();
                String quantidade = edtQuantidade.getText().toString();


                Produto p = new Produto(0, produto, marca, quantidade);

                ProdutoDAO dao = new ProdutoDAO(Cadastro.this);

                if (index != -1) {
                    int id = ListaProdutos.getProduto(index).getId();
                    p.setId(id);

                    if (dao.editarProduto(p)) {
                        Toast.makeText(Cadastro.this, "Produto editado com sucesso!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Cadastro.this, MainActivity.class));
                    } else {
                        Toast.makeText(Cadastro.this, "Erro ao editar Produto...", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Cadastro.this, MainActivity.class));
                    }
                }else{
                    if (dao.salvaTarefa(p)) {
                        Toast.makeText(Cadastro.this, "Produto cadastrada com sucesso!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Cadastro.this, MainActivity.class));
                    } else {
                        Toast.makeText(Cadastro.this, "Erro ao cadastrar Produto...", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Cadastro.this, MainActivity.class));
                    }
                }
            }
        });
    }
}
