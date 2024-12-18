package Singleton;

import Bridge.Material;
import Bridge.Ferramenta;


public class FibraVidro implements Material {
    private static FibraVidro instancia;

    private FibraVidro() {}

    public static FibraVidro getInstancia() {
        if (instancia == null) {
            instancia = new FibraVidro();
        }
        return instancia;
    }

    @Override
    public String getTipo() {
        return "Fibra de Vidro";
    }
}
