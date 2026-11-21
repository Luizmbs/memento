package org.example;

public class LostStatus implements BookStatus {

    private LostStatus() {};
    private static LostStatus instance = new LostStatus();
    public static LostStatus getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Extraviado";
    }

}
