package controller;

import util.Teclado;

public class Questao07 {

	/*
	 * 7) Desenvolver um programa que pergunte um valor inteiro positivo ou
	 * negativo, e exiba como resposta o módulo deste valor, ou seja, o número lido
	 * como sendo positivo.
	 */

	public static void main(String[] args) {
		
		int num;
		num = Teclado.lerInt("Informe um número positivo ou negativo: ");
		
		if ( num >= 0 ) {
			System.out.println("O módulo de " + num + " é " + num);
		} else {
			System.out.println("O módulo de " + num + " é " + (num * -1));
		}

	}

}
