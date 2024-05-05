import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    int attempts = 1;

    public void NumberGenerate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Specify the range");
        int lowerBound = sc.nextInt();
        int upperBound = sc.nextInt();
        System.out.println("User has 5 chances to guess the number");
        Random random = new Random();
        int f = 0;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        attempts = 1;
        while (attempts <= 5) {
            int number = acceptNumber();
            if (randomNumber == number) {
                f = 1;
                System.out.println("Correct Guess");
                if (attempts == 1) {
                    System.out.println("You guessed the number in " + attempts + " attempt.\n");
                    break;
                } else {
                    System.out.println("You guessed the number in " + attempts + " attempts.\n");
                    break;
                }
            } else if (randomNumber < number) {
                attempts++;
                System.out.println("Guess too high");
            } else {
                attempts++;
                System.out.println("Guess too low");
            }
        }
        if (f == 0) {
            System.out.println("Sorry, but you could not guess the number in 5 attempts. Better luck next time ☺\n");
        }
    }

    public int acceptNumber() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        return number;
    }

    public static void main(String[] args) {
        NumberGame game = new NumberGame();
        Scanner sc = new Scanner(System.in);
        boolean answer;
        do {
            game.NumberGenerate();
            System.out.println("Do you want to go for another round ?, True/False");
            answer = sc.nextBoolean();
        }
        while (answer);
    }
}