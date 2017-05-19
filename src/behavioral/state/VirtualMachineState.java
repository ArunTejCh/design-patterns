package behavioral.state;

public interface VirtualMachineState {

	void doPowerOn();
	
	void doPowerOff();
	
	void doSuspend();
	
	void doReset();
	
}
