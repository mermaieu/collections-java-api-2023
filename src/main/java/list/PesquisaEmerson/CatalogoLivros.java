package main.java.list.PesquisaEmerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CatalogoLivros {
    private final List<Livro> listaDeLivros = new ArrayList<>();
    private final List<String> listaDeSeguranca = new ArrayList<>();  // Para evitar duplicatas no catálogo

    public void adicionarLivro(String nome, String autor, int ano) {
        Livro livroASerAdicionado = new Livro(nome, autor, ano);
        if(listaDeSeguranca.contains(livroASerAdicionado.toString())) {
            System.out.println("\nAdicão não realizada: O livro " + livroASerAdicionado + " Já existe no catálogo.");
        } else {
            listaDeLivros.add(livroASerAdicionado);
            listaDeSeguranca.add(livroASerAdicionado.toString());
        }
    }

    public Optional<Livro> pesquisarPorTitulo(String titulo) {
        if(!listaDeLivros.isEmpty()) {
            for (Livro livro : listaDeLivros) {
                if (titulo.equalsIgnoreCase(livro.getTitulo())) {
                    return Optional.of(livro); // Retorna um Optional contendo o livro encontrado
                }
            }
        }
        return Optional.empty(); // Retorna um Optional vazio se nenhum livro for encontrado
    }

    /*
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        for(Livro livro : listaDeLivros) {
            if(titulo.equalsIgnoreCase(livro.getTitulo())) {
               livroPorTitulo = livro;
               break;
            }
        }
        return livroPorTitulo;
    }
*/
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if(!listaDeLivros.isEmpty()) {
            for(Livro livro : listaDeLivros) {
                if(autor.equalsIgnoreCase(livro.getAutor())) {
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosNoIntervaloAnos = new ArrayList<>();
        if(!listaDeLivros.isEmpty()) {
            for(Livro livro : listaDeLivros) {
                if(anoInicial <= livro.getAno() && livro.getAno() <= anoFinal) {
                    livrosNoIntervaloAnos.add(livro);
                }
            }
        }
        return livrosNoIntervaloAnos;
    }
}
