package filial;

import modelo.Jogo;

public class Funcionario {
	
	private int idFunc;
	private String nomeFunc;
	private String filial;
		
	public Funcionario(int idFunc, String nomeFunc, String filial) {
		super();
		this.idFunc = idFunc;
		this.nomeFunc = nomeFunc;
		this.filial = filial;
	}

	public int getIdFunc() {
		return idFunc;
	}
	
	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}
	
	public String getNomeFunc() {
		return nomeFunc;
	}
	
	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	
	public String getFilial() {
		return filial;
	}
	
	public void setFilial(String filial) {
		this.filial = filial;
	}
	
	@Override
	public String toString() {
		return "Funcionario [idFunc= " + idFunc + ", nomeFunc= " + nomeFunc + ", filial= " + filial + "]";
	}

	public String solicitarAluguel(Jogo idJogo) {
		if (idJogo != null)
			return idJogo.getNome();
		else
			return "Jogo Inexistente";	
	}
	
	public float finalizarCompra() {
		return 0;
	}
	
	

}
