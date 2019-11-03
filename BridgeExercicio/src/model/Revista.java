package model;

public class Revista extends Publicacao {
	public String artigo;

	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

	public Revista(PublicacaoImplementada publicacao, String titulo, String autor, String artigo) {
		super(publicacao, titulo, autor);
		this.artigo = artigo;
	}

	public void publicar() {
        System.out.println(publicarRevista("Revista") + super.getTitulo());
	}
	
}
