package edu.uhu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player propietary;
	private boolean available = true;

	public String getName() {
		return name;
	}

	@Override
	public Player getPropietary() {
		return propietary;
	}
	
	public int getPrice() {
		return 0;
	}

	public abstract boolean playAction(String msg);

	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setPropietary(Player owner) {
		this.propietary = owner;
	}
    
    public String toString() {
        return name;
    }

	@Override
	public boolean isAvailable() {
		return available;
	}

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
