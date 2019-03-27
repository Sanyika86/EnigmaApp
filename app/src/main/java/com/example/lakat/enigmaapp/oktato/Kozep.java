package com.example.lakat.enigmaapp.oktato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.lakat.enigmaapp.R;

public class Kozep extends AppCompatActivity implements View.OnClickListener  {

    private CardView kilencedik, tizedik, tizenegyedik, tizenkettedik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kozep);

        kilencedik = (CardView) findViewById(R.id.kozep_iskola_elso);
        tizedik = (CardView) findViewById(R.id.kozep_iskola_masodik);
        tizenegyedik = (CardView) findViewById(R.id.kozep_iskola_harmadik);
        tizenkettedik = (CardView) findViewById(R.id.kozep_iskola_negyedik);

        kilencedik.setOnClickListener(this);
        tizedik.setOnClickListener(this);
        tizenegyedik.setOnClickListener(this);
        tizenkettedik.setOnClickListener(this);
    }

    public void onClick(View view){

        Intent i;

        switch (view.getId()){

            case R.id.kozep_iskola_elso : i=new Intent(this, Kozep_elso_osztaly.class);startActivity(i);break;
            case R.id.kozep_iskola_masodik : i=new Intent(this, Kozep_masodik_osztaly.class);startActivity(i);break;
            case R.id.kozep_iskola_harmadik : i=new Intent(this, Kozep_harmadik_osztaly.class);startActivity(i);break;
            case R.id.kozep_iskola_negyedik : i=new Intent(this, Kozep_negyedik_osztaly.class);startActivity(i);break;


        }


    }
}
