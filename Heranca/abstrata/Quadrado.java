public class Quadrado extends Retangulo {
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		if (lado < 0)
			throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
		this.altura = lado;
		this.lado = lado;
		this.largura = lado;
	}

	public String toString() {
		return "[Quadrado] " + String.format("%.2f", this.lado);
	}
}
