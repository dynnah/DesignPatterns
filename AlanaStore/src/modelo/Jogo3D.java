package modelo;

public class Jogo3D extends JogoDigital {
	
	private String Controle;
	private int tipoControle;
	
	public Jogo3D(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			int anoCriacao, String produtora, String Controle, int tipoControle) {
		
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
		this.Controle = Controle;
		this.tipoControle = tipoControle;
	}

	public String getControle() {
		return Controle;
	}
	
	public void setControle(String Controle) {
		this.Controle = Controle;
	}
	
	public int getTipoControle() {
		return tipoControle;
	}
	
	public void setTipoControle(int tipoControle) {
		this.tipoControle = tipoControle;
	}
	
	

}
