package com.example.caduguedes.plannerpecuaria;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //Declarando os itens
    private ImageView imgViewPlanner;
    private Button btnLista;
    private Button btnManejo;
    private Button btnMapaDoGado;
    private Button btnDesmama;
    private Button btnChuva;
    private Button btnSal;
    private Button btnVendas;
    private Button btnFinanceiro;


    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        //Recueperando Referencias dos itens
        imgViewPlanner   = (ImageView)findViewById(R.id.imgViewPlanner);
        btnLista         = (Button)findViewById(R.id.btnLista);
        btnManejo        = (Button)findViewById(R.id.btnManejo);
        btnMapaDoGado    = (Button)findViewById(R.id.btnMapaDoGado);
        btnDesmama       = (Button)findViewById(R.id.btnDesmama);
        btnChuva         = (Button)findViewById(R.id.btnChuva);
        btnSal           = (Button)findViewById(R.id.btnSal);
        btnVendas        = (Button)findViewById(R.id.btnVendas);
        btnFinanceiro    = (Button)findViewById(R.id.btnFinanceiro);


        //Metodos de Cliques dos Botoes
        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnLista);
                Intent intent = new Intent(MainActivity.this, ListasDeAfazeres.class);
                startActivity(intent);
                finish();
            }
        });

        btnManejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnManejo);
                Intent intent = new Intent(MainActivity.this, ManejoDoGado.class);
                startActivity(intent);
                finish();
            }
        });

        btnMapaDoGado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnMapaDoGado);
                Intent intent = new Intent(MainActivity.this, MapaDoGado.class);
                startActivity(intent);
                finish();
            }
        });

        btnDesmama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnDesmama);
                Intent intent = new Intent(MainActivity.this, ListaDeDesmama.class);
                startActivity(intent);
                finish();
            }
        });

        btnChuva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnChuva);
            }
        });

        btnSal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnSal);
            }
        });

        btnVendas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnVendas);
            }
        });

        btnFinanceiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnFinanceiro);
            }
        });

    }





    @SuppressLint("ResourceAsColor")
    public void mudaCorButton(Button btn){
        btn.setBackgroundResource(R.drawable.buttonshapeon);
        btn.setTextColor(R.color.white);
    }

}
