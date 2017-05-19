package behavioral.chainofresponsibility;

public class ConcreteHandler3 implements Handler{


	Handler successor;
	
	@Override
	public void handle(String request) {
		if(request.equalsIgnoreCase("R3")){
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
