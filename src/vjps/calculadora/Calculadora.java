package vjps.calculadora;

import vjps.calculadora.gui.IgCalculadora;

public class Calculadora {

	public static void main(String[] args) {
		new IgCalculadora();
	}
	
	/**
	 * Soma duas parcelas e retorna o total.
	 */
	public static float somar(float primeiraParcela, float segundaParcela) {
		return primeiraParcela + segundaParcela;
	}
	
	/**
	 * Subtrai o subtraendo do minuendo e retorna a diferença.
	 */
	public static float subtrair(float minuendo, float subtraendo) {
		return minuendo - subtraendo;
	}
	
	/**
	 * Retorna o produto da mulplicação dos dois fatores.
	 */
	public static float multiplicar(float primeiroFator, float segundoFator) {
		return primeiroFator * segundoFator;
	}
	
	/**
	 * Retorna o quociente da divisão do dividendo pelo divisor.
	 */
	public static float dividir(float dividendo, float divisor) {
		return dividendo / divisor;
	}
	
	/**
	 * Inverte o sinal do número.
	 */
	public static float inverterSinal(float numero) {
		return multiplicar(numero, -1F);
	}
	
	/**
	 * Obtém a recíproca do número.
	 */
	public static float reciproca(float numero) {
		return dividir(1F, numero);
	}
	
	/**
	 * Obtém o quadrado do número.
	 */
	public static float quadrado(float numero) {
		return multiplicar(numero, numero);
	}
	
	/**
	 * Obtém a raíz quadrada do número.
	 */
	public static float raizQuadrada(float numero) {
		if(numero == 0 || numero == Float.POSITIVE_INFINITY) return numero;
		
		float t,
		raizQuadrada = numero / 2;
		do {
			t = raizQuadrada;
			raizQuadrada = (t + (numero / t)) / 2;
		}while ((t - raizQuadrada) != 0);
		
		return raizQuadrada;
	}








}//class Calculadora








