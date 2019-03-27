package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions3 {

    public  String mQuestions[] = {

            "Alkalmazd  megfelelő matematikai műveletet! 10 ? 2 = 8",
            "Alkalmazd  megfelelő matematikai műveletet! 10 ? 4 = 14",
            "Alkalmazd  megfelelő matematikai műveletet! 10 ? 2 = 5",
            "Alkalmazd  megfelelő matematikai műveletet! 8 ? 4 = 32",
            "28:7=?",
            "12:4=?",
            "3:3=?",
            "15:3=?",
            "20:4=?",
            "1:1=?"

    };

    private String mChoices [][] = {

            {"+","-","*",":"},
            {"-","+",":","*"},
            {"+","*","-",":"},
            {"+","-","*",":"},
            {"4","12","8","1"},
            {"2","1","5","3"},
            {"9","1","5","3"},
            {"2","4","5","3"},
            {"3","12","3","5"},
            {"0","2","1","4"},



    };

    private  String mCorrectAnswers[] = {"-","+",":","*","4","3","1","5","5","1"};

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
