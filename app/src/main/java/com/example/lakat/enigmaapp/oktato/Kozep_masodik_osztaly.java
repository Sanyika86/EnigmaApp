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

public class Kozep_masodik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kozep_masodik_osztaly);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView = (VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList = new ArrayList<>();
        videoList.add("Derékszögű háromszögek!");
        videoList.add("Egységmátrix!");
        videoList.add("Egységmátrix determinánsa!");
        videoList.add("Egységmátrix inverze!");
        videoList.add("Gauss-elimináció!");
        videoList.add("Geometria bevezetés!");
        videoList.add("Geometriai alapfogalmak!");
        videoList.add("Képzetes egység!");
        videoList.add("Mátrix skalárral való szorzása!");
        videoList.add("Mátrixok bevezetés!");
        videoList.add("Mátrixok összeadása, kivonása!");
        videoList.add("Műveletek komplex számokkal!");
        videoList.add("Párhuzamos merőlegesek felismerése!");
        videoList.add("Pitagorász-tétel!");
        videoList.add("Pontok távolságának vizsgálata!");
        videoList.add("Sokszög belső szögeinek összege!");
        videoList.add("Szakasz felezőpontja!");
        videoList.add("Szakaszok összeadása!");
        videoList.add("Szög alapok!");
        videoList.add("Szögek meghatározása, csúcsszögek!");
        videoList.add("Szögfajták!");
        videoList.add("Belső szögek összege 180 fok!");


        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fderekszogu_haromszogek.mp4?alt=media&token=82cb69d0-72ad-4595-9c22-5d0c9f02bada"));
                        break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fegysegmatrix.mp4?alt=media&token=bfe8b0ec-2b03-4d9d-9e13-b7a95a805616"));
                        break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fegysegmatrix_determinansa.mp4?alt=media&token=02104a4e-4b89-4f49-84dd-c1e40cc79ab5"));
                        break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fegysegmatrix_inverze.mp4?alt=media&token=4a059627-ccc1-4d6d-93f0-752d820dcccb"));
                        break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fgauss_eliminacio.mp4?alt=media&token=d4742b7f-ea09-488e-bbd6-4bbf79cb7569"));
                        break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fgeometria_bevezetes.mp4?alt=media&token=128cd641-cc87-4f2a-ae4a-46090694eeda"));
                        break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fgeometriai_alapfogalmak.mp4?alt=media&token=b40d35f2-d1c2-4d24-82d7-4da3f097befe"));
                        break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fkepzetes_egyseg.mp4?alt=media&token=1872510f-b817-4d25-8e02-df399143cd3e"));
                        break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fmatrix_skalarral_valo_szorzasa.mp4?alt=media&token=2ae7af2a-0947-4b58-a025-244a695496d6"));
                        break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fmatrixok_bevezetes.mp4?alt=media&token=237a85e8-3f4d-4caa-9a84-f72311ce5210"));
                        break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fmatrixok_osszeadasa_kivonasa.mp4?alt=media&token=a5f28343-fa7c-4bd9-b475-799f4c1ef375"));
                        break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fmuveletek_komplex_szamokkal.mp4?alt=media&token=d1995a3f-813c-4541-9c89-c639611230ca"));
                        break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fparhuzamosok_merolegesek_felismerese.mp4?alt=media&token=74815d42-eeda-4c4d-b6fa-41f0aab6bd8b"));
                        break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fpitagorasz_tetel.mp4?alt=media&token=fb738c2f-298c-4c12-bbf5-6b3654755718"));
                        break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fpontok_tavolsaganak_vizsgalata.mp4?alt=media&token=a69d442b-822d-4e48-aa83-68ed3c701649"));
                        break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fsokszog_belsoszogeinek_osszege.mp4?alt=media&token=b7b51015-df51-43c9-9891-125227791679"));
                        break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fszakasz_felezopontja.mp4?alt=media&token=19d38063-2354-4c2a-9b39-5e72c902af64"));
                        break;
                    case 17:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fszakaszok_osszeadasa.mp4?alt=media&token=b8aa41a6-4216-4831-b929-b386674af366"));
                        break;
                    case 18:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fszog_alapok.mp4?alt=media&token=da08e4f8-aa96-4c30-9c87-9f1acaa74e1c"));
                        break;
                    case 19:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fszogek_meghatarozasa_csucsszogek.mp4?alt=media&token=911fd66d-ebe4-476a-97ca-9748cac808b0"));
                        break;
                    case 20:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fszogfajtak.mp4?alt=media&token=a36222fc-e240-4504-b7db-7878e5c548ab"));
                        break;
                    case 21:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Tizedik_osztaly%2Fbelsoszogek_osszege_szaznyolcvanfok.mp4?alt=media&token=e9d36bf4-75f4-467e-b0e0-08dcfb4fd175"));
                        break;


                }
                videoView.setMediaController(new MediaController(Kozep_masodik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}

