package Model;

public class FactoryShape {
	
public FactoryShape(){}
	
	
	public Pessoa getPessoa(String nome){
		if (nome.equals("Homem"))
			return new Homem("Álamo");
		
		else if (nome.equals("Mulher"))
			return new Mulher("Maria");
		
		else if (nome.equals("Fluido"))
			return new Fluido("Jess");
		
		else return null;
			
	}

}
