package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class CalculoSimples {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int peca1 = scan.nextInt();
		int qtdPeca1 = scan.nextInt();
		double valorUnitarioPeca1 = scan.nextDouble();

		int peca2 = scan.nextInt();
		int qtdPeca2 = scan.nextInt();
		double valorUnitarioPeca2 = scan.nextDouble();
		scan.close();

		double valorTotalPeca1 = qtdPeca1 * valorUnitarioPeca1;
		double valorTotalPeca2 = qtdPeca2 * valorUnitarioPeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (valorTotalPeca1 + valorTotalPeca2));
	}
}
