package junit5_exemplos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

	Conta contaOrigem = new Conta("123456", 0);
	Conta contaDestino = new Conta("456548", 100);

	TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
	
	@Test
	void validarCenarioDeExcecaoNaTransferencia() {	

		Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, 20));
	}

	@Test
	void validarCenarioDeExcecaoNaTransferencia1() {

		Assertions.assertThrows(IllegalArgumentException.class,
				() -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
	}
}
