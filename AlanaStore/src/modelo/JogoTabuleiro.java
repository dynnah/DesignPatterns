package modelo;

import java.util.ArrayList;

public class JogoTabuleiro extends Jogo {

	private String estilo;
	private ArrayList<String> adereco;
	
	public JogoTabuleiro(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas, String estilo, ArrayList<String> adereco) {
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas);
		this.estilo = estilo;
		this.adereco = adereco;
	}

	public String getEstilo() {
		return estilo;
	}
	
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public ArrayList<String> getAdereco() {
		return adereco;
	}
	
	public void setAdereco(ArrayList<String> adereco) {
		this.adereco = adereco;
	}
	
	
	public float calcularTotal() {
		
		float desconto = (float) ((super.getPrecoAluguel()/super.getQuantidadePessoas()) * 0.10);
		float resultado = (super.getPrecoAluguel()/super.getQuantidadePessoas()) - desconto;
		return resultado;
	
	}
}
