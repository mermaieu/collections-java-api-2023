package main.java.comparableXcomparator;

import java.util.Comparator;

class CompararAnoAutorTitulo implements Comparator<Livro> {
	@Override
	public int compare(Livro l1, Livro l2) {
		int resultAno = Integer.compare(l1.getAno(), l2.getAno());
		if (resultAno != 0)
			return resultAno;
		int resultadoAutor = l1.getAutor().compareTo(l2.getAutor());
		if (resultadoAutor != 0)
			return resultadoAutor;
		return l1.getTitulo().compareTo(l2.getTitulo());
	}
}
