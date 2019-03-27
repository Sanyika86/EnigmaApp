package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions6 {

    public  String mQuestions[] = {

            "Gondolok egy számra. Ha hozzáadok ennyit: 7 és az eredményt megszorzom hárommal, akkor 27-t kapok. Melyik számra gondoltam?",
            "Gondolok egy számra. Ha elveszek belőle ennyit: 5 és az eredményt megszorzom hattal, akkor 54-t kapok. Melyik számra gondoltam?",
            "Gondolok egy számra. Ha a gondolt számot megszorzom kettővel és hozzáadom a felét, akkor az eredmény 30. Melyik számra gondoltam?",
            "Gondolok egy számra. A szám egyharmada ennyivel kisseb, mint a fele: 5. Melyik számra gondoltam?",
            "Amikor Balázs annyi éves lesz, mint Ádám most, akkor Ádám 9 éves lesz. Amikor Ádám annyi éves volt , mint Balázs most, Balázs 3 éves volt. Hány éves jelenleg Ádám és Balázs?",
            "Novákék az árvíz után az egyik szivattyúval a vizet 240 perc alatt, a másikkal 120 perc alatt szivattyúznák ki a pincéből. Mennyi ideig tartana a szivattyúzás, ha mindkét szivattyút használnák?"

    };

    private String mChoices [][] = {

            {"2","12","5","31"},
            {"14","24","5","3"},
            {"33","12","3","1"},
            {"25","22","30","4"},
            {"2 és 7 éves","5 és 8 éves","10 és 9 éves","7 és 5 éves"},
            {"80","100","15","21"},



    };

    private  String mCorrectAnswers[] = {"2","14","12","30","7 és 5 éves","80"};

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
