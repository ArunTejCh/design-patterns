package behavioral.command;

public class MenuItem implements Invoker{

	Command command;
	
	@Override
	public void setCommand(Command cmd) {
		this.command = cmd;
	}

	@Override
	public void invoke() {
		this.command.execute();
	}

	
	
}
