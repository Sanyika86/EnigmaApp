package com.example.lakat.enigmaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kisokos_sikidomok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisokos_sikidomok);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfsikidomok);
        pdfView.fromAsset("kisokos_sikidomok.pdf").load();
    }
}
