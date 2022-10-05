package games;

import java.util.Scanner;

public class DiceGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dice dice = new Dice(6);

        Player felix = new Player("Felix", 0);

        int result = dice.roll();


        for (int i = 0; i < 3; i++) {

            boolean guessIsOutOfBounds = true;
            int guess = 0;

            while (guessIsOutOfBounds) {
                System.out.print("Välj ett nummer mellan 1-6: ");
                guess = scanner.nextInt();
                if (guess >= 1 && guess <= 6) {
                    guessIsOutOfBounds = false;


                }

            }//while

            System.out.println("Du gissade " + guess + ".");
            if (result == guess) {
                System.out.println("Tärningen rullade: " + result + ".\n" + "Du vann");
                break;
            } else {
                System.out.println("Fel gissning. Du har " + (2 - i) + " försök kvar!");
            }


        }
    }


}
