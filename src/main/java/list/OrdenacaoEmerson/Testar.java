package main.java.list.OrdenacaoEmerson;

import java.util.Collections;
import java.util.List;

public class Testar {
    public static void main (String[] args) {

     /* CASO QUEIRA FAZER AS ENTRADAS DE FORMA INTERATIVA:
        String nome;
        int idade;
        double altura;
        String queroAdicionar = "s";
        OrdenacaoPessoas ordenacaoDePessoas = new OrdenacaoPessoas();

        try (CustomScanner scanner = new CustomScanner()){
            while (queroAdicionar.equalsIgnoreCase("s")) {
                nome = scanner.input("Digite o nome da pessoa: ");
                idade = scanner.inputInt("Digite a idade de " + nome + ":");
                altura = scanner.inputDouble("Digite a altura de " + nome + ":");
                ordenacaoDePessoas.adicionarPessoa(nome, idade, altura);
                scanner.input(""); // para consumir o caractere de nova linha (\n) remanescente no buffer do scanner
                queroAdicionar = scanner.input("Deseja adicionar uma nova pessoa? (s/n)");
            }
        }
      */
        OrdenacaoPessoas ordenacaoDePessoas = new OrdenacaoPessoas();
        ordenacaoDePessoas.adicionarPessoa("Emerson", 33, 1.77);
        ordenacaoDePessoas.adicionarPessoa("Carlos", 18, 1.70);
        ordenacaoDePessoas.adicionarPessoa("Elivane", 35, 1.63);
        ordenacaoDePessoas.adicionarPessoa("Jorselins", 59, 1.67);
        ordenacaoDePessoas.adicionarPessoa("Miguel", 1, 0.90);

        // ORDENANDO POR IDADE:
        List<Pessoa> listaOrdenadaPorIdade = ordenacaoDePessoas.ordenarPorIdade();
        System.out.println("\nLISTA ORDENADA POR IDADE:");
        for(Pessoa pessoa : listaOrdenadaPorIdade) {
            System.out.println(pessoa);
        }

        // ORDENANDO POR IDADE DECRESCENTE:
        List<Pessoa> listaOrdenadaPorIdadeDecrescente = ordenacaoDePessoas.ordenarPorIdadeDecrescente();
        System.out.println("\nLISTA ORDENADA POR IDADE DECRESCENTE:");
        for(Pessoa pessoa : listaOrdenadaPorIdadeDecrescente) {
            System.out.println(pessoa);
        }

        // ORDENANDO POR ALTURA:
        List<Pessoa> listaOrdenadaPorAltura = ordenacaoDePessoas.ordenarPorAltura();
        System.out.println("\nLISTA ORDENADA POR ALTURA:");
        for(Pessoa pessoa : listaOrdenadaPorAltura) {
            System.out.println(pessoa);
        }
    }
}
