package behavioral.state;

public class VmPoweredOn extends VmState {

	public VmPoweredOn(VirtualMachineManager vmm) {
		super(vmm);
	}

	@Override
	public void doPowerOn() {
		vm_manager.setState(VmStates.ON);
	}

}
