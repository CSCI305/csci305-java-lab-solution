package csci305.javalab;

public class IterativeBot extends Player {

    int previous = 1;

    public IterativeBot(String name) {
        super(name);
    }

    public Element play() {
        return lastPlayed = Moves.get(previous++);
    }
}