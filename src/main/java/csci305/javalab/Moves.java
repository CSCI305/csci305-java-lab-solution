package csci305.javalab;

import java.util.ArrayList;
import java.util.List;

public class Moves {

    private static List<Element> moves = new ArrayList<>();

    static {
        moves.add(new Rock("Rock"));
        moves.add(new Paper("Paper"));
        moves.add(new Lizard("Lizard"));
        moves.add(new Spock("Spock"));
        moves.add(new Scissors("Scissors"));
    }

    public static Element get(int i) {
        return moves.get(i);
    }
}
