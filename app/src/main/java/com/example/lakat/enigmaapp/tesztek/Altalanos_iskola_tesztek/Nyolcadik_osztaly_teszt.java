package com.example.lakat.enigmaapp.tesztek.Altalanos_iskola_tesztek;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.lakat.enigmaapp.R;
import com.example.lakat.enigmaapp.tesztek.Kerdesek.Questions2;
import com.example.lakat.enigmaapp.tesztek.Kerdesek.Questions8;

import java.util.Random;

public class Nyolcadik_osztaly_teszt extends AppCompatActivity {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Questions8 mQuestions = new Questions8();
    private  String mAnswer;
    private int mScore = 0;
    private int mQuestionsLenght = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyolcadik_osztaly_teszt);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        r = new Random();
        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Pontok: " + mScore);

        updateQuestion(r.nextInt(mQuestionsLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer1.getText() == mAnswer){

                    mScore++;
                    score.setText("Pontok: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
                else{

                    gameover();
                }
            }
        });
        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer2.getText() == mAnswer){

                    mScore++;
                    score.setText("Pontok: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
                else{

                    gameover();
                }
            }
        });
        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer3.getText() == mAnswer){

                    mScore++;
                    score.setText("Pontok: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
                else{

                    gameover();
                }
            }
        });
        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(answer4.getText() == mAnswer){

                    mScore++;
                    score.setText("Pontok: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLenght));
                }
                else{

                    gameover();
                }
            }
        });
    }

    private void updateQuestion(int num){

        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));


        mAnswer = mQuestions.getCorrectAnswer(num);

    }

    private void gameover(){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Nyolcadik_osztaly_teszt.this);
        alertDialogBuilder.setMessage("Vége a tesztnek, " + mScore +  " pontot szereztél!")
                .setCancelable(false)
                .setPositiveButton("Új teszt indítása", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        startActivity(new Intent(getApplicationContext(), Nyolcadik_osztaly_teszt.class));
                    }
                })
                .setNegativeButton("Kilépés", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
    }

