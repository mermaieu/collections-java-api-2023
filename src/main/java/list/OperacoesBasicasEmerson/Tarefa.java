package main.java.list.OperacoesBasicasEmerson;

/**
 * A classe {@code Tarefa} representa uma tarefa com uma descrição.
 * Cada tarefa possui uma descrição que pode ser acessada e exibida.
 *
 *
 * @author Menso
 * @version 1.0
 */
public class Tarefa {

    /** A descrição da tarefa */
    private String descricao;

    /**
     * Construtor que inicializa uma tarefa com uma descrição.
     *
     * @param descricao a descrição da tarefa
     */
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a descrição da tarefa.
     *
     * @return a descrição da tarefa
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna a descrição da tarefa em formato de string.
     *
     * @return a descrição da tarefa como uma {@code String}
     */
    //@Override
    public String toString() {
        return descricao;
    }
}