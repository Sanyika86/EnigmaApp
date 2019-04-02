package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions10 {
    public  String mQuestions[] = {

            "Egy szamtani sorozatrol tudjuk, hogy a1 = minusz 7 es a8 = 896. Mennyi az elso 10 tag osszege?",
            "Egy számtani sorozat első 10 tagjának az összege fele akkora, mint a következő tíz tag összege. Az első 15 tag összege 375. Mennyi a sorozat első tagja?",
            "Egy számtani sorozatról tudjuk, hogy a8=2 és a7=162. Mennyi a10?",
            "Egy mértani sorozatról tudjuk, hogy a10+2a8=3a9 és a4=24. Mennyi a7?",
            "Egy mértani sorozatról tudjuk, hogy az első tagja 3, az első 5 tag összege 468, az első 6 tag összege pedig 9843. Mennyi az első hét tag összege?",


    };

    private String mChoices [][] = {

            {"2387","5735","5000","-172"},
            {"0","11","17","-3"},
            {"162","-162","-318","142"},
            {"192 vagy 48","24","nincs megoldás","132 vagy 64"},
            {"64728","40000","32608","58593"},




    };

    private  String mCorrectAnswers[] = {"5735","11","-318","192 vagy 48","58593"};

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
