package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numFuncionario = scan.nextInt();
		int numHoras = scan.nextInt();
		double valorHoraTrabalhada = scan.nextDouble();
		scan.close();

		double salario = numHoras * valorHoraTrabalhada;

		System.out.printf("NUMBER = %d%n", (numFuncionario));
		System.out.printf("SALARY = U$ %.2f%n", (salario));
	}
}
