package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions9 {
    public  String mQuestions[] = {

            "Mik a megoldásai a következő egyenletrendszernek? x+y=13 xy=42",
            "Mik a megoldásai a következő egyenletrendszernek? 2x+y=13 xy=18",
            "Mik az alábbi másodfokú egyenlet gyökei? x^2+4x-21=0",
            "Mik a megoldásai a következő egyenletrendszernek? 3x+y=13 2x+3y=11",
            "Mik a megoldásai a következő egyenletrendszernek? 5x-3y=131 -4x-7y=-48",


    };

    private String mChoices [][] = {

            {"x1=0, x2=1, y1=-1, y2=3","x1=3, x2=4, y1=4, y2=3","x1=7, x2=6, y1=6, y2=7","nincs megoldása az egyenletrendszernek"},
            {"x1=9/2, x2=2, y1=4, y2=9","nincs megoldása az egyenletrendszernek","x1=-5/3, x2=5/3, y1=2, y2=18","x1=2, x2=0, y1=9, y2=13"},
            {"x1=3, x2=7","x=3","nincsenek gyökei","x1=3, x2=-7"},
            {"x=4, y=1","nincsenek megoldásai az egyenletrendszernek","x=1, y=1","x=1, y=-1"},
            {"nincs megoldása az egyenletrendszernek","x=1061/47, x=-284/47","x=-731/23, x=-284/23","x=107/17, x=-317/17"},




    };

    private  String mCorrectAnswers[] = {"x1=7, x2=6, y1=6, y2=7","x1=9/2, x2=2, y1=4, y2=9","x1=3, x2=-7","x=4, y=1","x=1061/47, x=-284/47"};

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
