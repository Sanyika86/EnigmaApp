package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions7 {

    public  String mQuestions[] = {

            "A vonatnak 3 vagonja van. Közülük egy kék, a többi piros. Hány különböző sorrendet hozhatunk létre a vagonokból?",
            "A vonatnak 10 vagonja van. Közülük egy kék, a többi piros. Hány különböző sorrendet hozhatunk létre a vagonokból?",
            "A vonatnak 6 vagonja van. Közülük kettő kék, a többi piros. Hány különböző sorrendet hozhatunk létre a vagonokból?",
            "A vonatnak 7 vagonja van. Közülük kettő kék, a többi piros. Hány különböző sorrendet hozhatunk létre a vagonokból?",
            "Mennyi a LKO(3,12)?",
            "Mennyi a LKO(30,25)?"

    };

    private String mChoices [][] = {

            {"4","2","5","3"},
            {"10","4","5","3"},
            {"3","12","3","15"},
            {"21","28","5","4"},
            {"2","12","8","3"},
            {"2","1","5","21"},



    };

    private  String mCorrectAnswers[] = {"3","10","15","21","3","5"};

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
