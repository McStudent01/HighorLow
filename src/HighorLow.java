import java.util.Scanner;

public class HighorLow {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int randomNumber = (int)(Math.random() * 10 + 1);

        System.out.println("Guess a number between 1 and 10:");
        int userGuess = scanner.nextInt();

        do
        {
            if (userGuess < randomNumber)
            {
                System.out.println("Your guess is too low.");
            } else if (userGuess > randomNumber)
            {
                System.out.println("Your guess is too high.");
            } else
            {
                break;
            }

            System.out.println("Guess again:");
            userGuess = scanner.nextInt();
        } while (userGuess != randomNumber);
        System.out.println("Your guess is correct!");
    }
}
