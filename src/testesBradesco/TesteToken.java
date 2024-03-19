import java.util.Base64;

public class TesteToken {

    public static void main(String[] args) {
        String campo = "Exemplo de campo para codificar em Base64";

        // Codificação do campo em Base64
        String base64String = Base64.getEncoder().encodeToString(campo.getBytes());

        System.out.println("Campo codificado em Base64: " + base64String);

        // Decodificação da string Base64 para o campo original
        String decodedString = new String(Base64.getDecoder().decode(base64String));

        System.out.println("Campo decodificado: " + decodedString);
    }
}
