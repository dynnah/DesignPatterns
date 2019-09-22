package Aplication;

import Model.FactoryShape;
import Model.Pessoa;

public class Teste {

	public static void main(String[] args) {
		
		FactoryShape fabrica = new FactoryShape();
		
		Pessoa sh = fabrica.getPessoa("Homem");
		System.out.println(sh.saudacao());

		Pessoa sh2 = fabrica.getPessoa("Mulher");
		System.out.println(sh2.saudacao());
		
		Pessoa sh3 = fabrica.getPessoa("Fluido");
		System.out.println(sh3.saudacao());

	}
}
