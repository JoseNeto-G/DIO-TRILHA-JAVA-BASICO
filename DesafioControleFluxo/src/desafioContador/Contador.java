package desafioContador;

import java.util.Scanner;
import desafioContador.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		int n1 = valor.nextInt();
		int n2 = valor.nextInt();

		try {
            boolean resultado = contar(n1, n2); 
            contar(resultado);  
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");

		}

		int contagem = n2 - n1;

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);

		}
	}

	static void contar(boolean resultado) throws ParametrosInvalidosException {
		if (resultado == false)
			throw new ParametrosInvalidosException();
	}

	private static boolean contar(int n1, int n2) {
		boolean resultado;
		if (n2 > n1) {
			resultado = true;
		} else {
			resultado = false;
		}
		return resultado;
	}

}
