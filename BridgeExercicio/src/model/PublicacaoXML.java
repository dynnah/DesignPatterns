package model;

public class PublicacaoXML implements PublicacaoImplementada {
	
	public PublicacaoXML() {}

	public String publicarRevista(String titulo) {
		return (titulo + " - Revista XML \n");
		
	}

	public String publicarLivro(String titulo) {
		return (titulo + " - Livro XML \n");
		
	}

}
