package controller;

import util.Teclado;

public class Questao11B {

	/*
	 * 11) Desenvolver um programa que pergunte um número de 3 casas e apresente
	 * como resultado somente o algarismo das centenas.
	 */

	public static void main(String[] args) {
		
		int calculo;
		int num = Teclado.lerInt("Informe um número de 3 dígitos: ");
		
		if ( (num >= 100) && (num <= 999) ) {
			
			calculo = num / 100; // divisão de números inteiros. O resultado será inteiro!
			System.out.println("O algarismo das centenas de " + num + " é " + calculo);
			
		} else {
			System.out.println(num + " não possui 3 dígitos.");
		}
	}
}
