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
		//System.out.println("Meu nome �: " + nome);
		System.out.print("Informe sua idade:");
		int idade = sc.nextInt();
		//System.out.println("Minha idade �: " + idade);
		System.out.print("Informe seu peso:");
		float peso = sc.nextFloat();
		//System.out.println("Meu peso �: " + peso);
				
		System.out.printf("\nMeu nome � %s \nMinha idade � %d \nMeu peso � %.2f \n", nome, idade, peso);
		
		// && testa se duas condi��es s�o verdadeiras, caso sejam retorna true
		// || testa se uma das condi��es � verdadeira, caso seja retorna true

		verificaIdade(peso, idade, nome);
		verificaIdadeComSwicth(idade);
		break;
	}
	}
	public static void verificaIdade(float peso, int idade, String nome) {
		if ((peso > 80 && idade > 40) || nome.equals("andre")) {
			System.out.println("Voc� precisa correr mais!");
		} else {
			System.out.println("Coma mais carboidratos");
		}
	}

	public static void verificaIdadeComSwicth(int idade) {
		switch (idade) {
		case 80:
			System.out.println("Parab�ns pelos seus 80 anos!");
			break;

		case 40:
			System.out.println("Parab�ns pelos seus 40 anos!");
			break;

		default:
			System.out.println("Voc� ainda � jovem!");
			break;
		}
	}
}
