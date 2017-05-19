package behavioral.chainofresponsibility;

public class ConcreteHandler1 implements Handler{

	Handler successor;
	
	@Override
	public void handle(String request) {
		if(request.equalsIgnoreCase("R1")){
			System.out.println(request + " being handled by "+getClass().getName());
		}else{
			if(successor != null)
				successor.handle(request);
		}
	}

	@Override
	public void setSuccessor(Handler succ) {
		this.successor = succ;
	}

}
