package behavioral.command;

public interface Command {
	
	void setReceiver(Receiver rec);
	void execute();
	
}
