package com.example.lakat.enigmaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kisokos_logaritmus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisokos_logaritmus);

        PDFView pdfView = (PDFView) findViewById(R.id.pdflogaritmus);
        pdfView.fromAsset("kisokos_logaritmus.pdf").load();
    }
}
