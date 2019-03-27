package com.example.lakat.enigmaapp.tesztek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.lakat.enigmaapp.R;
import com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek.Elso_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek.Harmadik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek.Hatodik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek.Hetedik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek.Masodik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek.Negyedik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek.Nyolcadik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek.Otodik_osztaly_teszt;

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

            case R.id.altalanos_teszt_elso : i=new Intent(this, Elso_osztaly_teszt.class);startActivity(i);break;
            case R.id.altalanos_iskola_masodik : i=new Intent(this, Masodik_osztaly_teszt.class);startActivity(i);break;
            case R.id.altalanos_iskola_harmadik : i=new Intent(this, Harmadik_osztaly_teszt.class);startActivity(i);break;
            case R.id.altalanos_iskola_negyedik : i=new Intent(this, Negyedik_osztaly_teszt.class);startActivity(i);break;
            case R.id.altalanos_iskola_otodik : i=new Intent(this, Otodik_osztaly_teszt.class);startActivity(i);break;
            case R.id.altalanos_iskola_hatodik : i=new Intent(this, Hatodik_osztaly_teszt.class);startActivity(i);break;
            case R.id.altalanos_iskola_hetedik : i=new Intent(this, Hetedik_osztaly_teszt.class);startActivity(i);break;
            case R.id.altalanos_iskola_nyolcadik : i=new Intent(this, Nyolcadik_osztaly_teszt.class);startActivity(i);break;


        }


    }
}
