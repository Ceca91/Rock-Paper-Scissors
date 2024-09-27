import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean isDraw = true;
        while (isDraw) {
            System.out.println("Hello! Let's play!");
            System.out.print("Choose [r]ock, [p]aper, or [s]cissors: ");
            String playerMove = scanner.nextLine();

            if (playerMove.equalsIgnoreCase("r") || playerMove.equalsIgnoreCase("rock")){
                playerMove = ROCK;

            } else if (playerMove.equalsIgnoreCase("p") || playerMove.equalsIgnoreCase("paper")) {
                playerMove = PAPER;
            } else if (playerMove.equalsIgnoreCase("s") || playerMove.equalsIgnoreCase("scissors")) {
                playerMove = SCISSORS;
            }else {
                System.out.println("Invalid Input! Try again! ");
                return;
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(4);
            String computerMove = switch (computerRandomNumber) {
                case 1 -> ROCK;
                case 2 -> PAPER;
                case 3 -> SCISSORS;
                default -> "";
            };

            if (playerMove.equals(ROCK) && computerMove.equals(SCISSORS)
                    || playerMove.equals(PAPER) && computerMove.equals(ROCK)
                    || playerMove.equals(SCISSORS) && computerMove.equals(PAPER)) {
                System.out.println("Computer move is " + computerMove);
                System.out.println("You win!");
                isDraw = false;
            } else if (playerMove.equals(ROCK) && computerMove.equals(PAPER)
                    || playerMove.equals(PAPER) && computerMove.equals(SCISSORS)
                    || playerMove.equals(SCISSORS) && computerMove.equals(ROCK)) {
                System.out.println("Computer move is " + computerMove);
                System.out.println("You lost!");
                isDraw = false;
            } else {
                System.out.println("This game was a draw! Let's play again!");
            }
        }

    }
}