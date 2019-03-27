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

public class Altalanos_negyedik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_negyedik_osztaly);

        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();
        videoList.add("Ismerkedés a negatív számokkal!");
        videoList.add("Negatív számok sorbarendezése!");
        videoList.add("Negatív számok összeadása!");
        videoList.add("Műveletek különböző előjelű számokkal!");
        videoList.add("Negatív számok összeadása,kívonása pálda!");
        videoList.add("Negatív szám kivonása miért összeadás!");
        videoList.add("Negatív számok szöveges feladatokban!");
        videoList.add("Különböző előjelű számok szöveges feladatokban!");
        videoList.add("Negatív számok összeadása,kivonáa!");
        videoList.add("Pozitív és negatív számok szorzása!");
        videoList.add("Mínuszsor mínusz miért plusz? 1.rész");
        videoList.add("Mínuszsor mínusz miért plusz? 2.rész");
        videoList.add("Pozitív és negatív számok osztása!");
        videoList.add("Példa különböző előjelű számok szorzására!");
        videoList.add("Negatív számok szorzása,osztása!");
        videoList.add("Abszolútérték meghatározása számegyenesen!");
        videoList.add("Abszolútérték!");
        videoList.add("Egész számok abszolútértéke!");
        videoList.add("Abszolútértékek összehasonlítása!");
        videoList.add("Abszolútérték felépítése és értelmezése szöveges feladatokban!");



        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Felso.mp4?alt=media&token=e41f7442-8bda-48a3-af07-4b86b93b8417"));break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fmasodik.mp4?alt=media&token=0f1302d6-eb43-4a62-90d2-eed24b6a74ab"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fharmadik.mp4?alt=media&token=e294b5ec-eb70-4434-9803-6e5683293086"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fnegyedik.mp4?alt=media&token=564eed4f-cd51-44a0-bbe4-e81f3bba5ea7"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fotodik.mp4?alt=media&token=bd40e040-9317-4bae-b5ea-8bd6c7a7bd56"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fhatodik.mp4?alt=media&token=4c3866f1-c5f1-413c-8906-8a6a0ecf38d8"));break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fhetedik.mp4?alt=media&token=5a536208-568b-4dbe-80a7-114439d41427"));break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fnyolcadik.mp4?alt=media&token=7522760b-358f-4ac5-afd8-b7795e8c2b8e"));break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fkilencedik.mp4?alt=media&token=ca2b6969-1321-4a10-bad9-eec16ec2daf2"));break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizedik.mp4?alt=media&token=7772781a-c5d4-4f19-9239-8887553c4474"));break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizenegyedik.mp4?alt=media&token=2c940b04-683c-47b9-8a88-4872943035cd"));break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizenkettedik.mp4?alt=media&token=c3ab5c55-5fe2-44fc-b460-e7f5680949fa"));break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizenharmadik.mp4?alt=media&token=fbf553eb-4433-46c3-ab68-d95464af6cf2"));break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizenegyedik.mp4?alt=media&token=2c940b04-683c-47b9-8a88-4872943035cd"));break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizenotodik.mp4?alt=media&token=13941092-0f4e-4fa1-8ff9-58d17f7bc68e"));break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizenhatodik.mp4?alt=media&token=e82dbb89-5edc-4dce-bc9a-d5f3e6c5acf4"));break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizenhetedik.mp4?alt=media&token=f97d6d34-2bb4-4caa-95ed-0479a413d29c"));break;
                    case 17:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizennyolcadik.mp4?alt=media&token=8048cf2a-1a18-48e2-ab7a-bfe40d9fffcc"));break;
                    case 18:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Ftizenkilencedik.mp4?alt=media&token=7c8a89a5-f1c6-42f2-b60a-dad59ce8363e"));break;
                    case 19:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Negyedik_osztaly%2Fhuszadik.mp4?alt=media&token=39f14fe6-d42f-4b89-a35b-e1cad02a1886"));break;




                }
                videoView.setMediaController(new MediaController(Altalanos_negyedik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
