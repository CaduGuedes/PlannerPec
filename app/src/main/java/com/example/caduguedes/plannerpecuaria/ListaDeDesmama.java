package com.example.caduguedes.plannerpecuaria;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListaDeDesmama extends AppCompatActivity {

    //Declarando
    private TextView tViewListaDeDesmama;
    private Button btnNovaListaDesmama;
    private Button btnAbrirListaDesmama;
    private Button btnRemoverListaDesmama;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_de_desmama);

        //Recuperando Referencias
        tViewListaDeDesmama = (TextView)findViewById(R.id.tViewListaDeDesmama);
        btnNovaListaDesmama = (Button)findViewById(R.id.btnNovaListaDesmama);
        btnAbrirListaDesmama = (Button)findViewById(R.id.btnAbrirListaDesmama);
        btnRemoverListaDesmama = (Button)findViewById(R.id.btnRemoverListaDesmama);
        btnVoltar = (Button)findViewById(R.id.btnVoltar);

        //Métodos

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mudaCorButton(btnVoltar);
                Intent intent = new Intent(ListaDeDesmama.this, MainActivity.class);
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
