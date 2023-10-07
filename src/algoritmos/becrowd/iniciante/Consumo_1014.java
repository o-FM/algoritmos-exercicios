package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class Consumo_1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        double y = scan.nextDouble();
        scan.close();

        double combustivel = x / y;

        System.out.printf("%.3f km/l%n", (combustivel));
    }
}
