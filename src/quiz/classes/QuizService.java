package quiz.classes;

import quiz.interfaces.QuizQuestion;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class QuizService {

    QuizQuestion[] questions;
    private int[] userAnswers;
    private Scanner keyboard = new Scanner(System.in);


    /*public int getInput() {
        try (
                int input = Integer.parseInt(keyboard.next());
        ) catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println("enter a number again");
            input = Integer.parseInt(keyboard.next());
        }
    }*/
/*private int getInput(){
    boolean repeat = true;
    int input = 0;
    do{
        System.out.println("enter your answer");
    }while(repeat);*/


    public int getInput() {
        while (true) {
            try {
                return keyboard.nextInt();
            } catch (InputMismatchException ime) {
                keyboard.next();
                System.out.println("Please enter an integer");
            }
        }
    }

    public void administrateQuiz(){
        userAnswers = new int[10];
        for (int i = 0; i < questions.length; i++) {
            int questionNr = i + 1;
            System.out.printf("Question %d: %s" ,questionNr, questions[i].getQuestion());
            userAnswers[i] = getInput();


        }
    }

    public void gradeQuiz(){
        System.out.println("Here are the correct answers!!!");
        int totalScore = 0;
        int correctAnswers = 0;

        for (int i = 0; i < questions.length; i++) {
            if (userAnswers[i] == questions[i].getCorrectAnswer()){
                correctAnswers++;
                totalScore += 10;
            }
            else {
                
            }
        }
    }


    /*public void createquiz(){
        questions = new QuizQuestion[10];
        for (int i= 0; i < questions.length; i++){
            if (Math.random() < 0.5) {
                questions[i] = new AdditionQuestion();
            }else {
                questions[i] = new SubtracktionQuestion();
            }

        }

    }*/
    private QuizQuestion generateRandomQuestion(){
        Random random = new Random();
        int randomQuestion = random.nextInt(2);
        if (randomQuestion == 0) {
            return new AdditionQuestion();
        }else {
            return new SubtracktionQuestion();
        }
    }



}
