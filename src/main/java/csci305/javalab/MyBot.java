package csci305.javalab;

import java.util.Random;

public class MyBot extends Player {

    private Random rand;

    public MyBot(String name) {
        super(name);
        rand = new Random();
    }

    public Element play() {
        int selection = rand.nextInt(5) + 1;

        return Moves.get(selection);
    }
}