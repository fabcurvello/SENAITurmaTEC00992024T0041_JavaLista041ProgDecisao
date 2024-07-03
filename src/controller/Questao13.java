package controller;

import util.Teclado;

public class Questao13 {
	
	/*
	 * 13)	Desenvolver um programa que pergunte 3 valores (variáveis a, b e c) 
	 * e ao final apresente-os dispostos em ordem crescente.
	 */

	public static void main(String[] args) {
		
		int a, b, c, aux;
		
		a = Teclado.lerInt("Informe um valor para var a: ");
		b = Teclado.lerInt("Informe um valor para var b: ");
		c = Teclado.lerInt("Informe um valor para var c: ");
		
		// var a deve ser a menor dos 3
		if (a > b) {  //a tem que ser menor que b
			aux = a;
			a = b;
			b = aux;
		}
		if (a > c) {  //a tem que ser menor que c
			aux = a;
			a = c;
			c = aux;
		}
		//até aqui, var a é o menor valor das 3
		
		//preciso garantir que b seja menor que c
		if (b > c) {  //b tem que ser menor que c
			aux = b;
			b = c;
			c = aux;
		}
		//até aqui, a é o menor das 3, b é menor que c, ou seja, já temos a ordem crescente
		
		System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);
	

	}

}
