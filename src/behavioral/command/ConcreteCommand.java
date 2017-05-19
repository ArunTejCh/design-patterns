package behavioral.command;

public class ConcreteCommand implements Command{

	Receiver rec;
	
	@Override
	public void setReceiver(Receiver rec) {
		this.rec = rec;
	}

	@Override
	public void execute() {
		rec.doAction();
	}

}
