package controller;

import util.Teclado;

public class Questao06 {

	/*
	 * 6) Desenvolver um programa que pergunte dois valores numéricos inteiros e
	 * apresente o valor da diferença entre o maior valor e o menor valor lido.
	 */

	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = Teclado.lerInt("Informe um número: ");
		num2 = Teclado.lerInt("Informe outro número: ");
		
		if ( num1 > num2 ) {
			//System.out.println("A subtração de " + num1 + " por " + num2 + " = " + (num1-num2));
			System.out.printf("A subtração de %d por %d = %d", num1, num2, (num1-num2) );
		} else {
			System.out.println("A subtração de " + num2 + " por " + num1 + " = " + (num2-num1));	
		}
	}
}
