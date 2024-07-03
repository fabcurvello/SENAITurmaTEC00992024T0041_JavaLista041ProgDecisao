package controller;

import util.Teclado;

public class DesvioCondicionalSimples {

	public static void main(String[] args) {

		int a, b, x;
		
		a = Teclado.lerInt("Informe um número: ");
		b = Teclado.lerInt("Informe outro número: ");
		
		x = a + b;
		
		if ( x > 10 ) {
			System.out.println("A soma é " + x);
		} //fimse

	}

}







