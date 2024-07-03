package controller;

import util.Teclado;

public class Questao12 {

	/*
	 * 12) Desenvolver um programa que pergunte 5 números inteiros e identifique o
	 * maior número e o menor número.
	 */

	public static void main(String[] args) {
		
		int n1, n2, n3, n4, n5, menor, maior;
		
		n1 = Teclado.lerInt("Informe o valor 1: ");
		n2 = Teclado.lerInt("Informe o valor 2: ");
		n3 = Teclado.lerInt("Informe o valor 3: ");
		n4 = Teclado.lerInt("Informe o valor 4: ");
		n5 = Teclado.lerInt("Informe o valor 5: ");
		
		maior = n1;
		if ( maior < n2 ) {
			maior = n2;
		}
		if ( maior < n3 ) {
			maior = n3;
		}
		if ( maior < n4 ) {
			maior = n4;
		}
		if ( maior < n5 ) {
			maior = n5;
		}
		
		menor = n1;
		if ( menor > n2 ) {
			menor = n2;
		}
		if ( menor > n3 ) {
			menor = n3;
		}
		if ( menor > n4 ) {
			menor = n4;
		}
		if ( menor > n5 ) {
			menor = n5;
		}
		
		System.out.println("O maior valor inserido foi " + maior);
		System.out.println("O menor valor inserido foi " + menor);

	}

}
