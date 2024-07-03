package controller;

import util.Teclado;

public class Questao02 {

	/*
	 * 2) Desenvolver um programa que permita ao aluno responder qual a capital do
	 * Brasil. O programa deverá exibir se a resposta está certa ou errada.
	 */

	public static void main(String[] args) {
		
		String capital = Teclado.lerTexto("Informe a capital do Brasil: ");
		
		// Brasília ou brasília Brasilia ou brasilia
		if ( capital.equalsIgnoreCase("Brasília") || capital.equalsIgnoreCase("Brasilia")) {
			System.out.println("Parabéns!!! Você é demais.");
		} else {
			System.out.println("Errou!");
		}

	}

}
