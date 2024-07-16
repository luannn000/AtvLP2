public class Livro extends Publicacao {
	private int edicao;
	private String isbn;

	Livro(String titulo, String autor, int anoDePublicacao, String genero, String editora, int quantidadeDisponivel, int edicao, String isbn) {
		super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
		this.edicao = edicao;
		this.isbn = isbn;
	}
	
	void imprimeDados() {
		System.out.println(this.getTitulo());
		System.out.println(this.getAutor());
		System.out.println(this.getAnoDePublicacao());
		System.out.println(this.getGenero());
		System.out.println(this.getEditora());
		System.out.println(this.getQuantidadeDisponivel());
		System.out.println(this.edicao);
		System.out.println(this.isbn);
	}
	
}
