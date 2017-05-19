package behavioral.strategy;

public class Tester {

	public static void main(String[] args) {
		
		Numbers n = new Numbers();
		n.doTheThing();
		n.changeStrategy(new QuickSort());
		n.doTheThing();
		
	}

}
