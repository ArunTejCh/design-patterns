package behavioral.chainofresponsibility;

public interface Handler {

	void handle(String request);
	void setSuccessor(Handler succ);
	
}
