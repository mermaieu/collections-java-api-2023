package main.java.comparableXcomparator;


// Uma classe 'Livro' que implementa Comparable
class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int year;

	// Construtor
	public Book(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}

	// Usado para ordenar livros por título
	@Override
	public int compareTo(Book l) {
		return title.compareTo(l.title);  // Poderia ser l.autor ou l.ano
	}

	// Métodos getters para acessar os dados privados
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}
}
