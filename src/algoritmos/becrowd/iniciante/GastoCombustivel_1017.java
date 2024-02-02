package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class GastoCombustivel_1017 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tempoViagem = scan.nextInt();
        int velocidadeMedia = scan.nextInt();
        scan.close();

        double gastoCombustivel = (tempoViagem * velocidadeMedia) / 12.000;

        System.out.printf("%.3f%n", (gastoCombustivel));
    }
}
