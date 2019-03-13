package com.example.lakat.enigmaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View.OnClickListener;
import android.view.View;


public class Kisokos extends AppCompatActivity implements OnClickListener {

    private CardView szamelmelet_keplet,binominalis_keplet,kombinatorika_keplet,halmazok_keplet,logika_keplet,grafok_keplet,polinomok_keplet,sorozatok_keplet,logaritmus_keplet,kovetkezo_oldal,hatvanyozas_keplet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisokos);

         szamelmelet_keplet = (CardView) findViewById(R.id.szamelmelet);
         binominalis_keplet = (CardView) findViewById(R.id.binominalis);
         kombinatorika_keplet = (CardView) findViewById(R.id.kombinatorika);
         halmazok_keplet = (CardView) findViewById(R.id.halmazok);

         logika_keplet = (CardView) findViewById(R.id.logika);
         grafok_keplet = (CardView) findViewById(R.id.grafok);
         polinomok_keplet = (CardView) findViewById(R.id.polinomok);
         sorozatok_keplet = (CardView) findViewById(R.id.sorozatok);
         logaritmus_keplet = (CardView) findViewById(R.id.logaritmus);
         hatvanyozas_keplet = (CardView) findViewById(R.id.hatvanyozas);
         kovetkezo_oldal = (CardView) findViewById(R.id.kovoldal);

         szamelmelet_keplet.setOnClickListener(this);
         binominalis_keplet.setOnClickListener(this);
         kombinatorika_keplet.setOnClickListener(this);
         halmazok_keplet.setOnClickListener(this);

         logika_keplet.setOnClickListener(this);
         grafok_keplet.setOnClickListener(this);
         polinomok_keplet.setOnClickListener(this);
         sorozatok_keplet.setOnClickListener(this);
         logaritmus_keplet.setOnClickListener(this);
         hatvanyozas_keplet.setOnClickListener(this);
         kovetkezo_oldal.setOnClickListener(this);



    }

    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.szamelmelet : i =new Intent(this,Kisokos_szamelmelet.class);startActivity(i); break;
            case R.id.binominalis : i =new Intent(this,Kisokos_binominalis.class);startActivity(i); break;
            case R.id.kombinatorika : i =new Intent(this,Kisokos_kombinatorika.class);startActivity(i); break;
            case R.id.halmazok : i =new Intent(this,Kisokos_halmazok.class);startActivity(i); break;
            case R.id.logika : i =new Intent(this,Kisokos_logika.class);startActivity(i); break;
            case R.id.grafok : i =new Intent(this,Kisokos_grafok.class);startActivity(i); break;
            case R.id.polinomok : i =new Intent(this,Kisokos_polinomok.class);startActivity(i); break;
            case R.id.sorozatok : i =new Intent(this,Kisokos_sorozatok.class);startActivity(i); break;
            case R.id.logaritmus : i =new Intent(this,Kisokos_logaritmus.class);startActivity(i); break;
            case R.id.hatvanyozas : i =new Intent(this,Kisokos_hatvanyozas.class);startActivity(i); break;
            case R.id.kovoldal : i =new Intent(this,Kisokos_harmadik.class);startActivity(i); break;

            default:break;

        }

    }


}
