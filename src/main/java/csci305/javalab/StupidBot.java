package csci305.javalab;

public class StupidBot extends Player {

    public StupidBot(String name) {
        super(name);
    }

    public Element play() {
        return lastPlayed = Moves.get(1);
    }
}