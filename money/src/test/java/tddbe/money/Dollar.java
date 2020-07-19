package tddbe.money;

public class Dollar {

	public int amount;

	public Dollar(int amount) {
		this.amount = amount;
	}

	public int times(int multiplier) {
		return amount * multiplier;
	}
}
