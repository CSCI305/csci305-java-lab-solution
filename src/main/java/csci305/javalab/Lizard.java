package csci305.javalab;

public class Lizard extends Element {

	public Lizard(String name) {
		super(name);
	}

	public Outcome compareTo(Element element) {
		Outcome outcome = null;
		
		if (element instanceof Lizard) {
			outcome = new Outcome("Lizard equals Lizard", Outcome.TIE);
		} else if (element instanceof Scissors){
			outcome = new Outcome(Outcome.SDL, Outcome.LOSE);
		} 
		else if (element instanceof Rock) {
			outcome = new Outcome(Outcome.RCL, Outcome.LOSE);
		} 
		else if (element instanceof Paper) {
			outcome = new Outcome(Outcome.LEP, Outcome.WIN);
		} else if (element instanceof Spock) {
			outcome = new Outcome(Outcome.LPS, Outcome.WIN);
		}

		return outcome;
	}
}
