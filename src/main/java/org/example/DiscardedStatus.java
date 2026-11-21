package org.example;

public class DiscardedStatus implements BookStatus {

    private DiscardedStatus() {};
    private static DiscardedStatus instance = new DiscardedStatus();
    public static DiscardedStatus getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Descartado";
    }

}
