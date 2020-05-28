public class App { 

	/**
	 * Essa aplicacao meramente para .... nao sei....
	 * 
	 * @author Irina Fernandes
	 * @version 1.0
	 * @since 27/05/20
	 */


	/**
	 * Esse metodo e usado para calcular a soma de dois numeros inteiros
	 * @param valor1 primeiro parametro
	 * @param valor2 segundo parametro
	 * @return retorna o resultado da soma de valor1 e valor2
	 */

	public int somar (int valor1, int valor2) {
		System.out.println(valor1 + " + " + valor2);
		return valor1 + valor2;
	}


	/**
	 * Esse metodo usado para calcular a diferenca entre dois numeros decimais ou inteiros
	 * @param valor1 primeiro parametro
	 * @param valor2 segundo parametro
	 * @return retorna o resultado da diferenca entre valor1 e valor2
	 */
	public double subtrair (double valor1, double valor2) {
		return valor1-valor2;
	}


	/**
	 * Este metodo e usado para calcular o produto de dois numeros inteiros
	 * @param valor1 primeiro parametro
	 * @param valor2 segundo parametro
	 * @return retorna  a multiplicao de valor1 e valor2
	 */
	public int multiplicar (int valor1, int valor2) {
		return valor1*valor2;
	}


	/**
	 * Este metodo e usado para calcular o quociente entre dois numeros inteiros ou decimais
	 * @param valor1 primeiro parametro
	 * @param valor2 segundo parametro
	 * @return retorna a divisao entre o valor1 e valor2
	 */
	public double dividir (double valor1, double valor2) {
		return valor1/valor2;
	}


	/**
	 * Este metodo e usado para calcular o quadrado de um numero inteiro
	 * @param valor1 primeiro parametro
	 * @return retorna o valor1 ao quadrado
	 */
	public int square (int valor1) {
		return valor1*valor1;
	}


	/**
	 * Esse metodo e usado para saber se a Irina e linda hehe
	 * @param nome primeiro argumento
	 * @return retorna true se o nome dado como argumento for Irina e false caso contrario
	 */
	public boolean Linda (String nome) { 
		if(nome.equals("Irina"))
			return true;
		return false;
	}



	public static void main(String[] args) {
		
			App app = new App();
			int valor = app.somar(1, 2);
			System.out.println(valor);
		
	}


}