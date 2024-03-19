package estruturaDeDados.pesoAltura;

import java.util.Objects;

public class PesoAltura {

    int peso;
    int altura;

    public PesoAltura() {
    }

    public PesoAltura(int peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PesoAltura that = (PesoAltura) o;
        return peso == that.peso && altura == that.altura;
    }

    @Override
    public int hashCode() {
        return Objects.hash(peso, altura);
    }

    @Override
    public String toString() {
        return "PesoAltura{" +
            "peso=" + peso +
            ", altura=" + altura +
            '}';
    }
}
