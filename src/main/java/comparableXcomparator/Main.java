package main.java.comparableXcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		System.out.println("---------------------------------------");
		List<Book> books = new ArrayList<>(
				Arrays.asList(
						new Book("Java - Guia do Programador: Atualizado Para Java 16", "Peter Jandl Junior", 2021),
						new Book("Desenvolvimento Real de Software: Um guia de projetos para fundamentos em Java",
								"Raoul-Gabriel Urma e Richard Warburton", 2021),
						new Book("Microsserviços Prontos Para a Produção: Construindo Sistemas Padronizados em uma Organização de Engenharia de Software",
								"Susan J. Fowler", 2017),
						new Book("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
								"Aditya Y. Bhargava", 2017),
						new Book("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017)
				)
		);

		System.out.println("Livros após a ordenação natural (Título): ");
		Collections.sort(books);
		for (Book book : books) {
			System.out.println(book.getTitle() + " - " +
					book.getAuthor() + " - " +
					book.getYear());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano: ");
		Collections.sort(books, new CompareYear());
		for (Book book : books) {
			System.out.println(book.getYear() + " - " +
					book.getTitle() + " - " +
					book.getAuthor());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por autor: ");
		Collections.sort(books, new CompareAuthor());
		for (Book book : books) {
			System.out.println(book.getAuthor() + " - " +
					book.getTitle() + " - " +
					book.getYear());
		}

		System.out.println("---------------------------------------");

		System.out.println("Livros após a ordenação por ano, autor e título: ");
		Collections.sort(books, new CompareYearAuthorTitle());
		for (Book book : books) {
			System.out.println(book.getYear() + " - " +
					book.getAuthor() + " - " +
					book.getTitle());
		}
	}
}