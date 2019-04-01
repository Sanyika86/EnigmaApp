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

public class Altalanos_nyolcadik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_nyolcadik_osztaly);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();

        videoList.add("Betűk az algebrában!");
        videoList.add("Descartes és a koordinata!");
        videoList.add("Behelyettesítés!");
        videoList.add("Változó!");
        videoList.add("Változók, kifejezések, egyenletek!");
        videoList.add("Kétismeretlenes egyenletek!");
        videoList.add("Kétváltozós kifejezés!");
        videoList.add("Kiemelés!");
        videoList.add("Összeadás, kivonás az egyenlet mindkettő oldalán!");
        videoList.add("Miért osztunk az egyenlet mindkettő oldalán ugyanannyival!");
        videoList.add("Egyenlőtlenségek megoldása!");

        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fbetuk_az_algebraban.mp4?alt=media&token=7d138f71-94f8-4fa9-a724-c8699f0a408f"));break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fdecartes_es_a_koordinata.mp4?alt=media&token=2d23225a-4cc0-441a-8d3d-faeef73e9d75"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fbehelyettesites.mp4?alt=media&token=b2b4b76f-39b6-490a-a340-9fddab4e9c4c"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fvaltozo.mp4?alt=media&token=8595474c-ede9-47ca-a1af-0b79a5e13087"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fvaltozok_kifejezesek_egyenletek.mp4?alt=media&token=2a5475eb-36c5-48b0-b1d2-e5c2b9082484"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fketismeretlenes_egyenlet.mp4?alt=media&token=06125fc4-c5c3-490a-8712-245820324ff6"));break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fketvaltozos_kifejezes.mp4?alt=media&token=63978d92-4ebe-4196-b4bd-af7075058574"));break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fkiemeles.mp4?alt=media&token=10bfd8cd-ec0f-410f-a7be-35c9e028ab22"));break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fosszeadas_kivonas_egyenlet_mindketoldalan.mp4?alt=media&token=39e31e83-5536-4f8c-9e87-8e05b32ef904"));break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fmiert_osztunk_mindketoldalon_ugyanannyival.mp4?alt=media&token=92b1be30-ab6c-4d8e-8243-eab13547b834"));break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Nyolcadik_osztaly%2Fegyenlotlenseg_megldasa.mp4?alt=media&token=9216d07c-0f50-4948-9c78-aea407b9559c"));break;





                }
                videoView.setMediaController(new MediaController(Altalanos_nyolcadik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
