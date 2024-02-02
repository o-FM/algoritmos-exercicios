package algoritmos;

import java.util.Arrays;

public class Anagrama {

    public static boolean isAnagrama(String str1, String str2) {
        // 1. Verificar se as Strings são do mesmo tamanho
        if (str1.length() != str2.length()) {
            return false;
        }

        // 2. Converter as Strings em arrays de caracteres
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();

        // 3. Ordenar os arrays de caracteres
        Arrays.sort(a);
        Arrays.sort(b);

        // 4. Comparar os arrays validando a igualdade entre eles
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {

        String s1 = "alegria";
        String s2 = "galeria";

        System.out.println(isAnagrama(s1, s2));
    }
}
