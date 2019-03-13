package com.example.lakat.enigmaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Altalanos_tesztek extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_tesztek);

        CardView elso_teszt = (CardView) findViewById(R.id.altalanos_teszt_elso);
        CardView masodik_teszt = (CardView) findViewById(R.id.altalanos_iskola_masodik);
        CardView harmadik_teszt = (CardView) findViewById(R.id.altalanos_iskola_harmadik);
        CardView negyedik_teszt = (CardView) findViewById(R.id.altalanos_iskola_negyedik);
        CardView otodik_teszt = (CardView) findViewById(R.id.altalanos_iskola_otodik);
        CardView hatodik_teszt = (CardView) findViewById(R.id.altalanos_iskola_hatodik);
        CardView hetedik_teszt = (CardView) findViewById(R.id.altalanos_iskola_hetedik);
        CardView nyolcadik_teszt = (CardView) findViewById(R.id.altalanos_iskola_nyolcadik);

        elso_teszt.setOnClickListener(this);
        masodik_teszt.setOnClickListener(this);
        harmadik_teszt.setOnClickListener(this);
        negyedik_teszt.setOnClickListener(this);
        otodik_teszt.setOnClickListener(this);
        hatodik_teszt.setOnClickListener(this);
        hetedik_teszt.setOnClickListener(this);
        nyolcadik_teszt.setOnClickListener(this);
    }
    public void onClick(View view){

        Intent i;

        switch (view.getId()){

            case R.id.altalanos_teszt_elso : i=new Intent(this,Alt_teszt_elso_osztaly.class);startActivity(i);break;


        }


    }
}
