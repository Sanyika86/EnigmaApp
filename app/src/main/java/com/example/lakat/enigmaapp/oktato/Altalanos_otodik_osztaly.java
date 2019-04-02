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

public class Altalanos_otodik_osztaly extends AppCompatActivity {

    VideoView videoView;
    ListView listView;
    ArrayList<String> videoList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altalanos_otodik_osztaly);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        videoView =(VideoView) findViewById(R.id.videoView);
        listView = (ListView) findViewById(R.id.listView);
        videoList= new ArrayList<>();
        videoList.add("Tizedesjegyek helyiértéke 1. rész!");
        videoList.add("Tizedesjegyek helyiértéke 2. rész!");
        videoList.add("Tizedestörtek írásban és szóban!");
        videoList.add("Tizedestörtek kibontása helyiérték szerint!");
        videoList.add("Mennyiség kifejezése tizedestörttel!");
        videoList.add("Helyiérték összehasonlítása a tizedestörtön belül!");
        videoList.add("Atcsoportositas tizedestorteknel!");
        videoList.add("Atcsoportositas tizedestorteknel 1. pelda!");
        videoList.add("Atcsoportositas tizedestorteknel 2. pelda!");
        videoList.add("Tizedestörtek a számegyenesen!");
        videoList.add("Pontok a számegyensen!");
        videoList.add("Pozitív és negatív tizedestörtek a számegyenesen");
        videoList.add("Tizedestörtek összehasonlítása 1. példa!");
        videoList.add("Tizedestörtek összehasonlítása 2. példa!");
        videoList.add("Tizedestörtek összehasonlítása 3. példa!");
        videoList.add("Tizedestörtek összehasonlítása 4. példa!");
        videoList.add("Tizedestörtek összeadása 1. példa!");
        videoList.add("Tizedestörtek összeadása 2. példa!");
        videoList.add("Tizedestörtek összeadása 3. példa!");
        videoList.add("Tizedestörtek kivonása!");
        videoList.add("Tizedestörtek összeadása szöveges feladat!");
        videoList.add("Tizedestörtek kivonása szöveges feladat!");
        videoList.add("Tizedestörtek kivonása az írásbeli kivonás ismétlésével!");
        videoList.add("Tizedestörtek szorzása 1. példa!");
        videoList.add("Tizedestörtek szorzása 2. példa!");
        videoList.add("Tizedestörtek szorzása tizedestörtekkel!");
        videoList.add("Bennfoglalás elvégzése tizedestört eredménnyel 1. példa!");
        videoList.add("Bennfoglalás elvégzése tizedestört eredménnyel 2. példa!");
        videoList.add("Tizedestört osztása egész számmal!");
        videoList.add("Egész szám osztása tizedestörttel!");
        videoList.add("Tizedestörtek osztása!");
        videoList.add("Tizedestörtek osztása példák!");
        videoList.add("Törtek tizedestörtekké alakítása 1. példa!");
        videoList.add("Törtek tizedestörtekké alakítása 2. példa!");
        videoList.add("Törtek tizedestörtekké alakítása!");
        videoList.add("Törtek tizedestörtekké alakítása példa!");
        videoList.add("Törtek és tizedestörtek!");
        videoList.add("Tizedestörtek törtekké való alakítása 1. példa!");
        videoList.add("Tizedestörtek törtekké való alakítása 2. példa!");
        videoList.add("Tizedestörtek törtekké való alakítása 3. példa!");
        videoList.add("Tizedestörtek törtekké való alakítása 4. példa!");
        videoList.add("Tizedestörtek törtekké való alakítása 5. példa!");
        videoList.add("Százalék jelenrése 1. rész!");
        videoList.add("Százalék jelenrése 2. rész!");
        videoList.add("Egy szám százalékos, tizedestört és tört alakjának bemutatása!");
        videoList.add("Tizedestörtek százaléklábbá alakítása 1. példa!");
        videoList.add("Tizedestörtek százaléklábbá alakítása 2. példa!");
        videoList.add("Tizedestörtek százaléklábbá alakítása 3. példa!");
        videoList.add("Tizedestörtek százaléklábbá alakítása 4. példa!");
        videoList.add("Százalékérték kiszámítása példa!");
        videoList.add("Százalékszámítás szöveges példán keresztül!");
        videoList.add("Százalékszámítás példa!");
        videoList.add("Alap, százalékérték, százalékláb!");
        videoList.add("Szám kifejezése tört, tizedestört és százalékalakban!");
        videoList.add("Különböző alakban kifejezett számok sorbarendezése!");
        videoList.add("Százalékos növekedés!");
        videoList.add("Százalékszámítás 1. rész!");
        videoList.add("Százalékszámítás 2. rész!");
        videoList.add("Százalékszámítás 3. rész!");
        videoList.add("Tizedestörtek kerekítése!");
        videoList.add("Becslés tizedestörtek esetén!");
        videoList.add("Tízzel való szorzás tizedestörtek esetén!");
        videoList.add("Tízzel való osztás tizedestörtek esetén 1. példa!");
        videoList.add("Tízzel való osztás tizedestörtek esetén 2. példa!");
        videoList.add("Törtek, tizedestörtek, százalékérték összeadása, kivonása!");
        videoList.add("Törtek, tizedestörtek, százalékérték összeadása!");
        videoList.add("Törtek összeadása, kivonása!");

        adapter= new ArrayAdapter(this,android.R.layout.simple_list_item_1,videoList);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){

                    case 0:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Felso.mp4?alt=media&token=091c6e23-ee1d-4bfb-8c51-96fe4b1baaed"));break;
                    case 1:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fmasodik.mp4?alt=media&token=03d5a06d-b02e-4403-91b2-6da622d8edad"));break;
                    case 2:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharmadik.mp4?alt=media&token=b89b2bdd-77f4-4d29-90e0-af3d11f602f0"));break;
                    case 3:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyedik.mp4?alt=media&token=6aa65898-c9c3-40b3-ac85-995317184d60"));break;
                    case 4:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotodik.mp4?alt=media&token=2aa899f5-7314-4b1e-b27a-7cedaf58f46a"));break;
                    case 5:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatodik.mp4?alt=media&token=3a9bbab0-42eb-4831-b97e-48ebbe46d110"));break;
                    case 6:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhetedik.mp4?alt=media&token=11ae68a7-e8ad-4845-a3a1-cc691ff2bba8"));break;
                    case 7:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnyolcadik.mp4?alt=media&token=2d587180-3125-439d-989f-89c3a7387e59"));break;
                    case 8:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fkilencedik.mp4?alt=media&token=0abf2d62-59a0-4af9-8518-004cb2f6c095"));break;
                    case 9:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizedik.mp4?alt=media&token=d8b095ad-0e17-44e1-9001-56de5fbcd563"));break;
                    case 10:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizenegyedik.mp4?alt=media&token=f4fc00b2-1e07-4419-a800-296580adb5d2"));break;
                    case 11:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizenkettedik.mp4?alt=media&token=0a5c3b8f-01f4-454d-9f67-f32f0c286fc0"));break;
                    case 12:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizenharmadik.mp4?alt=media&token=b3c53cc1-2e3c-456f-9f98-b4f25d9abffe"));break;
                    case 13:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizennegyedik.mp4?alt=media&token=87d1c90a-81be-4772-8a14-5fd9f3a135fd"));break;
                    case 14:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizenotodik.mp4?alt=media&token=760cbf17-09f0-484a-ba22-aab77cfecdc9"));break;
                    case 15:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizenhatodik.mp4?alt=media&token=b62dfcdb-32d1-469e-bfa9-7592033d212a"));break;
                    case 16:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizenhetedik.mp4?alt=media&token=83a23cb5-aabb-4a77-adc4-a5bcc24bf1be"));break;
                    case 17:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizennyolcadik.mp4?alt=media&token=f944f541-05d9-4208-ad45-39a8a95ac563"));break;
                    case 18:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Ftizenkilencedik.mp4?alt=media&token=f1ecf885-11a4-4c3b-92ed-1d6f0e1500af"));break;
                    case 19:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszadik.mp4?alt=media&token=be6a1714-8fbe-44eb-964f-cd2e078fc2ff"));break;
                    case 20:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonegyedik.mp4?alt=media&token=408dd860-787d-4670-ae8d-a356dd1ac5cb"));break;
                    case 21:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonkettedik.mp4?alt=media&token=3500940d-11e0-4259-8445-734db18c991f"));break;
                    case 22:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonharmadik.mp4?alt=media&token=6cf7bfdc-baf5-41da-9e89-6cc6e9737756"));break;
                    case 23:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonnegyedik.mp4?alt=media&token=2935240f-8b48-42a9-b699-65e8d98215b2"));break;
                    case 24:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonotodik.mp4?alt=media&token=b7de5951-a3a0-43a9-82aa-294b7bbb47dc"));break;
                    case 25:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonhatodik.mp4?alt=media&token=bf33c659-588d-4ceb-bf2b-89c66fbe4725"));break;
                    case 26:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonhetedik.mp4?alt=media&token=9b5d4a93-3c76-4d7d-a7ac-1e085b215dd3"));break;
                    case 27:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonnyolcadik.mp4?alt=media&token=de94f72d-38f7-4de1-8aa8-04d64f10f427"));break;
                    case 28:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhuszonkilencedik.mp4?alt=media&token=6575c5ee-185b-45d3-99e0-26efa8db9428"));break;
                    case 29:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharmincadik.mp4?alt=media&token=1dca8cdd-f5ca-4fea-9101-3c11445d0a17"));break;
                    case 30:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharmincegyedik.mp4?alt=media&token=304a41f6-0a41-4946-a532-6158ae0b9f21"));break;
                    case 31:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharminckettedik.mp4?alt=media&token=c4353b30-ea3c-415b-a39a-774a51058f72"));break;
                    case 32:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharmincharmadik.mp4?alt=media&token=2b6f1601-b963-4b74-9bdb-2abf7d7048cb"));break;
                    case 33:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharmincnegyedik.mp4?alt=media&token=d8e31926-2ce6-4847-af25-13cdb2e44321"));break;
                    case 34:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharmincotodik.mp4?alt=media&token=5dbb7f83-b25a-45cc-9e67-eb9f2b212c36"));break;
                    case 35:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharminchatodik.mp4?alt=media&token=c8b8d9c8-5bc1-4177-a42b-9de61a575844"));break;
                    case 36:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharminchetedik.mp4?alt=media&token=c71d5576-8897-450c-a94f-e64fdca1723b"));break;
                    case 37:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharmincnyolcadik.mp4?alt=media&token=0a7ea823-3466-42bf-83b3-a8f1a5b0701a"));break;
                    case 38:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fharminckilencedik.mp4?alt=media&token=c0e53a32-3622-4333-b15d-d5b358daa60b"));break;
                    case 39:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvenedik.mp4?alt=media&token=88430ca5-358f-4938-b218-9ddb1bfc8cd1"));break;
                    case 40:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvenegyedik.mp4?alt=media&token=b52b5e63-115f-48d2-be74-c11248c0fca7"));break;
                    case 41:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvenkettedik.mp4?alt=media&token=47d95650-12a8-4e5c-a9da-2378a028d653"));break;
                    case 42:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvenharmadik.mp4?alt=media&token=f4e0db92-0862-4a94-9952-c12f245bea59"));break;
                    case 43:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvennegyedik.mp4?alt=media&token=9c714324-45da-4fd8-ad03-266a6dd32c57"));break;
                    case 44:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvenotodik.mp4?alt=media&token=0240728f-d40f-47f0-8a54-65ee79931b43"));break;
                    case 45:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvenhatodik.mp4?alt=media&token=fe7a758e-5c41-4eb6-9864-7b8d26bcecef"));break;
                    case 46:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvenhetedik.mp4?alt=media&token=cab3d643-9ae2-4683-bb9e-6dfa1e28bae6"));break;
                    case 47:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvennyolcadik.mp4?alt=media&token=fe8093d7-94f0-4f0d-8c95-2c3ebfc3e49c"));break;
                    case 48:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fnegyvenkilencedik.mp4?alt=media&token=3ce74a52-9eb6-4f4d-b14d-fbba4f82a4f8"));break;
                    case 49:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvenedik.mp4?alt=media&token=e09985b8-2d3e-435e-8704-a24c7971db26"));break;
                    case 50:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvenegyedik.mp4?alt=media&token=3541183b-5ccd-4bf3-9d85-8afa1ba05eb7"));break;
                    case 51:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvenkettedik.mp4?alt=media&token=5f2e0ff8-c650-46c9-883c-1f47ca10d9b5"));break;
                    case 52:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvenharmadik.mp4?alt=media&token=630b7105-b116-4303-9bf4-cbbf89079f82"));break;
                    case 53:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvennegyedik.mp4?alt=media&token=243b9686-5e68-45af-ab71-bb7b58ae29cf"));break;
                    case 54:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvenotodik.mp4?alt=media&token=522500b0-3f94-404e-b560-058eef2f8a03"));break;
                    case 55:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvenhatodik.mp4?alt=media&token=40373c89-18ca-449c-a822-027ffb09ec3a"));break;
                    case 56:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvenhetedik.mp4?alt=media&token=7493064e-9afb-4246-8a13-e3a95d22f0d1"));break;
                    case 57:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvennyolcadik.mp4?alt=media&token=1f358e55-0d1a-4444-9520-8eeaa626cd35"));break;
                    case 58:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fotvenkilencedik.mp4?alt=media&token=569f5746-be25-4278-9470-f8c788c6d9a9"));break;
                    case 59:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatvanadik.mp4?alt=media&token=4773ca1e-8b1c-4578-bc99-73890617dc55"));break;
                    case 60:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatvanegyedik.mp4?alt=media&token=f13dcecb-4f0d-41b2-8270-9e80d74c2c14"));break;
                    case 61:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatvankettedik.mp4?alt=media&token=e7015d43-8a2e-4fbd-8f88-9c276cbe3dac"));break;
                    case 62:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatvanharmadik.mp4?alt=media&token=93e15dc4-e383-485a-b427-ff0c8c701e17"));break;
                    case 63:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatvannegyedik.mp4?alt=media&token=c05695b6-f5b1-4888-bb88-63b0aa0dfbbf"));break;
                    case 64:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatvanotodik.mp4?alt=media&token=7fd3d593-996b-446c-bfca-f3236942c93a"));break;
                    case 65:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatvanhatodik.mp4?alt=media&token=fcc8259c-e1fe-4c33-8ebe-efc76a2c4c5f"));break;
                    case 66:
                        videoView.setVideoURI(Uri.parse("https://firebasestorage.googleapis.com/v0/b/enigma-2a729.appspot.com/o/Otodik_osztaly%2Fhatvanhetedik.mp4?alt=media&token=68de27d0-4201-4bcb-8cd9-c43ffdd42ad2"));break;





                }
                videoView.setMediaController(new MediaController(Altalanos_otodik_osztaly.this));
                videoView.requestFocus();
                videoView.start();
            }
        });
    }
}
