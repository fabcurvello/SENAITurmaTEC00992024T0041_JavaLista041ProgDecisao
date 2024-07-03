package controller;

import util.Teclado;

public class Questao11 {

	/*
	 * 11) Desenvolver um programa que pergunte um número de 3 casas e apresente
	 * como resultado somente o algarismo das centenas.
	 */

	public static void main(String[] args) {
		
		int resto100, calculo;
		int num = Teclado.lerInt("Informe um número de 3 dígitos: ");
		
		if ( (num >= 100) && (num <= 999) ) {
			
			resto100 = num % 100;
			calculo = (num - resto100) / 100;
			
			System.out.println("O algarismo das centenas de " + num + " é " + calculo);
			
		} else {
			System.out.println(num + " não possui 3 dígitos.");
		}
	}
}
