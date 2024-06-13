package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class IdadeEmDias_1020 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int dias = scan.nextInt();
        scan.close();

        int anos = dias / 365;
        int meses = (dias - (anos * 365)) / 30;
        int diasRestantes = dias - (anos * 365) - (meses * 30);

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(diasRestantes + " dia(s)");
    }
}
