package model;

public class Pizzaiolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pizza: Mozzarella + Bacon + Cream Cheese Edge
		
		Pizza pizza1 = new Mozzarella();
		pizza1 = new BaconDecorator(pizza1);
		pizza1 = new CreamCheeseEdgeDecorator(pizza1);
		
		System.out.println(pizza1.getDescription() + " = R$" + pizza1.getCost());
		
		// Pizza: Pepperoni + Tomato + Oregano
		
		Pizza pizza2 = new Pepperoni();
		pizza2 = new TomatoDecorator(pizza2);
		pizza2 = new OreganoDecorator(pizza2);
		
		System.out.println(pizza2.getDescription() + " = R$" + pizza2.getCost());
	
	}

}


