package csci305.javalab;

public class Outcome {

	public static final String SCP  = "Scissors cut Paper";
	public static final String PCR  = "Paper covers Rock";
	public static final String RCL  = "Rock crushes Lizard";
	public static final String LPS  = "Lizard poisons Spock";
	public static final String SSS  = "Spock smashes Scissors";
	public static final String SDL  = "Scissors decapitate Lizard";
	public static final String LEP  = "Lizard eats Paper";
	public static final String PDS  = "Paper disproves Spock";
	public static final String SVR  = "Spock vaporizes Rock";
	public static final String RCS  = "Rock crushes Scissors";

	public static final String WIN  = "Win";
	public static final String LOSE = "Lose";
	public static final String TIE  = "Tie";

	private String outcome;
	private String roundResult;

	public Outcome(String outcome, String roundResult) {
		this.outcome = outcome;
		this.roundResult = roundResult;
	}

	public String getOutcome() {
		return outcome;
	}

	public String getRoundResults() {
		return roundResult;
	}

	public String toString() {
		return outcome + " -- " + roundResult;
	}
}
