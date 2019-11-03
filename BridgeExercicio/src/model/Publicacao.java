package model;

public abstract class Publicacao {
	private PublicacaoImplementada publicacao;
	private String titulo;
	private String autor;
	
	public PublicacaoImplementada getPublicacao() {
		return publicacao;
	}
	
	public void setPublicacao(PublicacaoImplementada publicacao) {
		this.publicacao = publicacao;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Publicacao(PublicacaoImplementada publicacao, String titulo, String autor) {
		super();
		this.publicacao = publicacao;
		this.titulo = titulo;
		this.autor = autor;
	}	
	
	public abstract void publicar();
	
	public String publicarLivro(String titulo) {
		return publicacao.publicarLivro(titulo);
	}
	
	public String publicarRevista(String titulo) {
		return publicacao.publicarRevista(titulo);
	}
	
}
