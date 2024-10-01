package main.java.list.OrdenacaoEmerson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private final List<Pessoa> listaDePessoas = new ArrayList<>();

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> lista = new ArrayList<>(listaDePessoas);
        if(!lista.isEmpty()) {
            Collections.sort(lista);
        }
        return lista;
    }

    public List<Pessoa> ordenarPorIdadeDecrescente() {
        List<Pessoa> lista = new ArrayList<>(listaDePessoas);
        if(!lista.isEmpty()) {
            lista.sort(Collections.reverseOrder());
        }
        return lista;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> lista = new ArrayList<>(listaDePessoas);
        if(!lista.isEmpty()) {
            lista.sort(new ComparadorAltura());  // Mais moderno (disponível a partir do Java 8).
            // ou Collections.sort(lista, new ComparadorAltura()); (disponível desde as primeiras versões do Java).
        }
        return lista;
    }

    public List<Pessoa> getListaDePessoas() {
        return listaDePessoas;
    }
}
