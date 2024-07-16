public class Filme extends Publicacao {
	private String diretor;
	private String atorPrincipal;
	private String sinopse;
	private int tempoDeDuracao;

	Filme(String titulo, String autor, int anoDePublicacao, String genero, String editora, int quantidadeDisponivel, String diretor, String atorPrincipal, String sinopse, int tempoDeDuracao) {
		super(titulo, autor, anoDePublicacao, genero, editora, quantidadeDisponivel);
		this.diretor = diretor;
		this.atorPrincipal = atorPrincipal;
		this.sinopse = sinopse;
		this.tempoDeDuracao = tempoDeDuracao;
	}
	
	void imprimeDados() {
		System.out.println(this.getTitulo());
		System.out.println(this.getAutor());
		System.out.println(this.getAnoDePublicacao());
		System.out.println(this.getGenero());
		System.out.println(this.getEditora());
		System.out.println(this.getQuantidadeDisponivel());
		System.out.println(this.diretor);
		System.out.println(this.atorPrincipal);
		System.out.println(this.sinopse);
		System.out.println(this.tempoDeDuracao);
	}
}
