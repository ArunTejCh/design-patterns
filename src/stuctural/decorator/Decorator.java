package stuctural.decorator;

public class Decorator implements Component{

	Component c;
	
	
	
	public Decorator(Component c) {
		this.c = c;
	}

	@Override
	public String operation() {
		return c.operation();
	}

}
