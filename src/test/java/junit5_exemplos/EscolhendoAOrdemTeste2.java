package junit5_exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
public class EscolhendoAOrdemTeste2 {

    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }
    
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @Test
    void validaFluxoD() {
        Assertions.assertTrue(true);
    }
}
