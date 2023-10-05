import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
        System.out.println("Guess the secret number");

        Scanner reader = new Scanner(System.in);
        int secretNumber = reader.nextInt();

//        If input is correct, output is equals to correct
        if (secretNumber == 6){
            System.out.println("Congratulations you guessed it");
        } else if (secretNumber <= 6){
            System.out.println("Too low, guess higher");
        } else{
            System.out.println("Too high, guess lower");
        }
    }
}
