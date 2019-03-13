package com.example.lakat.enigmaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kisokos_kombinatorika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisokos_kombinatorika);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfkombinatorika);
        pdfView.fromAsset("kisokos_kombinatorika.pdf").load();
    }
}
