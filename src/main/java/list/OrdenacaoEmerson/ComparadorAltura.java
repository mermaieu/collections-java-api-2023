package main.java.list.OrdenacaoEmerson;

import java.util.Comparator;

public class ComparadorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
