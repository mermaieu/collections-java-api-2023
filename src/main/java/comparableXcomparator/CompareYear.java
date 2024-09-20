package main.java.comparableXcomparator;

import java.util.Comparator;

//Classe para comparar Livro por ano
class CompareYear implements Comparator<Book> {
	@Override
	public int compare(Book l1, Book l2) {
		return Integer.compare(l1.getYear(), l2.getYear());
		/*
		if (l1.getAno() < l2.getAno())
			return -1;
		if (l1.getAno() > l2.getAno())
			return 1;
		else
			return 0;
		 */
	}
}
