package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class MaiorValor_1013 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();

		int maiorAB = (a + b + Math.abs(a - b)) / 2;
		int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

		System.out.println(maior + " eh o maior");
	}
}
