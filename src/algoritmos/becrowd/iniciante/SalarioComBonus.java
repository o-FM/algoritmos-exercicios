package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class SalarioComBonus {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nameVendedor = scan.nextLine();
		double salarioFixo = scan.nextDouble();
		double totalVendas = scan.nextDouble();
		scan.close();

		double bonus = totalVendas * 0.15;

		System.out.printf("TOTAL = R$ %.2f%n", (salarioFixo + bonus));
	}
}
