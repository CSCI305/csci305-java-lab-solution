package csci305.javalab;

public class Scissors extends Element {

    public Scissors(String name) {
        super(name);
    }

    public Outcome compareTo(Element element) {
        Outcome outcome = null;

        if (element instanceof Lizard) {
            outcome = new Outcome(Outcome.SDL, Outcome.WIN);
        } else if (element instanceof Scissors){
            outcome = new Outcome("Scissors equals Scissors", Outcome.TIE);
        }
        else if (element instanceof Rock) {
            outcome = new Outcome(Outcome.RCS, Outcome.LOSE);
        }
        else if (element instanceof Paper) {
            outcome = new Outcome(Outcome.SCP, Outcome.WIN);
        } else if (element instanceof Spock) {
            outcome = new Outcome(Outcome.SSS, Outcome.LOSE);
        }

        return outcome;
    }
}
