package com.example.lakat.enigmaapp.tesztek.Kerdesek;

public class Questions {

    public String mQuestions[] = {

            "Mennyi 3+3",
            "Mennyi 5-4?",
            "Mennyi 2+9?",
            "Mennyi 10-6?",
            "Mennyi 2 darab alma és 6 körte?",
            "Mennyi 4 körtéből ha 3-at elveszünk?",
            "Mennyi 6+3",
            "Mennyi 8-4?",
            "Mennyi 2+1?",
            "Mennyi 10-7?"

    };

    private String mChoices[][] = {

            {"6", "7", "5", "1"},
            {"10", "4", "1", "3"},
            {"16", "12", "3", "11"},
            {"6", "2", "5", "4"},
            {"6", "12", "8", "11"},
            {"36", "1", "5", "21"},
            {"6", "12", "5", "9"},
            {"6", "4", "5", "3"},
            {"6", "12", "3", "1"},
            {"6", "3", "5", "4"},


    };

    private String mCorrectAnswers[] = {"6", "1", "11", "4", "8", "1", "9", "4", "3", "3"};

    public String getQuestion(int a) {

        String question = mQuestions[a];
        return question;

    }

    public String getChoice1(int a) {

        String choice = mChoices[a][0];
        return choice;

    }

    public String getChoice2(int a) {

        String question = mChoices[a][1];
        return question;

    }

    public String getChoice3(int a) {

        String question = mChoices[a][2];
        return question;

    }

    public String getChoice4(int a) {

        String question = mChoices[a][3];
        return question;

    }

    public String getCorrectAnswer(int a) {

        String answer = mCorrectAnswers[a];
        return answer;

    }


}
