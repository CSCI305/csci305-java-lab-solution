package csci305.javalab;

import java.util.Random;

public class LastPlayBot extends Player {

    private Random rand;

    public LastPlayBot(String name) {
        super(name);
        rand = new Random();
    }

    public Element play() {
        if (opponent.getLastPlayed() == null) {
            int selection = rand.nextInt(5) + 1;

            return lastPlayed = Moves.get(selection);
        } else {
            return lastPlayed = opponent.getLastPlayed();
        }
    }
}