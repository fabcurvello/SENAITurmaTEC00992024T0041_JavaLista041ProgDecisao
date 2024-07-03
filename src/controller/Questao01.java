package controller;

import util.Teclado;

public class Questao01 {

	/*
	 * 1) Desenvolver um programa que pergunte um número. Se este número for maior
	 * que 20, então ele deverá exibir a metade deste número, senão, ele deverá
	 * exibir o número sem alterações.
	 */

	public static void main(String[] args) {
		
		double num;
		
		num = Teclado.lerDouble("Informe um número: ");
		
		if ( num > 20 ) {
			System.out.printf("A metade de %.0f é %.1f.", num, (num/2));
		} else {
			System.out.printf("O número informado é %.0f.", num);
		}
	}
}
