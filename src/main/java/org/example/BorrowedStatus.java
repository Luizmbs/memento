package org.example;

public class BorrowedStatus implements BookStatus {

    private BorrowedStatus() {};
    private static BorrowedStatus instance = new BorrowedStatus();
    public static BorrowedStatus getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Emprestado";
    }

}
