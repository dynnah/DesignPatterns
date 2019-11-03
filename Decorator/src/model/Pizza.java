package model;

public abstract class Pizza {
	public String description;
	public double cost;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCost() {
		return cost;
	}
}
