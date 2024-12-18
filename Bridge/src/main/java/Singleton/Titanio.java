package Singleton;

import Bridge.Material;
import Bridge.Ferramenta;


public class Titanio implements Material {
    private static Titanio instancia;

    private Titanio() {}

    public static Titanio getInstancia() {
        if (instancia == null) {
            instancia = new Titanio();
        }
        return instancia;
    }

    @Override
    public String getTipo() {
        return "Titânio";
    }
}
