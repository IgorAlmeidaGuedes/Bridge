
import Factory.FerramentaFactory;
import Factory.IFerramenta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void retornaErro() {
        try {
            IFerramenta ferramenta = FerramentaFactory.obterUso("pedra");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Ferramenta inexistente", e.getMessage());
        }
    }

    @Test
    void deveVenderMachado() {
        IFerramenta ferramenta = FerramentaFactory.obterUso("Machado");
        assertEquals("Machado vendido.", ferramenta.vender());
    }

    @Test
    void deveVenderMartelo() {
        IFerramenta ferramenta = FerramentaFactory.obterUso("Martelo");
        assertEquals("Martelo vendido.", ferramenta.vender());
    }

    @Test
    void deveVenderChave() {
        IFerramenta ferramenta = FerramentaFactory.obterUso("ChaveDeFenda");
        assertEquals("Chave de fenda vendida.", ferramenta.vender());
    }
}
