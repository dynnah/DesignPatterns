package aplication;

import model.Aluguel;
import model.Fita;
import model.Cliente;
import model.Tipo;

public class Teste {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Maria");
		Fita fita1 = new Fita("Bacurau", Tipo.lancamento);
		Aluguel aluguel1 = new Aluguel(fita1, 7);
		
		cliente1.adicionaAluguel(aluguel1);
		
		System.out.println(cliente1.extrato());
	}

}