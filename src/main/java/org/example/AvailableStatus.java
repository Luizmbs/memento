package org.example;

public class AvailableStatus implements BookStatus {

    private AvailableStatus() {};
    private static AvailableStatus instance = new AvailableStatus();
    public static AvailableStatus getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Disponível";
    }

}
