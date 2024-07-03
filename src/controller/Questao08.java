package controller;

import util.Teclado;

public class Questao08 {

	/*
	 * 8) Desenvolver um programa que pergunte um número inteiro qualquer e
	 * verifique se ele está na faixa de 1 a 10.
	 */

	public static void main(String[] args) {
		
		int num = Teclado.lerInt("Informe um número: ");
		
		if ( (num >= 1) && (num <= 10) ) {
			System.out.println(num + " está na faixa de 1 a 10");
		} else {
			System.out.println(num + " não está na faixa de 1 a 10");
		}
	}
}
