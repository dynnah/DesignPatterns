package model;

public abstract class CondimentDecorator extends Pizza {
	Pizza pizza;
	
	public CondimentDecorator(Pizza onePizza) {
		pizza = onePizza;
	}
	
	public String getDescription() {
		return pizza.getDescription() + " + " + description;
	}
	
	public double getCost() {
		return pizza.getCost() + cost;
	}
}
