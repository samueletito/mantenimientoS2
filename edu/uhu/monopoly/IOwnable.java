package edu.uhu.monopoly;

public interface IOwnable {

	Player getPropietary();

	void setPropietary(Player owner);

	boolean isAvailable();

	void setAvailable(boolean available);

}