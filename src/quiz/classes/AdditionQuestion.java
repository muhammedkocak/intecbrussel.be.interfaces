package quiz.classes;

import quiz.interfaces.QuizQuestion;

import java.util.Random;

public class AdditionQuestion implements QuizQuestion {

    private int firstNumber;
    private int secondNumber;
    private Random random = new Random();



    public AdditionQuestion() {
        this.firstNumber = random.nextInt(50);
        this.secondNumber = random.nextInt(50);

    }

    @Override
    public String getQuestion() {
        return "What is the sum of " + firstNumber +" + " + secondNumber;
    }

    @Override
    public int getCorrectAnswer() {
        return 0;
    }
}
