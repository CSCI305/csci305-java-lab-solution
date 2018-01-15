package csci305.javalab;

import java.util.Random;

public class RandomBot extends Player {

    private Random rand;

    public RandomBot(String name) {
        super(name);
        rand = new Random();
    }

    public Element play() {
        int selection = rand.nextInt(5) + 1;

        return lastPlayed = Moves.get(selection);
    }
}