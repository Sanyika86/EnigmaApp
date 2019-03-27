package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions4 {
    public  String mQuestions[] = {

            "Mit írjunk az x-ek helyére, 561-xx=511 ?",
            "Mit írjunk az x-ek helyére, 400+xx=421 ?",
            "Mit írjunk az x-ek helyére, 350-xxx=200 ?",
            "Mit írjunk az x-ek helyére, 200:x=100 ?",
            "Mit írjunk az x-ek helyére, 222-xxx=0 ?",
            "Mit írjunk az x-ek helyére, 210-xx=190 ?",
            "Alkalmazd  megfelelő matematikai műveletet az egyenletben, hogy az helyes legyen! 20?5?4=4?2",
            "Alkalmazd  megfelelő matematikai műveletet az egyenletben, hogy az helyes legyen! 10?5?2=5?5",
            "Alkalmazd  megfelelő matematikai műveletet az egyenletben, hogy az helyes legyen! 15?5?4=4?3",
            "Alkalmazd  megfelelő matematikai műveletet az egyenletben, hogy az helyes legyen! 30?5?4=4?6"

    };

    private String mChoices [][] = {

            {"50","22","15","31"},
            {"12","14","12","33"},
            {"133","112","150","140"},
            {"1","2","5","4"},
            {"122","140","88","222"},
            {"20","19","55","21"},
            {": + *","* + +",": + :","+ - -"},
            {"* : *","+ - -","* : :","* * -"},
            {": * *","- + *",": * +",": * -"},
            {": : +","+ - +",": * :",": * *"},



    };

    private  String mCorrectAnswers[] = {"50","21","150","2","222","20",": + *","* : *",": * *",": * *"};

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
