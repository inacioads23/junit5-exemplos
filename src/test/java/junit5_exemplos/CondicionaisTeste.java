package junit5_exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;
import static org.junit.jupiter.api.condition.JRE.JAVA_21;

public class CondicionaisTeste {

    @Test
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUsuarioInacio() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "Inacio")
    void validarAlgoSomenteNoUsuarioInacio1() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
    void validarAlgoSomenteNoUsuarioInacio2() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoUsuarioInacio3() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
    @Test
    @EnabledOnJre(JAVA_21)
    void validarAlgoSomenteNoUsuarioInacio4() {
        Assertions.assertEquals(10, 5 + 5);
    }
    
}
