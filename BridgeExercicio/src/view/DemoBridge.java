package view;
import model.*;

public class DemoBridge {
	
	public static void main(String[] args) {
		
		Publicacao publicacao = new Livro(new PublicacaoXML(), "Mentirosos", "autor", "isbn");
		publicacao.publicar();
		System.out.println();
		
		publicacao = new Livro(new PublicacaoBD(), "Harry Potter", "autor", "isbn");
		publicacao.publicar();
		System.out.println();
		
		publicacao = new Revista(new PublicacaoXML(), "Época", "autor", "artigo");
		publicacao.publicar();
		System.out.println();
		
		publicacao = new Revista(new PublicacaoBD(), "Veja", "autor", "artigo");
		publicacao.publicar();
		System.out.println();

	}

}
