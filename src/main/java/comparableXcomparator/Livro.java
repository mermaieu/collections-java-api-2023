package main.java.comparableXcomparator;


// Uma classe 'Livro' que implementa Comparable
class Livro implements Comparable<Livro> {
	private String titulo;
	private String autor;
	private int ano;

	// Construtor
	public Livro(String ti, String au, int an) {
		this.titulo = ti;
		this.autor = au;
		this.ano = an;
	}

	// Usado para ordenar livros por título
	@Override
	public int compareTo(Livro l) {
		return titulo.compareTo(l.titulo);  // Poderia ser l.autor ou l.ano
	}

	// Métodos getters para acessar os dados privados
	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getAno() {
		return ano;
	}
}
