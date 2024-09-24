package main.java.comparableXcomparator;

import java.util.Comparator;

//Classe para comparar Livro por ano
class CompareYear implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		return Integer.compare(b1.getYear(), b2.getYear());
		/*
		if (b1.getAno() < b2.getAno())
			return -1;
		if (b1.getAno() > b2.getAno())
			return 1;
		else
			return 0;
		 */
	}
}
