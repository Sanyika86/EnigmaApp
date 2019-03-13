package com.example.lakat.enigmaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CardView oktatoanyag = (CardView) findViewById(R.id.oktato_anyag);
        CardView teszt = (CardView) findViewById(R.id.tesztek);
        CardView kisokos = (CardView) findViewById(R.id.okos);
        CardView jatekok = (CardView) findViewById(R.id.game);

        oktatoanyag.setOnClickListener(this);
        kisokos.setOnClickListener(this);
        teszt.setOnClickListener(this);
        jatekok.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){

            case R.id.oktato_anyag : i =new Intent(this,Oktatoanyag.class);startActivity(i); break;
            case R.id.tesztek : i =new Intent(this,Tesztek.class);startActivity(i); break;
            case R.id.okos : i =new Intent(this,Kisokos.class);startActivity(i); break;
            case R.id.game : i =new Intent(this,Jatek.class);startActivity(i); break;

            default:break;

        }

    }
}
