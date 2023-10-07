package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class Esfera_1011 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double raio = scan.nextDouble();
		scan.close();

		double pi = 3.14159;
		double volume = (4 / 3.0) * pi * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f%n", (volume));
	}
}
