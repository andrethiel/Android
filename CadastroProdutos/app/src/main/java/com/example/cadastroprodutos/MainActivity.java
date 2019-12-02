package com.example.cadastroprodutos;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    RecyclerView rclProdutos;
    Button btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rclProdutos = findViewById(R.id.rclProdutos);
        btnCadastrar = findViewById(R.id.btnCadastrar);


        if(ListaProdutos.getLista().size() >0)
        {
            ListaProdutos.getLista().clear();
        }

        ProdutoDAO dao = new ProdutoDAO(MainActivity.this);

        try{
            dao.getProdutos();
        }catch (Exception ex){
            ex.printStackTrace();
        }

        ProdutoAdapter meuAdapter = new ProdutoAdapter(MainActivity.this, ListaProdutos.getLista());
        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);

        rclProdutos.setAdapter(meuAdapter);
        rclProdutos.setLayoutManager(meuLayout);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Cadastro.class));
            }
        });
    }
}
