package controller;

import util.Teclado;

public class DesvioCondicionalComposto {

	/*
	 * Algoritmo para ler dois valores numéricos, efetuar a adição. Se a soma for
	 * maior ou igual a 10, apresente o resultado somando 5, senão, apresente o
	 * resultado subtraindo 7
	 */

	public static void main(String[] args) {
		
		int a, b, x;
		
		a = Teclado.lerInt("Informe o primeiro número: ");
		b = Teclado.lerInt("Informe o segundo número: ");
		
		x = a + b;
		
		if ( x >= 10 ) {
			System.out.println("Resultado da soma, acrescentando 5 é " + (x + 5));
		} else {
			System.out.println("Resultado da soma, subtraindo 7 é " + (x - 7));
		}// fim else

	}

}









