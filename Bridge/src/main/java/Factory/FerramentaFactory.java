package Factory;

import Bridge.Ferramenta;

import java.lang.reflect.Constructor;

public class FerramentaFactory {

    public static IFerramenta obterUso(String ferramenta) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Factory." + ferramenta);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Ferramenta inexistente");
        }
        if (!(objeto instanceof IFerramenta)) {
            throw new IllegalArgumentException("Ferramenta inválida");
        }
        return (IFerramenta) objeto;
    }
}
