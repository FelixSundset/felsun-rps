package games;

import java.util.Scanner;

public class RockPaperScissorGame {

    //@TODO: If the fields are not declared as private they can be manipulated from outside
    Player player;

    Fist aiFist;

    //@TODO: declare the methods access modifier: public, private or protected
    //An instance of the object cannot be created from outside its package if the constructor is not declared as public
    //constructor
    RockPaperScissorGame(String playerName, int playerScore) {
        player = new Player(playerName, playerScore);
        aiFist = new Fist();
    }

    public static void main(String[] args) {
        RockPaperScissorGame game = new RockPaperScissorGame("Felix", 0);
        game.playGame();

    }

    //@FIXME: declare the methods access modifier: public, private or protected
    void playGame() {
        Scanner scanner = new Scanner(System.in);
        //Forloop börjar här
        
        System.out.print("Chose Rock, Paper or Scissor: ");
        String choice = scanner.nextLine();
//tilldela variabeln stringResult ett lämpligt värde
        String stringResult = "";
        int intResult = aiFist.play();
        if (intResult == Fist.ROCK) {
            stringResult = "ROCK";
        }
        if (intResult == Fist.SCISSOR) {
            stringResult = "SCISSOR";
        }
        if (intResult == Fist.PAPER) {
            stringResult = "PAPER";
        }
        if (choice.equals("Rock") && stringResult.equals("ROCK")){
            System.out.println("Computer chose " + stringResult+ "\n" + "Draw");
        }
        if (choice.equals("Rock") && stringResult.equals("SCISSOR")) {
            System.out.println("Computer chose " + stringResult+ "\n" + "You won");
        }
        if (choice.equals("Rock") && stringResult.equals("PAPER")) {
            System.out.println("Computer chose " + stringResult+ "\n" + "You lost");
        }
        if (choice.equals("Paper") && stringResult.equals("ROCK")) {
            System.out.println("Computer chose " + stringResult+ "\n" + "You Won");
        }
        if (choice.equals("Paper") && stringResult.equals("PAPER")) {
            System.out.println("Computer chose " + stringResult+ "\n" + "Draw");
        }
        if (choice.equals("Paper") && stringResult.equals("SCISSOR")) {
            System.out.println("Computer chose " + stringResult+ "\n" + "You lost");
        }
        if (choice.equals("Scissor") && stringResult.equals("ROCK")) {
            System.out.println("Computer chose " + stringResult+ "\n" + "You lost");
        }
        if (choice.equals("Scissor") && stringResult.equals("SCISSOR")) {
            System.out.println("Computer chose " + stringResult+ "\n" + "Draw");
        }
        if (choice.equals("Scissor") && stringResult.equals("PAPER")) {
            System.out.println("Computer chose " + stringResult+ "\n" + "You won");
        }
    }
}



