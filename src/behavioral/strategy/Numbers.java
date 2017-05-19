package behavioral.strategy;

public class Numbers {

	Sorter s;
	
	public Numbers() {
		s = new BubbleSort();
	}

	public void changeStrategy(Sorter s){
		this.s = s;
	}
	
	public void doTheThing(){
		s.doSort();
	}
	
}
