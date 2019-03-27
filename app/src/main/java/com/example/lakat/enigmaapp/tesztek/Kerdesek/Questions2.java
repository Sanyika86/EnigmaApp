package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions2 {


    public  String mQuestions[] = {

            "Jancsi megevett 7 gombócot. Péter 3 gombóccal kevesebbet.Hány gombócot evett meg Péter?",
            "Zsuzsi egy társasházban lakik a 6. emeleten.Anna 2 emelettel lejjebb lakik.Hányadik emeleten lakik Anna?",
            "Zsuzsi egy társasházban lakik a 6. emeleten.Anna 2 emelettel feljebb lakik.Hányadik emeleten lakik Anna?",
            "Jancsi megevett 10 gombócot. Péter 4 gombóccal többet.Hány gombócot evett meg Péter?",
            "Mennyi 1*1?",
            "Mennyi 2*6?",
            "84-64=?",
            "Mennyi 2*7?",
            "Mennyi 1*9?",
            "45+45=?"

    };

    private String mChoices [][] = {

            {"4","2","5","7"},
            {"6","4","5","3"},
            {"3","12","3","8"},
            {"15","12","5","14"},
            {"2","12","8","1"},
            {"12","1","5","21"},
            {"21","12","20","31"},
            {"11","14","5","3"},
            {"3","2","9","8"},
            {"90","80","75","44"},



    };

    private  String mCorrectAnswers[] = {"4","4","8","14","1","12","20","14","9","90"};

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
