package csci305.javalab;

public class Paper extends Element {

	public Paper(String name) {
		super(name);
	}

	public Outcome compareTo(Element element) {
		Outcome outcome = null;
		
		if (element instanceof Lizard) {
			outcome = new Outcome(Outcome.LEP, Outcome.LOSE);
		} else if (element instanceof Scissors){
			outcome = new Outcome(Outcome.SCP, Outcome.LOSE);
		} 
		else if (element instanceof Rock) {
			outcome = new Outcome(Outcome.PCR, Outcome.WIN);
		} 
		else if (element instanceof Paper) {
			outcome = new Outcome("Paper equals Paper", Outcome.TIE);
		} else if (element instanceof Spock) {
			outcome = new Outcome(Outcome.PDS, Outcome.WIN);
		}

		return outcome;
	}
}
