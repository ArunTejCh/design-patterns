package behavioral.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		Handler c1 = new ConcreteHandler1();
		Handler c2 = new ConcreteHandler2();
		Handler c3 = new ConcreteHandler3();
		
		c1.setSuccessor(c2);
		c2.setSuccessor(c3);

		System.out.println( "Sending R2...");
        c1.handle("R2");
        System.out.println( "Sending R3...");
        c1.handle("R3");
        System.out.println( "Sending R1...");
        c1.handle("R1");
        System.out.println( "Sending RX...");
        c1.handle("RX");
		
	}

}
