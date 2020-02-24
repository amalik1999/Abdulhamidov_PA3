package Problem1;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class CA2 {

    static Scanner scan = new Scanner(System.in);
    static SecureRandom secureRandom = new SecureRandom();
    static Random random = new Random();
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

    public static void readResponse() {
        System.out.println(studentAnswer);
    }

    public static void isAnswerCorrect() {
        if (studentAnswer == answer) {
            displayCorrectAnswer();
        } else {
            displayIncorrectAnswer();

        }
    }

    public static void displayCorrectAnswer() {
        if (studentAnswer == answer) {
            int correctOptions = random.nextInt(4);
            switch (correctOptions) {
                case 1:
                    System.out.println("Very Good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice Work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }

        }
    }

    public static void displayIncorrectAnswer() {
        if (studentAnswer != answer) {
            int IncorrectOptions = random.nextInt(4);
            switch (IncorrectOptions) {
                case 1:
                    System.out.println("No, Please Try again");
                    break;
                case 2:
                    System.out.println("Wrong, Try once more!");
                    break;
                case 3:
                    System.out.println("Don't Give Up!");
                    break;
                case 4:
                    System.out.println("No, keep trying");
                    break;
            }
        }
    }

        public static void main (String[]args){
            quiz();


        }

    }

