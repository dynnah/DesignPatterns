package model;

public class TomatoDecorator extends CondimentDecorator {
	public TomatoDecorator(Pizza onePizza) {
		super(onePizza);
		description = "Tomato";
		cost = 0.5;
		
	}

}
