package creational.factorymethod;

public class PriusFactory extends Factory{

	@Override
	public Engine getEngine() {
		return new Hybrid();
	}

}
