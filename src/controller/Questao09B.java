package controller;

import util.Teclado;

public class Questao09B {

	/*
	 * 9) Desenvolver um programa que pergunte um número e exiba a informação de que
	 * ele é positivo, negativo ou nulo.
	 */

	public static void main(String[] args) {
		
		int num = Teclado.lerInt("Informe um número: ");
		
		if ( num > 0 ) {
			System.out.println(num + " é positivo!");
		} else if ( num < 0 ) {
			System.out.println(num + " é negativo!");
		} else {
			System.out.println(num + " é nulo!");
		}
	}
}







