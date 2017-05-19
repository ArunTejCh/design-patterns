package stuctural.decorator;

public class ConcreteDecoratorB extends Decorator {

	private String extraStuff;

	public ConcreteDecoratorB(Component c) {
		super(c);
	}

	@Override
	public String operation() {
		extraStuff = c.operation();
		return addedBehavior(extraStuff);
	}

	public String addedBehavior(String arg) {
		return "Listen what I say oo " + arg;
	}

}
