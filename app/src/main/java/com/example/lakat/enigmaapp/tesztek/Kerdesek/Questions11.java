package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions11 {
    public  String mQuestions[] = {

            "Hány különböző rendszám adható ki, amely három betűből és azt követő három számból áll (az angol ábécé 25 betűt tartalmaz)?",
            "Hány olyan hatjegyű szám létezik, amelyben van két azonos számjegy? És hány ilyen 15-jegyű szám létezik?",
            "Hányféleképpen tölthető ki egy lottószelvény? Hány 5, 4 és 3 találatos kitöltés van?",
            "Az 1, 2, 3, 4, 5 számjegyekből hány háromjegyű szám készíthető, ha a számjegyek nem ismétlődhetnek. És akkor, ha ismétlődhetnek? ",
            " 10 ember között 4 egyforma nyereményt sorsolnak ki. Hányféleképpen végződhet a sorsolás,ha mindenki csak egyszer nyerhet? És akkor hány végeredmény lehet, ha négy különböző nyereményt sorsolnak ki és mindenki egyszer nyerhet? És ha mindenki többször is nyerhet?",


    };

    private String mChoices [][] = {

            {"26","13","26^3*10^3","31"},
            {"763920","4000","58610","15"},
            {"90alatt5","90alatt4","4562150","1"},
            {"120","210","125","44"},
            {"210","120","88","11"},




    };

    private  String mCorrectAnswers[] = {"26^3*10^3","763920","90alatt5","125","210"};

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
