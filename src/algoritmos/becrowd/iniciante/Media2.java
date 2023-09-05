package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		double C = scan.nextDouble();
		scan.close();
		double media = (A * 2 + B * 3 + C * 5) / 10;

		System.out.printf("MEDIA = %.1f%n", (media));
	}
}
