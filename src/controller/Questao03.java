package controller;

import util.Teclado;

public class Questao03 {

	/*
	 * 3) Desenvolver um programa que pergunte um número, e apresente como resposta
	 * se o referido número é par ou é ímpar.
	 */

	public static void main(String[] args) {

		int num, resto;

		num = Teclado.lerInt("Informe um número: ");

		resto = num % 2;

		if (resto == 0) {
			System.out.printf("%d é par", num);
		} else {
			System.out.printf("%d é ímpar", num);
		}
	}
}
