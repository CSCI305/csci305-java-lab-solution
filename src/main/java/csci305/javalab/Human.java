package csci305.javalab;

import java.util.Scanner;

public class Human extends Player {

    public Human(String name) {
        super(name);
    }

    public Element play() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;

        System.out.println("(1) : Rock");
        System.out.println("(2) : Paper");
        System.out.println("(3) : Scissors");
        System.out.println("(4) : Lizard");
        System.out.println("(5) : Spock");

        do {
            System.out.print("Enter your move: ");

            input = scanner.nextInt();

            if (!isValid(input))
                System.out.println("Invalid move. Please try again.");
        } while (isValid(input));

        return lastPlayed = Moves.get(input - 1);
    }

    private boolean isValid(int input) {
        return input < 1 || input > 5;
    }
}