package controller;

import util.Teclado;

public class Questao10 {

	/*
	 * 10) Desenvolver um programa que pergunte dois números inteiros, e apresente
	 * como resultado se o segundo número informado é ou não um divisor do primeiro
	 * número informado.
	 */

	public static void main(String[] args) {
		
		int num1, num2, resto;
		
		num1 = Teclado.lerInt("Informe um número: ");
		num2 = Teclado.lerInt("Informe outro número: ");
		
		resto = num1 % num2;
		
		if ( resto == 0 ) {
			System.out.printf("%d é um divisor do %d", num2, num1);
		} else {
			System.out.printf("%d não é um divisor do %d", num2, num1);
		}
	}
}
