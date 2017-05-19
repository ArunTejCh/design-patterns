package stuctural.decorator;

public class Tester {

	public static void main(String[] args) {
		
		Component test = new ConcreteDecoratorB(new ConcreteDecoratorA(new ConcreteComponent()));
		System.out.println(test.operation());
		
	}

}
