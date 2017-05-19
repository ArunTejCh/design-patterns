package creational.factorymethod;

public class TataFactory extends Factory{

	@Override
	public Engine getEngine() {
		return new Electric();
	}

}
