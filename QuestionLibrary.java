package com.example.android.vladsquiz2;

public class QuestionLibrary {

    public String mQuestions [] = {
            "If you purchase a bond and interest rates rise, what will happen to the price of the bond?",
            "Please tell me whether this statement is true or false: Buying a single company's stock usually provides a safer return than a stock mutual fund.",
            "Who decides what prime rate is?",
            "Suppose you have $200 in a savings account earning 2% annual interest. How much will you have after 4 years?"

    };


    public String mChoices [][] = {
            {"Rise", "Stay the same", "Fall"},
            {"True", "False", "Inconclusive"},
            {"The President", "The Federal Reserve", "The House and Senate"},
            {"$108", "More than $108", "Less than $108"}
    };



    private String mCorrectAnswers[] = {"Fall", "False", "The Federal Reserve", "More than $108"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
