package modelo;

public class Jogo2D extends JogoDigital {
	
	private String dispositivo;
	private int TipoControle;
	
	public Jogo2D(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			int anoCriacao, String produtora, String dispositivo, int TipoControle) {
		
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
		this.dispositivo = dispositivo;
		this.TipoControle = TipoControle;
	}

	public String getDispositivo() {
		return dispositivo;
	}
	
	public void setDispositivo(String dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public int getTipoControle() {
		return TipoControle;
	}
	
	public void setTipoControle(int tipoControle) {
		TipoControle = tipoControle;
	}

}
