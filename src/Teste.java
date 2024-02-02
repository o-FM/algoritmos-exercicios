import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.lang.Math.abs;

public class Teste {

    private final static Pattern PATTERN = Pattern.compile("^[0-9a-zA-Z]{8}$");
    private static final Integer[] pesoCNPJ = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

//    public Teste(long expirationTimeInMinutes) {
//        this.expirationTimeInMinutes = expirationTimeInMinutes;
//    }

    public static Boolean isValidPattenrOtp(String otp) {
        return PATTERN.matcher(otp).matches();
    }

    public static Boolean isValidTimeOtp(String otp, LocalDateTime issueAt, Long expirationTimeInMinutes) {
        LocalDateTime now = LocalDateTime.now();

        return issueAt.plusMinutes(expirationTimeInMinutes).isAfter(now);
    }

    public static Boolean validaTamanhoCpf(String cpf) {
        return cpf.matches("^\\d{11}$");
    }

    private static Integer calculaDigitosVerificadorCpf(String cpf, Integer multiplicador) {
        return (Integer.parseInt(cpf.substring(0, 1))) + multiplicador * Integer.parseInt(cpf.substring(1, 2)) %11;
    }

    private static Integer calculaDigitosVerificadoresCpf(String cpf) {
        Integer[] multiplicadores = {10, 9, 8, 7, 6, 5, 4, 3, 2};

        if (cpf.length() != 11) {
            throw new IllegalArgumentException("O CPF deve ter 11 dígitos.");
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Integer.parseInt(cpf.charAt(i) + "") * multiplicadores[i];
        }

        int resto = soma % 11;
        if (resto == 0 || resto == 1) {
            return 0;
        } else {
            return 11 - resto;
        }
    }

    private static Integer calculaDigitoVerificadorCnpj(String inscricaoCnpj, Integer[] pesoCNPJ) {
        Integer soma = 0;

        for (int i = inscricaoCnpj.length() - 1, digito; i >= 0; i--) {
            digito = Integer.parseInt(inscricaoCnpj.substring(i, i + 1));
            soma += digito * pesoCNPJ[pesoCNPJ.length - inscricaoCnpj.length() + i];

        }

        soma = 11 - soma % 11;

        return soma > 9 ? 0 : soma;
    }

    private static Boolean isCNPJValid(String cnpj) {
        cnpj = cnpj.replaceAll("[\\.\\/-]", "");

        if (cnpj.length() != 14) {
            return false;
        }

        Integer digitoVerificador1 = calculaDigitoVerificadorCnpj(cnpj.substring(0, 12), pesoCNPJ);
        Integer digitoVerificador2 = calculaDigitoVerificadorCnpj(cnpj.substring(0, 12) + digitoVerificador1, pesoCNPJ);

        return cnpj.equals(cnpj.substring(0,12) + digitoVerificador1.toString() + digitoVerificador2.toString());
    }

    public static void main(String[] args) {
        String otp = "biel1108";
        String cpf = "09684052820";
        String cnpj = "36.913.444/0001-65";

        System.out.println(isCNPJValid(cnpj));
        System.out.println(calculaDigitoVerificadorCnpj("278657570001", pesoCNPJ));

//        if (!isValidPattenrOtp(otp)) {
//            throw new IllegalArgumentException("OTP inválida.");
//        }
//
//        Boolean isValidTimeOtp = isValidTimeOtp(otp, LocalDateTime.now(), 1L);
//        if (!isValidTimeOtp) {
//            throw new DateTimeException("OTP espirada.");
//        }
//
//        System.out.println(validaTamanhoCpf(cpf));
//        System.out.println("Padrão OTP: " + otp);
//        System.out.println(calculaDigitosVerificadoresCpf(cpf));
    }
}
