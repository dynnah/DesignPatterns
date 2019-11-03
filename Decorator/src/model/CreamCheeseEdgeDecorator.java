package model;

public class CreamCheeseEdgeDecorator extends CondimentDecorator {
	public CreamCheeseEdgeDecorator(Pizza onePizza) {
		super(onePizza);
		description = "Cream Cheese Edge";
		cost = 2.5;
		
	}

}
