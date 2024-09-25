package main.java.list.OperacoesBasicasEmerson;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> listaDeItens = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void adicionarItens(List<Item> itensParaAdicionar) {
        if(!itensParaAdicionar.isEmpty()) {
            listaDeItens.addAll(itensParaAdicionar);
        } else {
            System.out.println("A lista para a adicão está vazia. Nada foi adicionado ao carrinho.");
        }
    }

    public void removerItem(String nome) {
        if(!listaDeItens.isEmpty()) {
            List<Item> itensARemover = new ArrayList<>();
            for(Item item : listaDeItens) {
                if(nome.equalsIgnoreCase(item.getNome())) {
                    itensARemover.add(item);
                }
            }
            if(!itensARemover.isEmpty()) {
                listaDeItens.removeAll(itensARemover);
                System.out.println("O item '" + nome + "' foi removido do carrinho com sucesso!" );
            } else {
                System.out.println("Remocão não realizada. Não havia item com o nome '" + nome + "' no carrinho");
            }
        } else {
            System.out.println(" O carrinho de compras já estava vazio. Não há o que remover.");
        }
    }

    public double calcularValorTotal() {
        double total = 0.00;
        if(!listaDeItens.isEmpty()) {
            for(Item item : listaDeItens) {
                total += item.getQuantidade() * item.getPreco();
            }
        }
        return total;
    }

    public void exibirItens() {
        System.out.println("\nITENS DO CARRINHO DE COMPRAS:");
        int i = 1;
        for (Item item : listaDeItens) {
            System.out.println(i + ". " + item);
            i++;
        }
    }
}
