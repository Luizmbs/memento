package org.example;

public class ReservedStatus implements BookStatus {

    private ReservedStatus() {};
    private static ReservedStatus instance = new ReservedStatus();
    public static ReservedStatus getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Reservado";
    }

}
