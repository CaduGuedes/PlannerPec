package com.example.caduguedes.plannerpecuaria;

import android.graphics.MaskFilter;
import android.icu.text.DateIntervalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class NovoManejo extends AppCompatActivity {

    private EditText edtDataManejo;
    private EditText edtPastoManejo;
    private EditText edtQntTourosManejo;
    private EditText edtQntVacasManejo;
    private EditText edtQntBezMachoManejo;
    private EditText edtQntBezFemeaManejo;
    private EditText edtQntNovilhasC5;
    private EditText edtQntNovilhasC6;
    private EditText edtQntNovilhasC7;
    private EditText edtQntGarroteC5;
    private EditText edtQntGarroteC6;
    private EditText edtQntGarroteC7;
    private EditText edtQntMortesManejo;
    private TextView edtQntTotalManejo;
    private Button btnDescartarManejo;
    private Button btnSalvarManejo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_manejo);

        //Recuperando Referências
        edtDataManejo           = (EditText)findViewById(R.id.edtDataManejo);
        edtPastoManejo          = (EditText)findViewById(R.id.edtPastoManejo);
        edtQntTourosManejo      = (EditText)findViewById(R.id.edtQntTourosManejo);
        edtQntVacasManejo       = (EditText)findViewById(R.id.edtQntVacasManejo);
        edtQntBezMachoManejo    = (EditText)findViewById(R.id.edtQntBezMachoManejo);
        edtQntBezFemeaManejo    = (EditText)findViewById(R.id.edtQntBezFemeaManejo);
        edtQntNovilhasC5        = (EditText)findViewById(R.id.edtQntNovilhasC5);
        edtQntNovilhasC6        = (EditText)findViewById(R.id.edtQntNovilhasC6);
        edtQntNovilhasC7        = (EditText)findViewById(R.id.edtQntNovilhasC7);
        edtQntGarroteC5         = (EditText)findViewById(R.id.edtQntGarroteC5);
        edtQntGarroteC6         = (EditText)findViewById(R.id.edtQntGarroteC6);
        edtQntGarroteC7         = (EditText)findViewById(R.id.edtQntGarroteC7);
        edtQntMortesManejo      = (EditText)findViewById(R.id.edtQntMortesManejo);
        edtQntTotalManejo       = (TextView)findViewById(R.id.edtQntTotalManejo);
        btnDescartarManejo      = (Button)findViewById(R.id.btnDescartarManejo);
        btnSalvarManejo         = (Button)findViewById(R.id.btnSalvarManejo);


        //metodos






    }



    /*
    private void soma() {
        Double touros = Double.parseDouble(edtQntTourosManejo.toString());
        Double vacas = Double.parseDouble(edtQntVacasManejo.toString());
        Double bezMacho = Double.parseDouble(edtQntBezMachoManejo.toString());
        Double bezFemea = Double.parseDouble(edtQntBezFemeaManejo.toString());
        Double novilhaC5 = Double.parseDouble(edtQntNovilhasC5.toString());
        Double novilhaC6 = Double.parseDouble(edtQntNovilhasC6.toString());
        Double novilhaC7 = Double.parseDouble(edtQntNovilhasC7.toString());
        Double garrotec5 = Double.parseDouble(edtQntGarroteC5.toString());
        Double garrotec6 = Double.parseDouble(edtQntGarroteC6.toString());
        Double garrotec7 = Double.parseDouble(edtQntGarroteC7.toString());
        Double mortes = Double.parseDouble(edtQntMortesManejo.toString());


        Double res = touros + vacas + bezMacho + bezFemea
                + novilhaC5 + novilhaC6 + novilhaC7
                + garrotec5 + garrotec6 + garrotec7 - mortes;

        edtQntTotalManejo.setText(String.valueOf(res));
    }*/


       /* edtQntTotalManejo.setText(String.valueOf(edtQntTourosManejo + edtQntVacasManejo + edtQntBezMachoManejo + edtQntBezFemeaManejo
                + edtQntNovilhasC5 + edtQntNovilhasC6 + edtQntNovilhasC7
                + edtQntGarroteC5 + edtQntGarroteC6 + edtQntGarroteC7 - edtQntMortesManejo));
    }*/

}
