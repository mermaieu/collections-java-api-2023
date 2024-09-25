package main.java.list.OperacoesBasicasEmerson;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe {@code ListaTarefas} representa uma lista de tarefas que podem ser adicionadas, removidas ou listadas.
 * Esta classe facilita o gerenciamento de tarefas com base em suas descrições.
 *
 *
 * @author Menso
 * @version 1.0
 */
public class ListaTarefas {

    /** Lista de tarefas armazenada internamente */
    private final List<Tarefa> listaDeTarefas = new ArrayList<>();

    /**
     * Adiciona uma nova tarefa à lista de tarefas.
     *
     * @param descricao a descrição da tarefa a ser adicionada
     */
    public void adicionarTarefa(String descricao) {
        listaDeTarefas.add(new Tarefa(descricao));
    }

    /**
     * Remove uma tarefa com a descrição especificada da lista de tarefas.
     * Se não houver uma tarefa correspondente, uma mensagem será exibida.
     *
     * @param descricao a descrição da tarefa a ser removida
     */
    public void removerTarefa(String descricao) {
        if(!listaDeTarefas.isEmpty()) {
            List<Tarefa> tarefasARemover = new ArrayList<>();
            for (Tarefa tarefa : listaDeTarefas) {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasARemover.add(tarefa);
                }
            }
            if(tarefasARemover.isEmpty()) {
                System.out.println("Remocão não realizada. Não há tarefa com a descricão '" + descricao + "'");
            } else {
                listaDeTarefas.removeAll(tarefasARemover);
                System.out.println(" A tarefa '" + descricao + "' foi removida com sucesso!");
            }
        } else {
            System.out.println("Lista vazia. Não há itens para remover.");
        }
    }

    /**
     * Remove todas as tarefas da lista de tarefas.
     */
    public void removerTodasAsTarefas() {
        if(!listaDeTarefas.isEmpty()) {
            listaDeTarefas.clear();
            System.out.println("Todas as tarefas foram removidas com sucesso.");
        } else {
            System.out.println("Lista vazia. Não há itens para remover");
        }
    }

    /**
     * Obtém o número total de tarefas na lista.
     *
     * @return o número de tarefas na lista
     */
    public int obterNumeroTotalTarefas() {
        return listaDeTarefas.size();
    }

    /**
     * Exibe a lista de descrições de todas as tarefas.
     */
    public void obterDescricoesTarefas() {
        System.out.println(listaDeTarefas);

        // Foi necessário sobreescrever o metodo toString() na classe Tarefa
        // para que, de fato, as descricões pudessem ser impressas de forma significativa.

        // Sem sobreescrever to String, que que será impresso é a representação padrão
        // do Object, que inclui o nome da classe e o código de hash em formato hexadecimal.

        // Com sobrescrita de toString(): Você pode personalizar essa saída para algo
        // mais significativo, como o estado dos atributos do objeto.
    }
}