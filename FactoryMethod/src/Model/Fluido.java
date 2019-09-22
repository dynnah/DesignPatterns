package Model;

public class Fluido extends Pessoa{

	public Fluido(String nome) {
		super(nome);
	}
	
	public String saudacao(){
		return "Bem Vindx " + super.getnome();
	}
}
	