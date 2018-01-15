package csci305.javalab;

public abstract class Player {

    private String name;
    protected Element lastPlayed;
    protected Player opponent;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Element play();

    public Element getLastPlayed() {
        return lastPlayed;
    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }
}
