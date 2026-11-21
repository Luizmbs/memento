package org.example;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private BookStatus estado;
    private List<BookStatus> memento = new ArrayList<BookStatus>();

    public BookStatus getEstado() {
        return this.estado;
    }

    public void setEstado(BookStatus estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<BookStatus> getEstados() {
        return this.memento;
    }
}
