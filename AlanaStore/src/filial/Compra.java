package filial;

import java.util.ArrayList;

import modelo.Jogo;

public class Compra {
	
	private ArrayList<Jogo> jogo = new ArrayList<>();
	private int tempo;
	private Cliente cliente;
	private Funcionario funcionario;
	
	public Compra(ArrayList<Jogo> jogo, int tempo, Cliente cliente, Funcionario funcionario) {
		super();
		this.jogo = jogo;
		this.tempo = tempo;
		this.cliente = cliente;
		this.funcionario = funcionario;
	}

	public Compra() {
		super();
	}

	public ArrayList<Jogo> getJogo() {
		return jogo;
	}
	
	public void setJogo(ArrayList<Jogo> jogo) {
		this.jogo = jogo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	

	public float calcularCompra() {
		float result = 0;
		
		for(Jogo j : jogo)
			result += j.calcularTotal();
		
		return result;
		
	}
	
	public void adicionarJogo(Jogo jogo) {
		this.jogo.add(jogo);
	}
	
	public void removerJogo(Jogo jogo) {
		this.jogo.remove(jogo);
	}
	
	@Override
	public String toString() {
		return "Compra [jogo =" + jogo + ", tempo=" + tempo + ", cliente=" + cliente + ", funcionario=" + funcionario
				+ "]";
	}
}


