package Model;

public class PontuacaoController {
	private Pontuacao ponto;
	private Inimigo soldado;
	private Inimigo espiao;
	private Inimigo exercito;

	public PontuacaoController() {
		ponto = new Pontuacao();
		soldado = new Soldado();
		espiao = new Espiao();
		exercito = new Exercito();
	}

	public String Ataque(String inimigo) {
		String result = "Ataque " + inimigo;

		switch(inimigo) {
		case "espiao":
			ponto.setPontuacao(espiao.getPontos());
			break;
		case "soldado":
			ponto.setPontuacao(soldado.getPontos());
			break;
		case "exercito":
			ponto.setPontuacao(exercito.getPontos());
			break;
		default:
			return "Inimigo Inexistente: " + inimigo;
		}

		return result;
	}

	public void exibirPontuacao() {
		System.out.println("Pontuacao atual = " + ponto.getPontuacao());
	}
}

