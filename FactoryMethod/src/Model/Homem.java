package Model;

public class Homem extends Pessoa {
	
	public Homem (String nome) {
		super(nome);
	}
	
	public String saudacao(){
		return "Bem Vindo Srº " + super.getnome();
	}

}
