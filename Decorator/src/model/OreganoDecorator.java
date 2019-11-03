package model;

public class OreganoDecorator extends CondimentDecorator {
	public OreganoDecorator(Pizza onePizza) {
		super(onePizza);
		description = "Oregano";
		cost = 0.5;
		
	}

}