package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class ConversaoTempo_1019 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int segundos = scan.nextInt();
        scan.close();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        System.out.println(horas + ":" + minutos + ":" + segundosRestantes);
    }
}
