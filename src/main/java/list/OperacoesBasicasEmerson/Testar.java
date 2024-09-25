package main.java.list.OperacoesBasicasEmerson;

import java.util.List;

public class Testar {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Testando o metodo adicionarItem():  FUNCIONANDO BEM!
        carrinho.adicionarItem("Camisa Polo", 56.99, 2);
        carrinho.adicionarItem("Calca Xadrez", 103.99, 1);
        carrinho.adicionarItem("Par de meias", 10.99, 3);
        carrinho.adicionarItem("Camisa Polo", 56.99, 2);

        // Testando o metodo exibirItens():  FUNCIONANDO BEM!
        carrinho.exibirItens();

        // Testando o metodo calcularValorTotal():  FUNCIONANDO BEM!
        System.out.println("Valor total da compra: R$ " + carrinho.calcularValorTotal());

        // Testando o metodo removerItem():  FUNCIONANDO BEM!
        carrinho.removerItem("camisa polo");
        carrinho.exibirItens();


    }
}