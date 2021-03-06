package model;

public class Aluguel {
	private Fita fita;
	private int diasAlugada;

	public Aluguel(Fita fita, int diasAlugada) {
		this.fita = fita;
		this.diasAlugada = diasAlugada;
	}

	public Aluguel() {
	}

	public Fita getFita() {
		return fita;
	}

	public int getDiasAlugada() {
		return diasAlugada;
	}

	public void setDiasAlugada(int diasAlugada) {
		this.diasAlugada = diasAlugada;
	}
	
	public double calculaAluguel() {
		double valorTotal = 0.0;

		switch (getFita().getCodigoDePreco()) {

		case normal:
			valorTotal += 2;
			if (getDiasAlugada() > 2)
				valorTotal += (getDiasAlugada() - 2) * 1.5;
			break;

		case lancamento:
			valorTotal += getDiasAlugada() * 3;
			break;

		case infantil:
			valorTotal += 1.5;
			if ( getDiasAlugada() > 3)
				valorTotal += (getDiasAlugada() - 3) * 1.5;
			break;
		}
		
		return valorTotal;
	}
	
	public boolean adicionarPontos() {
		if(getFita().getCodigoDePreco() == Tipo.lancamento 
			&& getDiasAlugada() > 1)
			
			return true;
		return false;

	}
}
