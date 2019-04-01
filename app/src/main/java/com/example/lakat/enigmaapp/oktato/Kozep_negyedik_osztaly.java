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

public class Kozep_negyedik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kozep_negyedik_osztaly);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView = (VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList = new ArrayList<>();
        videoList.add("Függvények határértéke 1!");
        videoList.add("Függvények határértéke 2!");
        videoList.add("Függvények határértéke 3!");
        videoList.add("Függvények határértéke 4!");
        videoList.add("Függvények határértéke 5!");
        videoList.add("Függvények határértéke 6!");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenkettedik_osztaly%2Ffuggvenyek_hatarerteke_elso.mp4?alt=media&token=278758ed-22f5-4e32-aeb0-8292f6f6e0ee"));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenkettedik_osztaly%2Ffuggvenyek_hatarerteke_masodik.mp4?alt=media&token=b353d297-87a4-423b-9097-7f74bc83f3fc"));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenkettedik_osztaly%2Ffuggvenyek_hatarerteke_harmadik.mp4?alt=media&token=5607b58b-1709-4b5c-bc94-c55a79a57d5d"));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenkettedik_osztaly%2Ffuggvenyek_hatarerteke_negyedik.mp4?alt=media&token=a8257c06-cd72-4c4b-b59e-122e1cfb1e59"));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenkettedik_osztaly%2Ffuggvenyek_hatareerteke_otodik.mp4?alt=media&token=33b72cef-b5c5-4ab5-9115-0bac4d949cb6"));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizenkettedik_osztaly%2Ffuggvenyek_hatarerteke_hatodik.mp4?alt=media&token=b39e373f-0a3f-4ba9-b474-d962bf3f0e99"));
                        break;


                }
                videoView.setMediaController(new MediaController(Kozep_negyedik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}

