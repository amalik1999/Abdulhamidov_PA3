package Problem1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CAI3 {

    static Scanner scan = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
    static int n1 = secureRandom.nextInt(9) + 1;
    static int n2 = secureRandom.nextInt(9) + 1;
    static int answer = n1 * n2;
    static int studentAnswer;
    Random random = new Random();
    static int count = 0, correct = 0, wrong = 0;

    public static void quiz() {
        askQuestion();
        readResponse();
        isAnswerCorrect();
        displayCompletionMessage();
    }

    public static void askQuestion() {
        for (count = 0; count < 10; count++) {
            int n1 = secureRandom.nextInt(9) + 1;
            int n2 = secureRandom.nextInt(9) + 1;
            int answer = n1 * n2;
            int studentAnswer;
            System.out.println("What is " + n1 + " times " + n2);
            studentAnswer = scan.nextInt();
            if (studentAnswer == answer) {
                correct++;
            } else {
                wrong++;
            }
        }
    }

    public static void readResponse(){
        System.out.println(studentAnswer);
    }

    public static void isAnswerCorrect(){
        if(studentAnswer == answer){
            displayCorrectAnswer();
        }else{
            displayIncorrectAnswer();

        }
    }

    public static void displayCorrectAnswer(){
        if(studentAnswer==answer){
            System.out.println("Very Good!");
        }

    }

    public static void displayIncorrectAnswer(){
        while (studentAnswer!=answer){
            System.out.println("No. PLease try again");
            System.out.println("Another question? Yes or No");
            String response = scan.next();
        }
    }

    public static void displayCompletionMessage(){
        if(correct == 8){
            System.out.println("Congratulations, you are ready to go to the next level");
        }
    }

    public static void main(String[] args) {
        quiz();


    }


}
