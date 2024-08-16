import java.util.Random;
import java.util.Scanner;

public class HighLowGame {

    public static void main(String[] args) {
        Random random = new Random();
        int num = getNum(random);
        int score = 0;
        try (Scanner scnr = new Scanner(System.in)) {
            System.out.println("Hello! Welcome to the high-Low Game, in this game you will guess if a random number between 1 and 100 will be higher or lower than the previous.");
            System.out.println("If you want to guess - Lower - type 1, and if you want to guess - Higher - Type 2, and if you want to quit, type 3.");
            
            while (true) {
                int newNum = getNum(random);
                System.out.println("Number - " + num);
                int guess = scnr.nextInt();
                
                if (guess == 1) {
                    if (num > newNum) {
                        int oldNum = newNum;
                        num = newNum;
                        System.out.println("Correct! number was " + oldNum);
                        ++score;
                        System.out.println("Score is - " + score);
                    } else if (num < newNum) {
                        int oldNum = newNum;
                        num = newNum;
                        System.out.println("Sorry, Incorrect, number was " + oldNum);
                        score = 0;
                        System.out.println("Score is - " + score);
                    }
                }
                
                if (guess == 2) {
                    if (num > newNum) {
                        int oldNum = newNum;
                        num = newNum;
                        System.out.println("Sorry, Incorrect, number was " + oldNum);
                        score = 0;
                        System.out.println("Score is - " + score);
                    }
                    else if (num < newNum) {
                        int oldNum = newNum;
                        num = newNum;
                        System.out.println("Correct! number was " + oldNum);
                        ++score;
                        System.out.println("Score is - " + score);
                    }
                }
                if (guess == 3) {
                    break;
                }
            }
        }
    }
    
    public static int getNum(Random random) {
        int randomNumber = random.nextInt(100) + 1;
        return randomNumber;
    }
}


