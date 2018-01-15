package csci305.javalab;

public class Rock extends Element {

	public Rock(String name) {
		super(name);
	}

	public Outcome compareTo(Element element) {
		Outcome outcome = null;
		// Win cases
		if (element instanceof Lizard) {
			outcome = new Outcome(Outcome.RCL, Outcome.WIN);
		} else if (element instanceof Scissors){
			outcome = new Outcome(Outcome.RCS, Outcome.WIN);
		} 
		// Tie case
		else if (element instanceof Rock) {
			outcome = new Outcome("Rock equals Rock", Outcome.TIE);
		} 
		// Lose cases
		else if (element instanceof Paper) {
			outcome = new Outcome(Outcome.PCR, Outcome.LOSE);
		} else if (element instanceof Spock) {
			outcome = new Outcome(Outcome.SVR, Outcome.LOSE);
		}

		return outcome;
	}
}
