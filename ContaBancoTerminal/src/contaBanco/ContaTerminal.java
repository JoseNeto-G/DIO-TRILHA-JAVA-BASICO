package contaBanco;

import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Por favor, digite o número da Agência:");
		String agencia = scanner.nextLine();
		System.out.println("Por favor, digite o seu Nome Completo");
		String nome = scanner.nextLine();
		
		
		System.out.println("Por favor, digite o número da conta:");
		int numero = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Por favor, digite o valor do Saldo:");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
				", conta " + numero + " e o seu saldo " + saldo + " já está disponível para saque");
		
	}

}
