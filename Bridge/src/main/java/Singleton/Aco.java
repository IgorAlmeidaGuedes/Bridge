package Singleton;

import Bridge.Material;

public class Aco implements Material {
    private static Aco instancia;

    private Aco() {}

    public static Aco getInstancia() {
        if (instancia == null) {
            instancia = new Aco();
        }
        return instancia;
    }

    @Override
    public String getTipo() {
        return "Aço";
    }
}
