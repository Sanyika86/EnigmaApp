package com.example.lakat.enigmaapp.kisokos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.lakat.enigmaapp.R;

public class Kisokos_harmadik extends AppCompatActivity implements View.OnClickListener {
    private CardView gyokvonas_keplet, komplex_keplet, kamat_keplet, trigonometria_keplet,sikidomok_keplet, testek_keplet,nevezetesfv_keplet, derivalas_keplet, integralas_keplet, valseg_keplet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisokos_harmadik);

        gyokvonas_keplet = (CardView) findViewById(R.id.gyokvonas);
        komplex_keplet = (CardView) findViewById(R.id.komplex);
        kamat_keplet = (CardView) findViewById(R.id.kamatszamitas);
        trigonometria_keplet = (CardView) findViewById(R.id.trigonometria);
        sikidomok_keplet = (CardView) findViewById(R.id.sikidomok);
        testek_keplet = (CardView) findViewById(R.id.testek);
        nevezetesfv_keplet = (CardView) findViewById(R.id.nevezetesfv);
        derivalas_keplet = (CardView) findViewById(R.id.derivalas);
        integralas_keplet = (CardView) findViewById(R.id.integralas);
        valseg_keplet = (CardView) findViewById(R.id.valoszinuseg);

        gyokvonas_keplet.setOnClickListener(this);
        komplex_keplet.setOnClickListener(this);
        kamat_keplet.setOnClickListener(this);
        trigonometria_keplet.setOnClickListener(this);
        sikidomok_keplet.setOnClickListener(this);
        testek_keplet.setOnClickListener(this);
        nevezetesfv_keplet.setOnClickListener(this);
        derivalas_keplet.setOnClickListener(this);
        integralas_keplet.setOnClickListener(this);
        valseg_keplet.setOnClickListener(this);
    }

    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.gyokvonas : i =new Intent(this,Kisokos_gyokvonas.class);startActivity(i); break;
            case R.id.komplex : i =new Intent(this,Kisokos_komplexszamok.class);startActivity(i); break;
            case R.id.kamatszamitas : i =new Intent(this,Kisokos_kamatszamitas.class);startActivity(i); break;
            case R.id.trigonometria : i =new Intent(this,Kisokos_trigonometria.class);startActivity(i); break;
            case R.id.sikidomok : i =new Intent(this,Kisokos_sikidomok.class);startActivity(i); break;
            case R.id.testek : i =new Intent(this,Kisokos_testek.class);startActivity(i); break;
            case R.id.nevezetesfv : i =new Intent(this,Kisokos_nevezetesfv.class);startActivity(i); break;
            case R.id.derivalas : i =new Intent(this,Kisokos_derivalas.class);startActivity(i); break;
            case R.id.integralas : i =new Intent(this,Kisokos_integralas.class);startActivity(i); break;
            case R.id.valoszinuseg : i =new Intent(this,Kisokos_valseg.class);startActivity(i); break;


            default:break;

        }

    }
}
