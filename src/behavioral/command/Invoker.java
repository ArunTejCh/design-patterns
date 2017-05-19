package behavioral.command;

public interface Invoker {

	void setCommand(Command cmd);
	
	void invoke();
	
}
