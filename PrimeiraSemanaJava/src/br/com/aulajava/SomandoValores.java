package br.com.aulajava;

import java.util.Date;

public class SomandoValores {

	public static void main(String[] args) {

		int valor1 = 2;
		int valor2 = 5;
		String mensagem = "Ocorreu um ajuste no valor da soma já que ";
		boolean eMaior = false;

		int soma = valor1 + valor2;
		
		System.out.println(valor1 > valor2);		
		if (valor1 > valor2) {
			soma = soma + 2;
			eMaior = true;
		} else if (valor1 < valor2) {
			soma = soma - 5;			
		}
		
		System.out.println(("" + valor1).concat(" + " + valor2).concat(" = " + soma));
		
		System.out.println(mensagem.concat(""+valor1).concat( eMaior ? " > " : " < " ).concat(""+ valor2));
		
	}

}