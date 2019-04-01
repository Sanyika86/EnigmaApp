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

public class Kozep_harmadik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kozep_harmadik_osztaly);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView = (VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList = new ArrayList<>();
        videoList.add("Algebrai alakú komplex számok felírása trigonometria és exponenciális alakban!");
        videoList.add("Komplex számok konjugáltja!");
        videoList.add("Komplex számok feladat 1!");
        videoList.add("Komplex számok feladat 2!");
        videoList.add("Komplex számok feladat 3!");
        videoList.add("Komplex számok feladat 4!");
        videoList.add("Komplex számok osztása konjugált segítségével!");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenegyedik_osztaly%2Falgebrai_alaku_komplex_szam_felir%C3%A1sa_trig_es_exp_alakban.mp4?alt=media&token=28f84744-9810-4d47-8c9d-82704b72f597"));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenegyedik_osztaly%2Fkomplex_szam_konjugaltja.mp4?alt=media&token=807621f6-847a-4d56-abfc-07e49c33d5f0"));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenegyedik_osztaly%2Fkomplex_szamok_feladat_elso.mp4?alt=media&token=322d9225-97f6-44a9-a5e8-51cb19af92d5"));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenegyedik_osztaly%2Fkomplex_szamok_feladat_masodik.mp4?alt=media&token=47ade0c9-5af3-4fb1-86df-73ad5e755b94"));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenegyedik_osztaly%2Fkomplex_szamok_feladat_harmadik.mp4?alt=media&token=3740b375-76c8-414f-bbe9-0c1fd74b75e8"));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenegyedik_osztaly%2Fkomplex_szamok_feladat_megyedik.mp4?alt=media&token=2da7fc19-83ea-4350-8c81-c576c1802da5"));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenegyedik_osztaly%2Fkomplex_szamok_osztasa_konjugalt_segitsegevel.mp4?alt=media&token=7445e76d-37a8-43c6-97a7-ffeb19477166"));
                        break;


                }
                videoView.setMediaController(new MediaController(Kozep_harmadik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}

