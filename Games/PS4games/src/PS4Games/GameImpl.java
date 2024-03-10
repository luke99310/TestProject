package PS4Games;

import java.util.Objects;

public class GameImpl implements GameInterface {

	private final String name;
	private int price;
	private int sells;
	
	public GameImpl(String name, int price, int sells) {
		super();
		this.name = name;
		this.price = price;
		this.sells = sells;
	}
	
	public String getName() {
		return this.name;
	}

	public int getPrice() {
		return this.price;
	}

	public int getSells() {
		return this.sells;
	}

	public double calculateEarnings() {
		return this.price * this.sells;
	}
	
	@Override
	public String toString() {
		return("Name: " + this.name +
			   " Price: " + this.price +
			   " Sells: " + this.sells +
			   " Rating: ");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof GameImpl)) {
			return false;
		}
		GameImpl other = (GameImpl) obj;
		return(Objects.equals(this.name, other.name)&&
			   Objects.equals(this.price, other.price)&&
			   Objects.equals(this.sells, other.sells));
		}

}
