package com.example.cadastroprodutos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Detalhes extends AppCompatActivity {

    TextView txtVerProduto;
    TextView txtVerMarca;
    TextView txtVerQuantidade;
    Button btnConcluir;
    Button btnEditar;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        txtVerProduto = findViewById(R.id.txtVerProduto);
        txtVerMarca = findViewById(R.id.txtVerMarca);
        txtVerQuantidade = findViewById(R.id.txtVerQuantidade);
        btnConcluir = findViewById(R.id.btnConcluir);
        btnEditar = findViewById(R.id.btnEditar);

        Intent detalhes = getIntent();
        final int index = detalhes.getIntExtra("index", -1);

        if(index == -1){
            Toast.makeText(this, "Não foi possível carregar detalhes do produto...", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, MainActivity.class));
        }else{
            Produto p = ListaProdutos.getProduto(index);

            txtVerProduto.setText("Produto: " + p.getProduto());
            txtVerMarca.setText("Marca: " + p.getMarca());
            txtVerQuantidade.setText("Quantidade: " + p.getQuantidade());
            id = p.getId();

            btnEditar.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent editar = new Intent(Detalhes.this, Cadastro.class);
                    editar.putExtra("index", index);
                    startActivity(editar);
                }
            });

            btnConcluir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ProdutoDAO dao = new ProdutoDAO(Detalhes.this);

                    if(dao.excluirProduto(id)){
                        Toast.makeText(Detalhes.this, "Produto excluido", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Detalhes.this, MainActivity.class));
                    }else{
                        Toast.makeText(Detalhes.this, "Não foi possível excluir o produto", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }
    }
}
