package com.example.calculadoramelhorada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView txtResultado;

    String TextoVisor;
    float valorAtual = 0;
    float valorAnterior = 0;
    String op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);

    }
    public void btnNumero(View view){

        Button Numeros = (Button)view;

        String numero = Numeros.getText().toString();

        if(!op.isEmpty()){
            txtResultado.setText("");
        }else {
            TextoVisor = txtResultado.getText().toString();
            if (TextoVisor.equals("0") || TextoVisor.isEmpty()) {
                TextoVisor = numero;
            } else {
                TextoVisor += numero;
            }
        }

        txtResultado.setText(TextoVisor);

        valorAtual = Float.parseFloat(TextoVisor);
    }
    public void apagar(View view){
        txtResultado.setText("0");
        valorAtual = 0;
        valorAnterior = 0;
    }
    public void btnOperacao(View view){
        Button btnOp = (Button)view;

        switch (btnOp.getId()){
            case R.id.buttonMais:
                if(valorAnterior == 0){
                    valorAnterior = valorAtual;
                }else{
                    valorAnterior += valorAtual;
                    txtResultado.setText(String.valueOf(valorAnterior));
                }
                op = "Mais";
                break;

            case R.id.buttonDivide:
                break;

            case R.id.buttonMenos:
                break;

            case R.id.buttonVeses:
                break;
            case  R.id.buttonIgual:
                float result;
                if(op.equals("Mais")){
                    result = valorAnterior;
                    valorAnterior = 0;
                    valorAtual = 0;
                    txtResultado.setText(String.valueOf(result));
                }
                op ="";
                break;
        }
    }

}
