package creational.factorymethod;

public abstract class Factory {

	private String order;
	
	public abstract String getEngine();
	
	public void setOrder(String order){
		this.order = order;
	}
	
	public void buildOrder(){
		System.out.println("Building order!!!");
		System.out.println(order);
		System.out.println("Putting Engine");
		System.out.println(getEngine());
		System.out.println("Assembling");
		System.out.println(order+ " Complete!!");
	}
	
	
}
