package com.example.lakat.enigmaapp.kisokos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lakat.enigmaapp.R;
import com.github.barteksc.pdfviewer.PDFView;


public class Kisokos_binominalis extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisokos_binominalis);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfbinominalis);
        pdfView.fromAsset("binominalis.pdf").load();


    }
}
