package model;

public class PublicacaoBD implements PublicacaoImplementada {

	public PublicacaoBD() {}

	public String publicarRevista(String titulo) {
		return (titulo + " - Revista BD \n");

	}

	public String publicarLivro(String titulo) {
		return (titulo + " - Livro BD \n");

	}

}
