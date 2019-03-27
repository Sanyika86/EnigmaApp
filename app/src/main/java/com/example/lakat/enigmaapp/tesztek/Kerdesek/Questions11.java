package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions11 {
    public  String mQuestions[] = {

            "Hogy hívnak?",
            "Mi a téglalap kerületének képlete?",
            "Hány éves vagy?",
            "Mit tudsz?",
            "Hova mennél?",
            "Lakatos?"

    };

    private String mChoices [][] = {

            {"sanyika","12","5","31"},
            {"a+b","4","5","3"},
            {"33","12","3","1"},
            {"semmit","2","5","4"},
            {"sehova","12","8","11"},
            {"igen","1","5","21"},



    };

    private  String mCorrectAnswers[] = {"sanyika","a+b","33","semmit","sehova","igen"};

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
