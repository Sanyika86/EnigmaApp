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

public class Altalanos_harmadik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_harmadik_osztaly);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();

        videoList.add("Oszthatósági szabalyok 1.rész!");
        videoList.add("Oszthatósági szabalyok 2.rész!");
        videoList.add("Hárommal való oszthatóság!");
        videoList.add("Kilenccel való oszthatóság!");
        videoList.add("120 összes osztója!");
        videoList.add("Prímszámok!");
        videoList.add("Prímszámok felismerése!");
        videoList.add("Prímtényezős felbontás!");
        videoList.add("Prímtényezős felbontás gyakorlása!");
        videoList.add("Közös oszthatóság!");
        videoList.add("Legkisebb közös többszörös példa!");
        videoList.add("Legkisebb közös többszörös példa 2.rész!");
        videoList.add("LKKT - Legkisebb közös többszörös!");
        videoList.add("LKKT képlete!");
        videoList.add("Legnagyobb közös osztó!");
        videoList.add("LKKT-LKKT - Szöveges feladat!");

        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Foszthatosagi_szabalyok.mp4?alt=media&token=9901dbe2-36b5-4de2-b6ab-57a91dd0c553"));break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Foszthatosagi_szabalyok_masodik.mp4?alt=media&token=960fa3ac-b7d4-4496-974a-0b9676cc7874"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Fharomal_valo_oszthatosag.mp4?alt=media&token=e2e59cd1-dca9-428a-94a2-d502c7d94fbc"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Fkilenccel_valo_oszthatosag.mp4?alt=media&token=1a59fc03-3c73-491d-95e6-19b4c8471750"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Fszazhusz_osszes_osztoja.mp4?alt=media&token=27327170-11ed-48d5-9c99-3b3ff0be83b1"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Foszthatosagi_szabalyok_gyakorlasa.mp4?alt=media&token=2dc7ed88-c3a6-4c48-bfd1-d91498ebacc9"));break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Fprimszamok.mp4?alt=media&token=b8ec3b55-c45b-4986-862b-d502b27070f8"));break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Fprimszamok_felsimerese.mp4?alt=media&token=ba1a568f-514c-4593-b57b-09ce14d07f78"));break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Fprimtenyezos_szabalyok_gyakorlasa.mp4?alt=media&token=840edb32-4145-447e-a723-e74d86e0ded6"));break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Fkozos_oszthatosag.mp4?alt=media&token=00d6bfb2-e996-4160-b48b-0322498d14b2"));break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Flegkisebb_kozos_tobbszoros_prlda.mp4?alt=media&token=8fb72d50-99b2-4b62-96f1-d61b61f2e5df"));break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Flegkisebb_kozos_tobbszoros_pelda_masodik_resz.mp4?alt=media&token=4bbe8d13-3df5-4e90-831d-33dee153c8da"));break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Flegkisebb_kozos_tobbszoros.mp4?alt=media&token=7d889b9b-32af-4643-a70d-eaaabee0e98a"));break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Flkkt_keplete.mp4?alt=media&token=b084abc6-9a99-42ea-a841-5171fdc77c7a"));break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Flegnagyobb_kozos_oszto.mp4?alt=media&token=bc0e8e14-78fc-4b66-b3e9-2881ee86fcdf"));break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Harmadik_osztaly%2Flnko_lkkt_szoveges_feladat.mp4?alt=media&token=69ccb2a1-9626-4130-b5d2-5878ffe3c5d9"));break;



                }
                videoView.setMediaController(new MediaController(Altalanos_harmadik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });


    }
}
