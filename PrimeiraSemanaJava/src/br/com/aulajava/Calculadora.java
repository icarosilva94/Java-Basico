package br.com.aulajava;

public class Calculadora {

	static int valorpadraoMultiplicacao = 2;

	// float eu consigo atribuir valor inteiro

	float valorPadraoSoma = 3.3f;
	static int valorPadraoSomaInteiro = (int) 3.4f;

	public static int realizarMultiplicacao(int valor) {

		return valor *valorpadraoMultiplicacao;
	}

	public float realizaSoma(int valor) {

		return valor * this.valorPadraoSoma;
	}
}