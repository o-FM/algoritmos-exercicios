package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class Distancia_1016 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int km = scan.nextInt();
        scan.close();

        int distancia = km * 2;

        System.out.println(distancia + " minutos");
    }

}
