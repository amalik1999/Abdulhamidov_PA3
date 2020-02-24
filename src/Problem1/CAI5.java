package Problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {

    Scanner scan = new Scanner(System.in);
    SecureRandom secureRandom = new SecureRandom();
    int count = 0, correct = 0, wrong = 0;
    System.out.println("Choose: 1-Addition, 2-Multiplication, 3-Subtraction, 4-Division");
    int arithmeticChoice = scan.nextInt();


    if (arithmeticChoice == 1) {
        System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
        int Addchoice = scan.nextInt();
        if (Addchoice == 1) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9) + 1;
                int n2 = secureRandom.nextInt(9) + 1;
                int answer = n1 + n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " plus " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (Addchoice == 2) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(99) + 1;
                int n2 = secureRandom.nextInt(99) + 1;
                int answer = n1 + n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " plus " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (Addchoice == 3) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(999) + 1;
                int n2 = secureRandom.nextInt(999) + 1;
                int answer = n1 + n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " plus " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (Addchoice == 4) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9999) + 1;
                int n2 = secureRandom.nextInt(9999) + 1;
                int answer = n1 + n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " plus " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
    }

        if (arithmeticChoice == 2) {
        System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
        int MulChoice = scan.nextInt();
        if (MulChoice == 1) {
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
        if (MulChoice == 2) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(99) + 1;
                int n2 = secureRandom.nextInt(99) + 1;
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
        if (MulChoice == 3) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(999) + 1;
                int n2 = secureRandom.nextInt(999) + 1;
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
        if (MulChoice == 4) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9999) + 1;
                int n2 = secureRandom.nextInt(9999) + 1;
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
    }

        if (arithmeticChoice == 3) {
        System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
        int Subchoice = scan.nextInt();
        if (Subchoice == 1) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9) + 1;
                int n2 = secureRandom.nextInt(9) + 1;
                int answer = n1 - n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " minus " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (Subchoice == 2) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(99) + 1;
                int n2 = secureRandom.nextInt(99) + 1;
                int answer = n1 - n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " minus " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (Subchoice == 3) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(999) + 1;
                int n2 = secureRandom.nextInt(999) + 1;
                int answer = n1 - n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " minus " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (Subchoice == 4) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9999) + 1;
                int n2 = secureRandom.nextInt(9999) + 1;
                int answer = n1 - n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " minus " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
    }

        if (arithmeticChoice == 4) {
        System.out.println("Select from the following level of difficulties: 1, 2, 3, 4");
        int DivChoice = scan.nextInt();
        if (DivChoice == 1) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9) + 1;
                int n2 = secureRandom.nextInt(9) + 1;
                int answer = n1 / n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " divided by " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (DivChoice == 2) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(99) + 1;
                int n2 = secureRandom.nextInt(99) + 1;
                int answer = n1 / n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " divided " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (DivChoice == 3) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(999) + 1;
                int n2 = secureRandom.nextInt(999) + 1;
                int answer = n1 / n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " divided by " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
        if (DivChoice == 4) {
            for (count = 0; count < 10; count++) {
                int n1 = secureRandom.nextInt(9999) + 1;
                int n2 = secureRandom.nextInt(9999) + 1;
                int answer = n1 / n2;
                int studentAnswer;
                System.out.println("What is " + n1 + " divided by " + n2);
                studentAnswer = scan.nextInt();
                if (studentAnswer == answer) {
                    correct++;
                } else {
                    wrong++;
                }
            }
        }
    }
        if(correct>=8){
        System.out.println("Congrats you can move on to the next level");
    }else{ System.out.println("Please ask your teacher for more help"); }
}

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