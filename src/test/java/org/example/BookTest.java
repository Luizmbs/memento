package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void deveArmazenarEstados() {
        Book livro = new Book();
        livro.setEstado(AvailableStatus.getInstance());
        livro.setEstado(BorrowedStatus.getInstance());
        assertEquals(2, livro.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Book livro = new Book();
        livro.setEstado(AvailableStatus.getInstance());
        livro.setEstado(BorrowedStatus.getInstance());
        livro.restauraEstado(0);
        assertEquals(AvailableStatus.getInstance(), livro.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Book livro = new Book();
        livro.setEstado(AvailableStatus.getInstance());
        livro.setEstado(BlockedStatus.getInstance());
        livro.setEstado(AvailableStatus.getInstance());
        livro.setEstado(BorrowedStatus.getInstance());
        livro.restauraEstado(2);
        assertEquals(AvailableStatus.getInstance(), livro.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Book livro = new Book();
            livro.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
