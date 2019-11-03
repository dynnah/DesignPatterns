package model;

public class BaconDecorator extends CondimentDecorator {
	public BaconDecorator(Pizza onePizza) {
		super(onePizza);
		description = "Bacon";
		cost = 1.5;
		
	}

}