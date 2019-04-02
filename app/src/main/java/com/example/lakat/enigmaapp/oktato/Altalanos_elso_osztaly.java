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

public class Altalanos_elso_osztaly extends AppCompatActivity {
    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_elso_osztaly);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView = (VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList = new ArrayList<>();
        videoList.add("Összeadás alapjai!");
        videoList.add("Kivonás alapjai!");
        videoList.add("Két számjegyű számok összeadása, maradék nélkül!");
        videoList.add("Kivánás 2-es szint!");
        videoList.add("Két számjegyű számok kivonása!");
        videoList.add("Összeadás 2-es szint!");
        videoList.add("Összeadás 3-es szint!");
        videoList.add("Összeadás 4-es szint!");
        videoList.add("Kivonás 3-es szint kölcsönzés és csoportosítás bevezetése 1. rész!");
        videoList.add("Kivonás 3-es szint kölcsönzés és csoportosítás bevezetése 2. rész!");
        videoList.add("Miért működik a kölcsönzés!");
        videoList.add("Egyszeri átcsoportosítás 1. példa!");
        videoList.add("Egyszeri átcsoportosítás 2. példa!");
        videoList.add("Kétszeres csoportosítás!");
        videoList.add("Fejben számolós kivonás!");
        videoList.add("Kivonás 4-es szint!");
        videoList.add("Kivonás szöveges feladat!");


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/osszeadas_alapjai.mp4?alt=media&token=26d38b12-c41d-4fe5-9219-20e4ccc4c865"));
                        break;

                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/kivonas_alapjai.mp4?alt=media&token=131aadae-1f24-4e1f-a0bc-b131e475c117"));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/ketszamjegyuszamok_osszeadasa.mp4?alt=media&token=0d96bc20-1816-4cce-8045-f3dfb1050a53"));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/kivonas_kettes_szint.mp4?alt=media&token=609d09af-341b-4c9e-a153-b71008f03a32"));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/ketszamjegyuszamok_kivonasa.mp4?alt=media&token=c630c9d5-c3a9-4fcc-870a-8f1ba166306c"));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/osszeadas_kettes_szint.mp4?alt=media&token=96f76c39-bb6f-4b8b-9679-05f6c9bc1e59"));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/osszeadas_harmas_szint.mp4?alt=media&token=01756564-5fa2-404b-b3f2-84a32339eb05"));
                        break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/osszeadas_negyes_szint.mp4?alt=media&token=25afb159-fe4f-4847-9da7-d70dec0b9d74"));
                        break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/kivonas_harmas_szint_elso_resz.mp4?alt=media&token=5035783d-094d-4569-ad4f-d3552891a9b0"));
                        break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/kivonas_harmas_szint_masodik_resz.mp4?alt=media&token=cc3d2405-2da9-41db-aa54-aba5c766f94d"));
                        break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/miert_mukodik_a_kolcsonzes.mp4?alt=media&token=feb30254-c13c-480e-8cbf-33160ddc512a"));
                        break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/egyszeri_atcsoportositas_elso_pelda.mp4?alt=media&token=74594021-c72f-4bc4-8ab5-86e69aadb3f1"));
                        break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/egyszeri_atcsoportositas_masodik_pelda.mp4?alt=media&token=382cc5bb-c408-49c7-ace6-c9e8c86e2bba"));
                        break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/ketszeres_csoportositas.mp4?alt=media&token=0a4ce04c-5b28-402b-bd42-f0e18c9092ac"));
                        break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/fejben_szamolos_kivonas.mp4?alt=media&token=054d8336-3b4c-46e5-af37-4499ded8867c"));
                        break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/kivonas_negyes_szint.mp4?alt=media&token=fae69e08-5d85-4137-bc28-e8758f47f55a"));
                        break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/kivonas_szoveges_feladat.mp4?alt=media&token=c91144be-a8be-495b-bdb2-a9ffe3bc689b"));
                        break;


                }
                videoView.setMediaController(new MediaController(Altalanos_elso_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
