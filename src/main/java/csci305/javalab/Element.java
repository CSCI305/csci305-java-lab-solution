package csci305.javalab;

public abstract class Element {

	protected String name;

	public Element(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public abstract Outcome compareTo(Element element);
}
