package estruturaDeDados.pesoAltura;

public class EstruturaSimples {

    public static final int alturaMaxima = 225;

    public static void main(String[] args) {
        PesoAltura pessoa = new PesoAltura();
        pessoa.setPeso(80);
        pessoa.setAltura(185);

        System.out.println("Peso: ".concat(String.valueOf(pessoa.getPeso()))
            .concat(" - Altura"));
    }
}
