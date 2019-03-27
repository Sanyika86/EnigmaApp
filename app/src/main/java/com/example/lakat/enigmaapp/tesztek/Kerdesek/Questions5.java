package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions5 {

    public  String mQuestions[] = {

            "Amikor én 5 éves voltam apulám 23 éves volt.Most apukám háromszor idősebb, mint én.Hány éves vagyok most?",
            "A kieséses teniszbajnokságon 1 024 versenyző indult. Hány menetet játszottak összesen a bajnokságon?",
            "Novák úrnak 14 tyúkja van. 7 tyúk minden nap tojik tojást, a többi 7 csak minden másnap tojik tojást. Hány tojást tojnak a tyúkok 8 nap alatt?",
            "Lajosnak 8 almája és 3 banánja volt. Jankának adott 3 almát. Janka cserébe adott neki néhány banánt. Ezek után Lajosnak ugyanannyi banánja volt, mint almája. Hány banánt adott Janka Lajosnak?",
            "A sífelvonónál 19 síelő sorakozott. Tamás előtt ennyivel kevesebben álltak, mint mögötte: 4. Hányadik volt Tamás a sorban?",
            "Amikor én 8 éves voltam, az apukám 36 éves volt. Most apukám háromszor idősebb, mint én. Hány éves vagyok most én?"

    };

    private String mChoices [][] = {

            {"9","12","5","31"},
            {"1023","1024","512","1"},
            {"33","84","83","51"},
            {"8","2","5","4"},
            {"1","12","8","11"},
            {"14","18","5","21"},



    };

    private  String mCorrectAnswers[] = {"9","1023","84","2","8","14"};

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
