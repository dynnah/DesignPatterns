package Model;

public abstract class Inimigo {
	private int inteligencia;
	private int forca;
	private int estrategia;
	private int pontos;
	
	public Inimigo(int inteligencia, int forca, int estrategia, int pontos) {
		this.inteligencia = inteligencia;
		this.forca = forca;
		this.estrategia = estrategia;
		this.pontos = pontos;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(int estrategia) {
		this.estrategia = estrategia;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
}
