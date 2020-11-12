/**
 * 
 */
package br.com.aulajava;

import java.util.Scanner;

/**
 * @author Icaro
 *
 */
public class TreinandoScanner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String controle = "C";
		while (controle.equals("C")) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe seu nome:");
		String nome = sc.nextLine();
		//System.out.println("Meu nome é: " + nome);
		System.out.print("Informe sua idade:");
		int idade = sc.nextInt();
		//System.out.println("Minha idade é: " + idade);
		System.out.print("Informe seu peso:");
		float peso = sc.nextFloat();
		//System.out.println("Meu peso é: " + peso);
				
		System.out.printf("\nMeu nome é %s \nMinha idade é %d \nMeu peso é %.2f \n", nome, idade, peso);
		
		// && testa se duas condições são verdadeiras, caso sejam retorna true
		// || testa se uma das condições é verdadeira, caso seja retorna true

		verificaIdade(peso, idade, nome);
		verificaIdadeComSwicth(idade);
		break;
	}
	}
	public static void verificaIdade(float peso, int idade, String nome) {
		if ((peso > 80 && idade > 40) || nome.equals("andre")) {
			System.out.println("Você precisa correr mais!");
		} else {
			System.out.println("Coma mais carboidratos");
		}
	}

	public static void verificaIdadeComSwicth(int idade) {
		switch (idade) {
		case 80:
			System.out.println("Parabéns pelos seus 80 anos!");
			break;

		case 40:
			System.out.println("Parabéns pelos seus 40 anos!");
			break;

		default:
			System.out.println("Você ainda é jovem!");
			break;
		}
	}
}
