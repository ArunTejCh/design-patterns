package creational.factorymethod;

public class Tester {

	public static void main(String[] args) {
		
		Factory pf = new PriusFactory();
		pf.setOrder("Prius");
		pf.buildOrder();

		Factory lf = new LamborginiFactory();
		lf.setOrder("Aventador");
		lf.buildOrder();
		
		Factory tf = new TataFactory();
		tf.setOrder("Indica");
		tf.buildOrder();
	}

}
