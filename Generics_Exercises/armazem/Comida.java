
public class Comida {
    private String nome;
    private double calorias;
    private double preco;

    public Comida(String nome, double calorias, double preco) {
        this.nome = nome;
        this.calorias = calorias;
        this.preco = preco;
    }

    public String toString() {
        return "[" + this.nome + "] " + String.format("%.6f", this.calorias) + " R$ " + String.format("%.6f", this.preco);
    }
}
