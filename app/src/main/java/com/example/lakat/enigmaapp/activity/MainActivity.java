/*Kezdőképernyő, mely egyben a menürendszer is: Oktató, Teszt, Kisokos menüpontok */

package com.example.lakat.enigmaapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;


import com.example.lakat.enigmaapp.kisokos.Kisokos;
import com.example.lakat.enigmaapp.oktato.Oktatoanyag;
import com.example.lakat.enigmaapp.R;
import com.example.lakat.enigmaapp.tesztek.Tesztek;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView oktatoanyag = (CardView) findViewById(R.id.oktato_anyag);
        CardView teszt = (CardView) findViewById(R.id.tesztek);
        CardView kisokos = (CardView) findViewById(R.id.okos);


        oktatoanyag.setOnClickListener(this);
        kisokos.setOnClickListener(this);
        teszt.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.oktato_anyag : i =new Intent(this, Oktatoanyag.class);startActivity(i); break;
            case R.id.tesztek : i =new Intent(this, Tesztek.class);startActivity(i); break;
            case R.id.okos : i =new Intent(this, Kisokos.class);startActivity(i); break;


            default:break;

        }

    }
}
