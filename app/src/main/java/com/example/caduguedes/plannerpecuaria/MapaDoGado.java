package com.example.caduguedes.plannerpecuaria;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MapaDoGado extends AppCompatActivity {

    //Declarando
    private TextView tViewMapaDoGado;
    private Button btnNovoMapa;
    private Button btnAbrirMapa;
    private Button btnRemoverMapa;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_do_gado);

        //Recuperando referências
        tViewMapaDoGado = (TextView)findViewById(R.id.tViewMapaDoGado);
        btnNovoMapa     = (Button)findViewById(R.id.btnNovoMapa);
        btnAbrirMapa     = (Button)findViewById(R.id.btnAbrirMapa);
        btnRemoverMapa     = (Button)findViewById(R.id.btnRemoverMapa);
        btnVoltar     = (Button)findViewById(R.id.btnVoltar);


        //Metodos

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnVoltar);
                Intent intent = new Intent(MapaDoGado.this, MainActivity.class);
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
