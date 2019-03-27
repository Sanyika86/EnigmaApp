package com.example.lakat.enigmaapp.oktato;

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

public class Altalanos_hatodik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_hatodik_osztaly);

        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();

        videoList.add("Törtek bevezetése!");
        videoList.add("Törtek felismerése!");
        videoList.add("Számláló és nevező!");
        videoList.add("Törtek elhelyezése a számegyenesen!");
        videoList.add("Törtek egyszerűsítése!");
        videoList.add("Azonos értékű törtek!");
        videoList.add("Közes nevezőre hozás!");
        videoList.add("Törtek összeadása közös nevező esetén!");
        videoList.add("Törtek kivonása!");
        videoList.add("Törtek szorzása egész számmal!");
        videoList.add("Tört szorzása törttel!");
        videoList.add("Törtek szorzása!");
        videoList.add("Törtek osztása!");
        videoList.add("Vegyes számalakok összeadása!");
        videoList.add("Vegyes számalakok kivonása!");
        videoList.add("Tört szorzása egész számmal!");
        videoList.add("Egész szám osztása törttel!");


        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_felismerese.mp4?alt=media&token=df05c6de-32b0-4876-9334-f5f8ae493487"));break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_felismerese.mp4?alt=media&token=df05c6de-32b0-4876-9334-f5f8ae493487"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Fszamlalo_es_nevezo.mp4?alt=media&token=6bad597b-b691-4b23-b4f5-c7ca5fc9bf23"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_szamegyenesen.mp4?alt=media&token=810c8e20-28c0-4444-b744-dee5e2cb136f"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_egyszerusitese.mp4?alt=media&token=69dd977b-7f35-41db-a038-b5d967b22663"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Fazonos_erteku_tortek_pelda.mp4?alt=media&token=0c561a3f-d2a3-43ed-9e07-cd45cae08c9f"));break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Fkozos_nevezore_hozas.mp4?alt=media&token=ef25d683-373f-4ffb-93a1-be1f611b8725"));break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_osszeadasa_kozos_nevezo_esten.mp4?alt=media&token=4b3aab34-0f79-443e-8515-e1da3dd28ccf"));break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_kivonasa.mp4?alt=media&token=0d4cdd72-663d-49ee-8181-212c438d0c03"));break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_szorzasa_egesz_szammal.mp4?alt=media&token=deab1d8d-aa22-4b58-980b-e2f682bea24e"));break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_szorzasa_egesz_szammal.mp4?alt=media&token=deab1d8d-aa22-4b58-980b-e2f682bea24e"));break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_szorzasa.mp4?alt=media&token=f8a93b02-205f-4acc-80a8-5edfb03285da"));break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_osztasa.mp4?alt=media&token=46717217-8708-449f-9143-d208963f711c"));break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Fvegyes_szamalakok_osszeadasa_elso_pelda.mp4?alt=media&token=3a3e2d14-f9a5-431b-b44f-aef621455a3e"));break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Fvegyes_szamalakok_kivonasa_elsop%C3%A9lda.mp4?alt=media&token=0f675938-6976-41f3-a5a6-68b06ed37cbb"));break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Ftortek_szorzasa_egesz_szammal.mp4?alt=media&token=deab1d8d-aa22-4b58-980b-e2f682bea24e"));break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Hatodik_osztaly%2Fegesz_szam_osztasa_torttel.mp4?alt=media&token=4ebef776-755e-4476-ac25-d751a807b538"));break;





                }
                videoView.setMediaController(new MediaController(Altalanos_hatodik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }



}

