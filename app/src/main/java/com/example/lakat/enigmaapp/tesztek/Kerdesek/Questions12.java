package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions12 {
    public  String mQuestions[] = {

            "Határozzuk meg a kocka élének hosszát, ha tudjuk,hogy felszíne 294 cm2 ! ",
            "Hány liter tej fér el egy 1,5 méter élhosszúságú kocka alakú tartályban?",
            "Egy kockát egyik lapjával párhuzamos síkokkal felszeletelünk. Hány síkkal kell szétvágni a kockát, ha azt akarjuk, hogy a keletkezett testek együttes felszíne a kocka felszínének a kétszerese legyen? ",
            "Két darab 1 cm 3 -es fakocka közül az egyiket szétvágtuk 125 kis kockára. Ezután ugyanolyan vastagon befestettük az összes kockát. Hányszor több festék kell a kis kockák befestéséhez, mint a nagyéhoz? ",
            "Hány szimmetriasíkja van a kockának? Azaz hány olyan sík van, amelyre tükrözve a kockát önmagát kapjuk? ",
            "Mekkora az oldaléle annak a kockának, melynek testátlója 1?"

    };

    private String mChoices [][] = {

            {"7 cm","12 cm","5 cm","4 cm"},
            {"15","3375","5486","300"},
            {"3","12","5","1"},
            {"ötször","hatszor","hétszer","kilencszer"},
            {"8","12","9","11"},
            {"1.2","1","0.05","0.577"},



    };

    private  String mCorrectAnswers[] = {"7 cm","3375","3","ötször","9","0.577"};

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
