package quiz.classes;

import quiz.interfaces.QuizQuestion;

import java.util.Map;
import java.util.Random;

public class SubtracktionQuestion implements QuizQuestion {

    private int firstNumber;
    private int secondNumber;

    public SubtracktionQuestion() {


        /*this.firstNumber = new Random().nextInt(50) +1;
        this.secondNumber = new Random().nextInt(firstNumber);*/
        this.firstNumber = new Random().nextInt(50) +1;
        this.secondNumber = new Random().nextInt(50);
        if (firstNumber < secondNumber) {
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temp;
        }
        /*do {
            this.firstNumber = new Random().nextInt(50) +1;
            this.secondNumber = new Random().nextInt(50);
        }while (secondNumber > firstNumber);*/
    }

    @Override
    public String getQuestion() {
        return "What is the sum of " + firstNumber +" - " + secondNumber;
    }

    @Override
    public int getCorrectAnswer() {
        return firstNumber - secondNumber;
        //return Math.abs(firstNumber - secondNumber);
    }
}
