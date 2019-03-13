package com.example.lakat.enigmaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kisokos_grafok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisokos_grafok);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfgrafok);
        pdfView.fromAsset("grafelmelet.pdf").load();
    }
}
