package com.example.lakat.enigmaapp.oktato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.lakat.enigmaapp.R;

public class Altalanos extends AppCompatActivity implements View.OnClickListener {

    private CardView elso,masodik,harmadik,negyedik,otodik,hatodik,hetedik,nyolcadik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos);




        elso = (CardView) findViewById(R.id.altalanos_iskola_elso);
        masodik = (CardView) findViewById(R.id.altalanos_iskola_masodik);
        harmadik = (CardView) findViewById(R.id.altalanos_iskola_harmadik);
        negyedik = (CardView) findViewById(R.id.altalanos_iskola_negyedik);
        otodik = (CardView) findViewById(R.id.altalanos_iskola_otodik);
        hatodik = (CardView) findViewById(R.id.altalanos_iskola_hatodik);
        hetedik = (CardView) findViewById(R.id.altalanos_iskola_hetedik);
        nyolcadik = (CardView) findViewById(R.id.altalanos_iskola_nyolcadik);

        elso.setOnClickListener(this);
        masodik.setOnClickListener(this);
        harmadik.setOnClickListener(this);
        negyedik.setOnClickListener(this);
        otodik.setOnClickListener(this);
        hatodik.setOnClickListener(this);
        hetedik.setOnClickListener(this);
        nyolcadik.setOnClickListener(this);
    }

    public void onClick(View view){

        Intent i;

        switch (view.getId()){

            case R.id.altalanos_iskola_elso : i=new Intent(this, Altalanos_elso_osztaly.class);startActivity(i);break;
            case R.id.altalanos_iskola_masodik : i=new Intent(this, Altalanos_masodik_osztaly.class);startActivity(i);break;
            case R.id.altalanos_iskola_harmadik : i=new Intent(this, Altalanos_harmadik_osztaly.class);startActivity(i);break;
            case R.id.altalanos_iskola_negyedik : i=new Intent(this, Altalanos_negyedik_osztaly.class);startActivity(i);break;
            case R.id.altalanos_iskola_otodik : i=new Intent(this, Altalanos_otodik_osztaly.class);startActivity(i);break;
            case R.id.altalanos_iskola_hatodik : i=new Intent(this, Altalanos_hatodik_osztaly.class);startActivity(i);break;
            case R.id.altalanos_iskola_hetedik : i=new Intent(this, Altalanos_hetedik_osztaly.class);startActivity(i);break;
            case R.id.altalanos_iskola_nyolcadik : i=new Intent(this, Altalanos_nyolcadik_osztaly.class);startActivity(i);break;



        }


    }
}
