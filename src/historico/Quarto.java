package historico;

public class Quarto {
    String numero;
    String tipo;
    double precoDiario;
    boolean disponivel;

    public Quarto(String numero, String tipo, double precoDiario) {
        this.numero = numero;
        this.tipo = tipo;
        this.precoDiario = precoDiario;
        this.disponivel = true;
    }
}
