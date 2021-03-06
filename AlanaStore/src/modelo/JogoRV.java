package modelo;

public class JogoRV extends JogoDigital {

	private String tipoCapacete;
	private String estereoscopia;
		
	public JogoRV(int idJogo, String nome, int quantidadeJogos, float precoAluguel, int quantidadePessoas,
			int anoCriacao, String produtora, String tipoCapacete, String estereoscopia) {
		
		super(idJogo, nome, quantidadeJogos, precoAluguel, quantidadePessoas, anoCriacao, produtora);
		this.tipoCapacete = tipoCapacete;
		this.estereoscopia = estereoscopia;
	}

	public String getTipoCapacete() {
		return tipoCapacete;
	}
	
	public void setTipoCapacete(String tipoCapacete) {
		this.tipoCapacete = tipoCapacete;
	}
	
	public String getEstereoscopia() {
		return estereoscopia;
	}
	
	public void setEstereoscopia(String estereoscopia) {
		this.estereoscopia = estereoscopia;
	}
	
public float calcularTotal() {
		
		float taxa = (float) ((super.getPrecoAluguel()/super.getQuantidadePessoas()) * 0.20);
		float resultado = (super.getPrecoAluguel()/super.getQuantidadePessoas()) + taxa;
		return resultado;
	
	}
	
	
}
