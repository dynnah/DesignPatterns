package aplicacao;

import filial.Cliente;
import filial.Funcionario;
import filial.Compra;
import modelo.*;

public class Teste {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(1, "Henrique");
		
		Funcionario funcionario = new Funcionario(1, "Álamo", "Morais Store");
		
		Compra compra = new Compra();
		
		Jogo3D jogo = new Jogo3D(1, "Kingdom Hearts", 1, (float) 15.50, 1, 2002, "Square Enix", "Playstation", 1);
		Jogo2D jogo2 = new Jogo2D(2, "Super Mario", 2, (float) 9.50, 2, 1983, "Nintendo", "Nintendo", 2);
		
		compra.setFuncionario(funcionario);
		compra.setCliente(cliente);
		compra.adicionarJogo(jogo);
		compra.adicionarJogo(jogo2);
		
		System.out.println(funcionario);
		System.out.println(cliente);
		System.out.println(compra);
		System.out.println(jogo);
		
	}
}
