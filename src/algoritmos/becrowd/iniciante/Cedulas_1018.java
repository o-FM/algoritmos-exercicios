package algoritmos.becrowd.iniciante;

import java.util.Scanner;

public class Cedulas_1018 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int valor = scan.nextInt();
        scan.close();

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);
        for (int cedula : cedulas) {
            int qntdCedulas = valor / cedula;

            if (qntdCedulas > 0) {
                System.out.println(qntdCedulas + " nota(s) de R$ " + cedula + ",00");
                valor %= cedula;
            } else {
                System.out.println("0 nota(s) de R$ " + cedula + ",00");
            }
        }
    }
}
