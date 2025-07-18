package enum1;

public class Computer extends ElectricDevice {
	private PowerState powerState = PowerState.OFF;

	public PowerState getPowerState() {
		return powerState;
	}

	@Override
	public void turnOn() {
		powerState = PowerState.ON;
	}

	@Override
	public void turnOff() {
		powerState = PowerState.OFF;
	}

	public void suspend() {
		powerState = PowerState.SUSPEND;
	}

	public void setState(PowerState state) {
		switch (state) {
		case ON:
			turnOn();
			break;
		case OFF:
			turnOff();
			break;
		case SUSPEND:
			suspend();
			break;
		}
		System.out.println(state);
	}
}