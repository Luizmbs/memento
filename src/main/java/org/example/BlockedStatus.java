package org.example;

public class BlockedStatus implements BookStatus {

    private BlockedStatus() {};
    private static BlockedStatus instance = new BlockedStatus();
    public static BlockedStatus getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Bloqueado";
    }

}
