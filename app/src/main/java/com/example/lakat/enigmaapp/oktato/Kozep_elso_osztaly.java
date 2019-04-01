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

public class Kozep_elso_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kozep_elso_osztaly);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();
        videoList.add("Egy megoldásos egyenlet!");
        videoList.add("Egyenes és fordított arányosság!");
        videoList.add("Egyenletmegoldás!");
        videoList.add("Egyenletmegoldás hetköznapokban!");
        videoList.add("Egyenletek törtekkel!");
        videoList.add("Példák egyenletmegoldásra!");
        videoList.add("Összetett egyenletek megoldása!");
        videoList.add("Elsőfokú egyenlet megoldása!");
        videoList.add("Másodfokú egyenlet megoldóképlete!");
        videoList.add("Másodfokú egyenlet megoldása szorzattá alakítással!");
        videoList.add("Másodfokú egyenlőtlenségek!");
        videoList.add("Szorzás és osztás egyenlőtlenség esetén!");
        videoList.add("Kétlépéses egyenlőtlenség!");
        videoList.add("Egyszerű másodfokú egyenlet megoldása!");
        videoList.add("Logaritmus!");
        videoList.add("Logaritmus azonosságainak alkalmazása!");
        videoList.add("Természetes alapú logaritmus értékének meghatározása!");
        videoList.add("Függvények!");
        videoList.add("Függvények grafikonjai!");
        videoList.add("Függvény transzformációk!");
        videoList.add("Értelmezési tartomány és értékkészlet meghatározása!");
        videoList.add("Függvény értékének leolvasása!");
        videoList.add("Pontok koordinátáinak meghatározása!");

        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fegy_megoldasos_egyenlet.mp4?alt=media&token=00878246-efa4-4623-a311-b5f97b1c9c94"));break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fegyenes_es_forditott_aranyossag.mp4?alt=media&token=651ae9cc-5eae-4784-939b-1f9a2ba1bffa"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fegyenletmegoldas.mp4?alt=media&token=1d4da9e4-5d12-4279-aa6a-cbadcd0541b9"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fegyenletmegoldasok_hetkoznapokban.mp4?alt=media&token=628f2bcd-5f02-42dc-8da8-ddb3eab3521a"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fegyenletek_tortekkel.mp4?alt=media&token=b6b1e5a3-25c5-42ee-bc6b-11c051a82bbd"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fpeldak_egyenletmegoldasra.mp4?alt=media&token=bcf145d2-a2f3-4233-a226-e8f49c432661"));break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fosszetett_egyenletek_megoldasa.mp4?alt=media&token=b203e13f-7e38-4760-9d13-144975b1446a"));break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Felsofoku_egyenlet_megoldasa.mp4?alt=media&token=3dfdabf9-5c7a-41c8-bdce-5889ab4eaa83"));break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fmasodfoku_egyenlet_megoldokeplete.mp4?alt=media&token=ab2b4397-9a61-4245-9853-ff46fbc1380b"));break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fmasodfoku_egyenlet_megoldasa_szorzatta_alakitassal.mp4?alt=media&token=98e8892c-9524-4e91-889c-5a806c885f9c"));break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fmasodfoku_egyenlotlensegek.mp4?alt=media&token=573783ae-cf96-49b3-a3a2-05998d39cf04"));break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fszorzas_osztas_egyenlotlenseg_eseten.mp4?alt=media&token=96c51414-996d-4fcb-967a-8941bf9fcd1e"));break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fketlepeses_egyenlotlensegek.mp4?alt=media&token=35266cdc-5e86-4017-8888-04de84292289"));break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fegyszeru_masodfoku_egyenlet_megoldasa.mp4?alt=media&token=f9e5ac5e-0c3c-49af-9c7e-dae19a8fa085"));break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Flogaritmus.mp4?alt=media&token=0972f764-0995-4f63-a413-51dd49d925f1"));break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Flogaritmus_azonossagainak_alkalmazasa.mp4?alt=media&token=37f7297b-43d3-4b75-a954-1d1fc6c307ee"));break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Ftermeszetes_alapu_logaritmus_ertekenek_meghatarozasa.mp4?alt=media&token=13b69915-0829-466e-b0b9-76c817b09a12"));break;
                    case 17:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Ffuggvenyek.mp4?alt=media&token=8b474ba7-8682-4ba1-9eec-4dd9bcfb4bdc"));break;
                    case 18:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Ffuggvenyek_grafikonjai.mp4?alt=media&token=bbc048a6-6381-49f1-9016-7e26d6da50c4"));break;
                    case 19:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Ffuggvenytranszformaciok.mp4?alt=media&token=a802ebfb-60e7-4e9b-a9d2-6b3a097abfff"));break;
                    case 20:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fertelmezesi_tartomany_es_ertekkeszlet_meghatarozasa.mp4?alt=media&token=9977007a-fd3b-447b-b25d-b1e0d9eb94be"));break;
                    case 21:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Ffuggveny_ertekenek_leolvasasa.mp4?alt=media&token=28594ab7-ed03-4b8e-a61f-1ce65be67ac0"));break;
                    case 22:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Kilencedik_osztaly%2Fpontok_koordinatainak_meghatarozasa.mp4?alt=media&token=831ac9ba-3d5d-469e-ae6f-7db285f74afc"));break;






                }
                videoView.setMediaController(new MediaController(Kozep_elso_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }

}
