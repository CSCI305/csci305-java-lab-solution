package csci305.javalab;

public class Spock extends Element {

	public Spock(String name) {
		super(name);
	}

	public Outcome compareTo(Element element) {
		Outcome outcome = null;
		
		if (element instanceof Lizard) {
			outcome = new Outcome(Outcome.LPS, Outcome.LOSE);
		} else if (element instanceof Scissors){
			outcome = new Outcome(Outcome.SSS, Outcome.WIN);
		} 
		else if (element instanceof Rock) {
			outcome = new Outcome(Outcome.SVR, Outcome.WIN);
		} 
		else if (element instanceof Paper) {
			outcome = new Outcome(Outcome.PDS, Outcome.LOSE);
		} else if (element instanceof Spock) {
			outcome = new Outcome("Spock equals Spock", Outcome.TIE);
		}

		return outcome;
	}
}
