package com.example.harol.rodandoosdados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button botao;
    private static Random rand = new Random();
    private  ImageView dado;
    private int resultado;
    private  TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dado = findViewById(R.id.dado);
        texto = findViewById(R.id.resultado);
        botao = findViewById(R.id.botao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado();
            }
        });

    }

    private void resultado (){
        this.resultado = rand.nextInt(6) +1;
        imprimirResultado(resultado);

    }

    private void imprimirResultado(int res){
        texto.setText("O resultado foi "+res);
        switch (res){
            case 1:
                dado.setImageResource(R.drawable.dice1);
                break;
            case 2:
                dado.setImageResource(R.drawable.dice2);
                break;
            case 3:
                dado.setImageResource(R.drawable.dice3);
                break;
            case 4:
                dado.setImageResource(R.drawable.dice4);
                break;
            case 5:
                dado.setImageResource(R.drawable.dice5);
                break;
            case 6:
                dado.setImageResource(R.drawable.dice6);
                break;
        }

    }
}
