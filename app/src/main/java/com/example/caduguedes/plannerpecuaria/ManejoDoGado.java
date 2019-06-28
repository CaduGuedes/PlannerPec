package com.example.caduguedes.plannerpecuaria;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;

public class ManejoDoGado extends AppCompatActivity {

    //Declarando
    private TextView tViewManejoDoGado;
    private Button btnNovoManejo;
    private Button btnAbrirManejo;
    private Button btnRemoverManejo;
    private Button btnVoltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manejo_do_gado);

        //Recuperando Referencias

        tViewManejoDoGado = (TextView)findViewById(R.id.tViewListaDeAfazeres);
        btnNovoManejo     = (Button)findViewById(R.id.btnNovoManejo);
        btnAbrirManejo     = (Button)findViewById(R.id.btnAbrirManejo);
        btnRemoverManejo     = (Button)findViewById(R.id.btnRemoverManejo);
        btnVoltar     = (Button)findViewById(R.id.btnVoltar);

        //Métodos

        btnNovoManejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnNovoManejo);
                Intent intent = new Intent(ManejoDoGado.this, NovoManejo.class);
                startActivity(intent);
                finish();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnVoltar);
                Intent intent = new Intent(ManejoDoGado.this, MainActivity.class);
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
