package stuctural.decorator;

public class ConcreteDecoratorA extends Decorator {

	private String extraStuff;

	public ConcreteDecoratorA(Component c) {
		super(c);
	}

	@Override
	public String operation() {
		extraStuff = c.operation();
		return addedBehavior(extraStuff);
	}

	public String addedBehavior(String arg) {
		return "Hey yo " + arg;
	}

}
