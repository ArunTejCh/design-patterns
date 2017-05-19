package behavioral.chainofresponsibility;

public class ConcreteHandler2  implements Handler{


	Handler successor;
	
	@Override
	public void handle(String request) {
		if(request.equalsIgnoreCase("R2")){
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
