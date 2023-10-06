import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
        System.out.println("Guess the secret number, between 1 and 9");

        Scanner reader = new Scanner(System.in);
        int secretNumber = reader.nextInt();

//        If input is correct, they guessed correctly
        if (secretNumber == 6){
            System.out.println("Congratulations you guessed it");
        } else if (secretNumber < 6){
            System.out.println("Too low, guess higher");
        } else{
            System.out.println("Too high, guess lower");
        }

    }

}
