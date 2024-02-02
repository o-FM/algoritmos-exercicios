package algoritmos;

import java.text.Normalizer;
import java.text.Normalizer.Form;

public class Palindromo {

    public static boolean isPalindromo(String s) {
        /*
         * Normalizer.normalize(s, Normalizer.Form.NFD) -> Converte a string s para a Forma de
         * Decomposição Canônica Normalizada (NFD). Em NFD,
         * Caracteres compostos são decompostos
         * em seus componentes básicos.
         * Por exemplo, ‘á’ é decomposto em ‘a’ e um acento agudo separado.
         *
         * replaceAll(“[^\\p{ASCII}]”, “”) remove todos os caracteres não-ASCII do texto,
         * o que inclui caracteres com acentos, após a decomposição pelo Normalizer.
         * */
        s = Normalizer.normalize(s, Form.NFD).replaceAll("[^\\p{ASCII}]", "");

        /*
        * s.replaceAll(“[^A-Za-z0-9]”, “”).toLowerCase()
        * remove todos os caracteres que não são letras ou números
        * e converte a string restante para minúsculas.
        * Isso é feito para garantir que a verificação do palíndromo seja case-insensitive
        * e ignore caracteres especiais e espaços.
        * */
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int esquerda = 0;
        int direita = s.length() - 1;

        while (esquerda < direita) {
            if (s.charAt(esquerda) != s.charAt(direita)) {
                return false;
            }

            esquerda++;
            direita--;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "A sacada da casa";
        String s2 = "A cara rajada da jararaca";
        String s3 = "radar";
        String s4 = "osso";
        String s5 = "reviver";
        String s6 = "Missa é assim";
        String s7 = "Luza rocelina, a namorada do Manuel,leu Na Moda da Romana: Anil é cor Azul";

        System.out.println(isPalindromo(s1));
        System.out.println(isPalindromo(s2));
        System.out.println(isPalindromo(s3) + " -> ".concat(s3));
        System.out.println(isPalindromo(s4));
        System.out.println(isPalindromo(s5));
        System.out.println(isPalindromo(s6));
        System.out.println(isPalindromo(s7));
    }
}
