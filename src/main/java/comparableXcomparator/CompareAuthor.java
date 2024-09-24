package main.java.comparableXcomparator;

import java.util.Comparator;

//Classe para comparar Livro por autor
class CompareAuthor implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getAuthor().compareTo(b2.getAuthor());
	}
}
