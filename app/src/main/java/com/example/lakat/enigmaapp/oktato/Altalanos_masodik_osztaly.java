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

public class Altalanos_masodik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_masodik_osztaly);

        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();
        videoList.add("Szorzás előkészítése számegyenessel!");
        videoList.add("Szorzás alapjai!");
        videoList.add("Kettő és többszörösei!");
        videoList.add("Szorzótábla!");
        videoList.add("Szorzás értelmezési lehetőségei!");
        videoList.add("10, 11, 12-es szorzótábla!");
        videoList.add("Osztás, bennfoglalás alapjai!");
        videoList.add("Osztás, bennfoglalás 1. példa!");
        videoList.add("Többszörös keresése számegyenesen!");
        videoList.add("Szöveges feladat megoldása szorzással 1. rész!");
        videoList.add("Szöveges feladat megoldása szorzással 2. rész!");
        videoList.add("Szöveges feladat megoldása osztással!");
        videoList.add("Kétjegyű szám szorzása egyjegyűvel!");
        videoList.add("Kétjegyű szám szorzása egyjegyűvel maradék nélkül!");
        videoList.add("Háromjegyű szám szorzása egyjegyűvel maradék nélkül!");
        videoList.add("Kétjegyű szám szorzása egyjegyűvel példa!");
        videoList.add("Háromjegyű szám szorzása egyjegyűvel példa!");
        videoList.add("Négyjegyű szám szorzása egyjegyűvel példa!");
        videoList.add("Ötjegyű szám szorzása egyjegyűvel!");
        videoList.add("Kétjegyű szám szorzása kettőjegyűvel!");
        videoList.add("Kétjegyű szám szorzása kettőjegyűvel példa!");
        videoList.add("Írásbeli szorzás gyakorlása!");
        videoList.add("Szöveges feladat megoldása becslése!");
        videoList.add("Írásbeli osztás!");
        videoList.add("Maradékos osztás!");
        videoList.add("Maradékos osztás példa!");
        videoList.add("Maradékos osztás példák!");
        videoList.add("Osztás kettőszámjegyű osztóval példa!");
        videoList.add("Osztás kettőszámjegyű osztóval!");
        videoList.add("Szorzás ráccsal 1. rész!");
        videoList.add("Szorzás ráccsal 2. rész!");
        videoList.add("Írásbeli osztás probálgatással 1. rész!");
        videoList.add("Szöveges feladat megoldása osztással!");
        videoList.add("Szöveges feladat megoldása szorzással!");
        videoList.add("Szorzás rajzos magyarázattal 1. rész!");
        videoList.add("Szorzás rajzos magyarázattal 2. rész!");




        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszorzas_elokeszitese_szamegyenessel.mp4?alt=media&token=868f998f-deae-4efe-8ad3-1994b9dace00"));break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszorzas_alapjai.mp4?alt=media&token=dea3acc7-07c8-46a8-b029-13fd2ae3a02e"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fketto_es_tobbszorosei.mp4?alt=media&token=047a9a21-92cb-41da-a579-f026a4302594"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszorzotabla.mp4?alt=media&token=919d26f5-e16e-4b0e-b9c2-ecc46b74a8ba"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszorzas_ertelmezesi_lehetosegei.mp4?alt=media&token=0fb3025c-0faa-4e3e-b480-f283740ae484"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Ftiz_tizenegy-tizenkettes_szorzotabla.mp4?alt=media&token=628c927f-ff2a-467a-8d2d-f9307edb688f"));break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fosztas_bennfoglalas_alapjai.mp4?alt=media&token=c18d7e7c-989a-4153-8471-f924f9d516dd"));break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fosztas_bennfoglalas_elso_pelda.mp4?alt=media&token=bce9d78d-7df2-4dcf-b03e-c876eb4e0dcd"));break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Ftobbszoros_keresese_szamegyenesen.mp4?alt=media&token=325df90a-97af-4d5f-9765-7f4149bcf757"));break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszoveges_feladat_megoldasa_szorzassal_elso_resz.mp4?alt=media&token=1b776fbc-be4c-4b5b-b495-d97c6f0fce8d"));break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszoveges_feladat_megoldasa_szorzassal_masodik_resz.mp4?alt=media&token=cd0e08c3-47a0-4b85-b05a-7be9bc6646f8"));break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszoveges_feladat_megoldasa_osztassal.mp4?alt=media&token=04b28319-15f1-4e46-bafd-d2cd70dd37b1"));break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fketjegyutizes_szorzasa_egyjegyuvel.mp4?alt=media&token=6d66b569-1a00-4c8c-9541-b34e76db9489"));break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fketjegyu_szorzasa_egyjegyuvel_maradeknelkul.mp4?alt=media&token=bac541b0-f1f1-4832-b736-614272ea8cda"));break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fharomjegyu_szorzasa_egyjegyuvel_maradeknelkul.mp4?alt=media&token=383a8be6-c205-43cc-b062-65a4ab238f0f"));break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fketjegyu_szorzasa_egyjegyuvel_pelda.mp4?alt=media&token=4d5a4164-55de-4076-98d6-8b5ae33389d0"));break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fharomjegyu_szorzasa_egyjegyuvel_pelda.mp4?alt=media&token=33e697e3-e298-4125-827b-23b9277a651f"));break;
                    case 17:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fnegyjegyu_szorzasa_egyjegyuvel_pelda.mp4?alt=media&token=e86523ac-33cf-43fa-9e4f-6c243234b904"));break;
                    case 18:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fotszamjegyu_szorzasa_egyjegyuvel.mp4?alt=media&token=796efd75-7e57-4fcf-a7c5-be8a10e312a4"));break;
                    case 19:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fketjegyu_szorzasa_ketjegyuvel.mp4?alt=media&token=5c0c6e38-0d42-47b6-b280-ca2f79649350"));break;
                    case 20:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fketjegyu_szorzasa_ketjegyuvel_pelda.mp4?alt=media&token=2c00647e-fc5a-4f82-a56c-4a4975dbc36e"));break;
                    case 21:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Firasbeli_szorzas_gyakorlasa.mp4?alt=media&token=45fa821f-438b-4c14-a55e-aafc6b5ebf3f"));break;
                    case 22:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszovegesfeladat_megoldasa_becslessel.mp4?alt=media&token=de1e1b7a-58f2-419f-8444-31180603113b"));break;
                    case 23:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Firasbeli_osztas.mp4?alt=media&token=18843090-3dc4-4668-a6a4-a1cbcfab2565"));break;
                    case 24:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fmaradekos_osztas.mp4?alt=media&token=8cf17197-7e8f-48e0-9a57-e5078d17eff7"));break;
                    case 25:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fmaradekos_osztas_pelda.mp4?alt=media&token=dec5d62f-970b-484b-a5e3-b16bcfe95368"));break;
                    case 26:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fmaradekos_osztas_peldak.mp4?alt=media&token=5aa24577-d3f0-4374-8f25-dc76bc948303"));break;
                    case 27:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fosztas_ketszamjegyu_osztoval_pelda.mp4?alt=media&token=f084721d-cb11-4570-9d9c-c5fc9ec972cf"));break;
                    case 28:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fosztas_ketszamjegyu_osztoval.mp4?alt=media&token=a4912b17-0255-4855-9908-01720ed5c272"));break;
                    case 29:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszorzas_raccsal_elso_resz.mp4?alt=media&token=fe3b3455-babf-4b8a-bfcc-846fa0697120"));break;
                    case 30:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszorzas_raccsal_masodik_resz.mp4?alt=media&token=3150ede0-4cd8-435f-8109-62f94de613eb"));break;
                    case 31:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Firasbeli_osztas_probalgatassal_elsoresz.mp4?alt=media&token=5bc11188-8acf-45db-9e06-08f28467358d"));break;
                    case 32:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszoveges_feladat_megoldasa_osztassal.mp4?alt=media&token=04b28319-15f1-4e46-bafd-d2cd70dd37b1"));break;
                    case 33:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszoveges_feladat_megoldasa_szorzassal.mp4?alt=media&token=ba454bc0-a6e8-4eca-8510-1b3c5e4313a7"));break;
                    case 34:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszorzas_rajzosmagyarazattal_elso_resz.mp4?alt=media&token=8e51441a-6ab1-454a-a486-35df2a23d15b"));break;
                    case 35:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Masodik_osztaly%2Fszorzas_rajzosmagyarazattal_masodik_resz.mp4?alt=media&token=218e210c-4d07-4129-a934-528ffbc02bcf"));break;




                }
                videoView.setMediaController(new MediaController(Altalanos_masodik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
