package main.java.comparableXcomparator;

import java.util.Comparator;

//Classe para comparar Livro por autor
class CompareAuthor implements Comparator<Book> {
	@Override
	public int compare(Book l1, Book l2) {
		return l1.getAuthor().compareTo(l2.getAuthor());
	}
}
