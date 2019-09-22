package Model;

public class Mulher extends Pessoa {
	
	public Mulher (String nome) {
		super(nome);
	}
	
	public String saudacao(){
		return "Bem Vinda Srª " + super.getnome();
	}

}
