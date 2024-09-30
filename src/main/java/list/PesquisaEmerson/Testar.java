package main.java.list.PesquisaEmerson;

import java.util.List;
import java.util.Optional;

public class Testar {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Testando o metodo adicionarLivro(): PASSOU NO TESTE.
        catalogo.adicionarLivro("Meu Sistema", "Aaron Nimzowitsch", 1943);
        catalogo.adicionarLivro("A Prática do Meu Sistema", "Aaron Nimzowitsch", 1944);
        catalogo.adicionarLivro("Escavando a Verdade", "Rodrigo Silva", 2014);
        catalogo.adicionarLivro("Scrum", "Jeff Sutherland", 2016);
        catalogo.adicionarLivro("Computacão Quântica", "Claude Falbriard", 2020);
        catalogo.adicionarLivro("Computacão Quântica", "Claude Falbriard", 2020);
        // Essa última insercão de livro não será permitida pelo mecanismo de seguranca do catálogo.


        // Testando o metodo pesquisarPorTitulo(): PASSOU NO TESTE
        Optional<Livro> livroEncontrado = catalogo.pesquisarPorTitulo("Computacão Quântica");

        livroEncontrado.ifPresentOrElse(
                livro -> System.out.println("Livro encontrado: " + livro.getTitulo() +
                                            ", autor: " + livro.getAutor() +
                                            ", ano: " + livro.getAno()),
                () -> System.out.println("Livro não encontrado")
        );


        // Testando o metodo pesquisarPorAutor(): PASSOU NO TESTE.
        String autorPesquisado = "Claude Falbriard";

        List<Livro> livrosDoAutor = catalogo.pesquisarPorAutor(autorPesquisado);
        if(!livrosDoAutor.isEmpty()) {
            System.out.println("\nLIVROS DO AUTOR " + autorPesquisado.toUpperCase() + ":");
            for(Livro livro : livrosDoAutor) {
                System.out.println("{titulo='" + livro.getTitulo() + "', ano=" + livro.getAno() + "}");
            }
        } else {
            System.out.println("\nO autor '" + autorPesquisado + "' não consta no catálogo.");
        }


        //Testando o metodo pesquisarPorIntervaloAnos(): PASSOU NO TESTE.
        int anoInicial = 2010, anoFinal = 2020;

        List<Livro> livrosNoIntervaloDeAnos = catalogo.pesquisarPorIntervaloAnos(anoInicial, anoFinal);
        if(!livrosNoIntervaloDeAnos.isEmpty()) {
            System.out.println("\nLIVROS PUBLICADOS ENTRE OS ANOS " + anoInicial + " E " + anoFinal + ":");
            for(Livro livro : livrosNoIntervaloDeAnos) {
                System.out.println(livro);
            }
        } else {
            System.out.println("\nNão foram encontrados livros entre os anos " + anoInicial + " e " + anoFinal + ".");
        }
    }
}
