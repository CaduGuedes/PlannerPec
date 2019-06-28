package com.example.caduguedes.plannerpecuaria;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListasDeAfazeres extends AppCompatActivity {

    //Declarando os itens
    private TextView tViewListaDeAfazeres;
    private Button btnVoltar;
    private Button btnNovaLista;
    private Button btnAbrirLista;
    private Button btnRemoverLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listas_afazeres);

        //Recuperando referencias
        tViewListaDeAfazeres = (TextView)findViewById(R.id.tViewListaDeAfazeres);
        btnVoltar            = (Button)findViewById(R.id.btnVoltar);
        btnNovaLista         = (Button)findViewById(R.id.btnNovaLista);
        btnAbrirLista        = (Button)findViewById(R.id.btnAbrirLista);
        btnRemoverLista      = (Button)findViewById(R.id.btnRemoverLista);




        //Metodos de Cliques dos botoes
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnVoltar);
                Intent intent = new Intent(ListasDeAfazeres.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }

    @SuppressLint("ResourceAsColor")
    public void mudaCorButton(Button btn){
        btn.setBackgroundResource(R.drawable.buttonshapeon);
        btn.setTextColor(R.color.white);
    }

}
