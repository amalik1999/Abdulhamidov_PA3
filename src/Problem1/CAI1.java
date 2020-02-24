package Problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
    static Scanner scan = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
   static int n1 = secureRandom.nextInt(9) + 1;
   static int n2 = secureRandom.nextInt(9) + 1;
    static int answer = n1 * n2;
    static int studentAnswer;

    public static void quiz() {
        askQuestion();
        readResponse();
        isAnswerCorrect();
    }

    public static void askQuestion() {
        System.out.println("What is " + n1 + " times " + n2);
        studentAnswer = scan.nextInt();
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

    public static void main(String[] args) {
        quiz();


    }

}