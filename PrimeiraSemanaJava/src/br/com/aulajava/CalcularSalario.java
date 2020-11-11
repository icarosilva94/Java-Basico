/**
 * 
 */
package br.com.aulajava;

/**
 * @author Icaro
 *
 */
public class CalcularSalario {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//

		float salario_base = 3546.3f;
		float valor_vendas = 8400.55f;
		double percentual = 10 / 100;
		double comissao = percentual * valor_vendas;
		double salario_final = comissao + salario_base;
		System.out.println(salario_final);

	}

}



