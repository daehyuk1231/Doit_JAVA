package oop11;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new LgTV();
		tv.powerOn();
		tv.channelUp();
		tv.channelUp();
		tv.soundUp();
		tv.powerOff();
	}
}
