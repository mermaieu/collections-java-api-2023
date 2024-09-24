package main.java.comparableXcomparator;

import java.util.Comparator;

class CompareYearAuthorTitle implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		int resultYear = Integer.compare(b1.getYear(), b2.getYear());
		if (resultYear != 0)
			return resultYear;
		int resultAuthor = b1.getAuthor().compareTo(b2.getAuthor());  // compareTo (String method)
		if (resultAuthor != 0)
			return resultAuthor;
		return b1.getTitle().compareTo(b2.getTitle());  // compareTo (String method)
	}
}