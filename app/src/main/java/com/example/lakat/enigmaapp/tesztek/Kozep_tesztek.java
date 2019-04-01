package com.example.lakat.enigmaapp.tesztek;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.lakat.enigmaapp.R;
import com.example.lakat.enigmaapp.tesztek.Kozepiskola_tesztek.Kilencedik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Kozepiskola_tesztek.Tizedik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Kozepiskola_tesztek.Tizenegyedik_osztaly_teszt;
import com.example.lakat.enigmaapp.tesztek.Kozepiskola_tesztek.Tizenkettedik_osztaly_teszt;

public class Kozep_tesztek extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kozep_tesztek);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        CardView kilencedik_teszt = (CardView) findViewById(R.id.kozep_iskola_elso);
        CardView tizedik_teszt = (CardView) findViewById(R.id.kozep_iskola_masodik);
        CardView tizenegyedik_teszt = (CardView) findViewById(R.id.kozep_iskola_harmadik);
        CardView tizenkettedik_teszt = (CardView) findViewById(R.id.kozep_iskola_negyedik);

        kilencedik_teszt.setOnClickListener(this);
        tizedik_teszt.setOnClickListener(this);
        tizenegyedik_teszt.setOnClickListener(this);
        tizenkettedik_teszt.setOnClickListener(this);
    }
    public void onClick(View view){

        Intent i;

        switch (view.getId()){

            case R.id.kozep_iskola_elso : i=new Intent(this, Kilencedik_osztaly_teszt.class);startActivity(i);break;
            case R.id.kozep_iskola_masodik : i=new Intent(this, Tizedik_osztaly_teszt.class);startActivity(i);break;
            case R.id.kozep_iskola_harmadik : i=new Intent(this, Tizenegyedik_osztaly_teszt.class);startActivity(i);break;
            case R.id.kozep_iskola_negyedik : i=new Intent(this, Tizenkettedik_osztaly_teszt.class);startActivity(i);break;


        }


    }
}

