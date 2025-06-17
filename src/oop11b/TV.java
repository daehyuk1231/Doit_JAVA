package oop11b;

public interface TV {
	public default void setSpeaker(Speaker spaeker) {
	}

	public void powerOn();

	public void powerOff();

	public void channelUp();

	public void ChannelDown();

	public void soundUp();

	public void soundDown();
}
