package creational.factorymethod;

public class LamborginiFactory extends Factory{

	@Override
	public Engine getEngine() {
		return new Gas();
	}

}
