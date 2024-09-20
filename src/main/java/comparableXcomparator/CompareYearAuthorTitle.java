package main.java.comparableXcomparator;

import java.util.Comparator;

class CompareYearAuthorTitle implements Comparator<Book> {
	@Override
	public int compare(Book l1, Book l2) {
		int resultYear = Integer.compare(l1.getYear(), l2.getYear());
		if (resultYear != 0)
			return resultYear;
		int resultAuthor = l1.getAuthor().compareTo(l2.getAuthor());  // compareTo (String method)
		if (resultAuthor != 0)
			return resultAuthor;
		return l1.getTitle().compareTo(l2.getTitle());  // compareTo (String method)
	}
}