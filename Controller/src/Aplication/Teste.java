package Aplication;

import Model.PontuacaoController;

public class Teste {

	public static void main(String[] args) {
		PontuacaoController controller = new PontuacaoController();
		
		controller.exibirPontuacao();
		System.out.println(controller.Ataque("espiao"));
		
		controller.exibirPontuacao();
		System.out.println(controller.Ataque("soldado"));
		
		controller.exibirPontuacao();
		System.out.println(controller.Ataque("exercito"));
		
		controller.exibirPontuacao();
		System.out.println(controller.Ataque("capitao"));
		controller.exibirPontuacao();
	}
}

