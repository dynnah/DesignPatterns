package model;

public class Fita {

	private String titulo;
	private Tipo codigoDePreco;

	public Fita(String titulo, Tipo codigoDePreco) {
		this.titulo = titulo;
		this.codigoDePreco = codigoDePreco;
	}

	public Fita() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Tipo getCodigoDePreco() {
		return codigoDePreco;
	}

	public void setCodigoDePrevo(Tipo codigoDePreco) {
		this.codigoDePreco = codigoDePreco;
	}
}