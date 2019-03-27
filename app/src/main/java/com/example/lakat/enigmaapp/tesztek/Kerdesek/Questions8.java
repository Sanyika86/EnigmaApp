package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions8 {

    public  String mQuestions[] = {

            "Egy 96 g tömegű ruhaanyag 80% vizet tartalmaz . Az anyag tömege száradás után lecsökken 80 g-ra. Hány százalék nedvesség van most az anyagban?",
            "Egy 36 g tömegű ruhaanyag 50% vizet tartalmaz . Az anyag tömege száradás után lecsökken 30 g-ra. Hány százalék nedvesség van most az anyagban?",
            "2x-8y=0 x és y értéke?",
            "12x+3y=18 x és y értéke?",
            "2x+10y=60 x és y értéke?",
            "8x-2y=30 x és y értéke?"

    };

    private String mChoices [][] = {

            {"70","12","75","76"},
            {"10","40","50","30"},
            {"x:4 y:1","x:5 y:3","x:4 y:3","x:5 y:1"},
            {"x:2 y:1","x:1 y:2","x:3 y:5","x: 8 y:3"},
            {"x:5 y:5","x:8 y:6","x:5 y:2","x:5 y:6"},
            {"x:5 y:1","x:5 y:2","x:4 y:1","x:4 y:2"},



    };

    private  String mCorrectAnswers[] = {"76%","40%","x:4 y:1","x:1 y:2","x:5 y:5","x:4 y:1"};

    public String getQuestion(int a){

        String question = mQuestions[a];
        return question;

    }

    public String getChoice1(int a){

        String choice = mChoices[a][0];
        return choice;

    }

    public String getChoice2(int a){

        String question = mChoices[a][1];
        return question;

    }
    public String getChoice3(int a){

        String question = mChoices[a][2];
        return question;

    }
    public String getChoice4(int a){

        String question = mChoices[a][3];
        return question;

    }

    public String getCorrectAnswer(int a){

        String answer = mCorrectAnswers[a];
        return answer;

    }

}
