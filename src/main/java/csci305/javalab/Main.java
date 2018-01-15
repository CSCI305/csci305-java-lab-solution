package csci305.javalab;

import java.util.Scanner;

public class Main {

	private static final String NAME = "Isaac Griffith";

	public static void main(String args[]) {

		System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by " + NAME);
		System.out.println();

		System.out.println("Please choose two players:");
		System.out.println("   (1) Human");
		System.out.println("   (2) StupidBot");
		System.out.println("   (3) RandomBot");
		System.out.println("   (4) IterativeBot");
		System.out.println("   (5) LastPlayBot");
		System.out.println("   (6) MyBot");
		System.out.println();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Select Player 1: ");
		Player p1 = selectPlayer(scanner.nextInt());
		System.out.print("Select Player 2: ");
		Player p2 = selectPlayer(scanner.nextInt());

		System.out.println();
		System.out.println(p1.getName() + " vs " + p2.getName() + ". Go!");

		p1.setOpponent(p2);
		p2.setOpponent(p1);

		int p1Score = 0;
		int p2Score = 0;

		for (int i = 1; i < 5; i++) {
			Element p1Move = p1.play();
			Element p2Move = p2.play();
			System.out.println("Round " + 1 + ":");
			System.out.println("   Player 1 chose " + p1Move.getName());
			System.out.println("   Player 2 chose " + p2Move.getName());
			Outcome out = p1Move.compareTo(p2Move);

			System.out.println("   " + out.getOutcome());
			switch (out.getRoundResults()) {
				case Outcome.WIN:
					System.out.println("   Player 1 won the round");
					p1Score += 1;
					break;
				case Outcome.LOSE:
					System.out.println("   Player 2 won the round");
					p2Score += 1;
					break;
				default:
					System.out.println("   Round was a tie");
					break;
			}
		}

		System.out.println("The score is " + p1Score + " to " + p2Score);
		if (p1Score > p2Score)
			System.out.println("Player 1 won the Game");
		else if (p1Score < p2Score)
			System.out.println("Player 2 won the Game");
		else
			System.out.println("Game was a draw");

	}

	private static Player selectPlayer(int index) {
		switch(index) {
			case 1:
				return new Human("Human");
			case 2:
				return new StupidBot("StupidBot");
			case 3:
				return new RandomBot("RandomBot");
			case 4:
				return new IterativeBot("IterativeBot");
			case 5:
				return new LastPlayBot("LastPlayBot");
			default:
				return new MyBot("MyBot");
		}
	}
}
