import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	public void testSomar() {
		App teste = new App();
		int valor = teste.somar(2, 3);
		assertEquals(5, valor);
	}
	
	
	@Test
	public void multiplicatTest () {
		App teste = new App();
		int valor = teste.multiplicar(2, 6);
		assertEquals(12, valor);
	}
	
	@Test
	public void subtrairTest() {
		App teste = new App();
		double valor = teste.subtrair(6, 2);
		assertEquals(4, valor);
	}

}