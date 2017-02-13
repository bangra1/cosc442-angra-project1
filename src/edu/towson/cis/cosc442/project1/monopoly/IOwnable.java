package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	String getName();

	Player getTheOwner();

	int getPrice();

	boolean isAvailable();

	boolean playAction(String msg);

	void setAvailable(boolean available);

	void setTheOwner(Player owner);

	String toString();

	public abstract void playerMoved(Player player, int playerIndex, GameMaster gameMaster);

}