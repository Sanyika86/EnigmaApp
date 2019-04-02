package com.example.lakat.enigmaapp.oktato;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.lakat.enigmaapp.R;

import java.util.ArrayList;

public class Altalanos_hetedik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_hetedik_osztaly);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();

        videoList.add("Bevezetés az arányosságba!");
        videoList.add("Arányossági feladatok körbejárása!");
        videoList.add("Arányok és törtek egyszerűsítése!");
        videoList.add("Atlagsebesseg szamitasa!");
        videoList.add("Hosszúság mértékegységeinek számítása!");
        videoList.add("Tömeg mértékegységeinek váltása!");
        videoList.add("Űrtartalom mértékegységeinek váltása!");
        videoList.add("Idő és sebesség váltása!");

        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hetedik_osztaly%2Fbevezetes_aranyossagba.mp4?alt=media&token=a1409087-ac2d-4132-a6f2-991c16bb9b68"));break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hetedik_osztaly%2Faranyossagi_feladatok_korbejarasa.mp4?alt=media&token=0ca90d14-af44-45ad-b769-cf483cd71c62"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hetedik_osztaly%2Faranyok_es_tortek_egyszerusitese.mp4?alt=media&token=6f02ff10-cef7-4c80-8f5e-fdfc1e5ec506"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hetedik_osztaly%2Fatlagsebesseg_szamitasa.mp4?alt=media&token=63d43230-5f75-4abe-8cab-ef26b2f4bffa"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hetedik_osztaly%2Fhosszusag_mertekegysegeinek_szamitasa.mp4?alt=media&token=a1da988a-054d-4584-88e1-b5351a9c3425"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hetedik_osztaly%2Ftomeg_atvaltasa.mp4?alt=media&token=141ccc65-46bd-4552-b153-4e12f0fff64a"));break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hetedik_osztaly%2Furtartalom_atvaltas.mp4?alt=media&token=038bc8c5-8e89-46a9-b560-10e207d34b45"));break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hetedik_osztaly%2Fido_es_sebesseg_valtasa.mp4?alt=media&token=b61aa914-5016-4827-befd-2aa0a15e5a66"));break;





                }
                videoView.setMediaController(new MediaController(Altalanos_hetedik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }


}

