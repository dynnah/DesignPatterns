package model;

public class Livro extends Publicacao {
	private String isbn;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Livro(PublicacaoImplementada publicacao, String titulo, String autor, String isbn) {
		super(publicacao, titulo, autor);
		this.isbn = isbn;
	}
	
	public void publicar() {
        System.out.println(publicarLivro("Livro") + super.getTitulo());
	}
	

}
