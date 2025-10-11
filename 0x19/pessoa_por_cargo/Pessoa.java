
public class Pessoa {
	private int codigo;
	private String nome;
	private String cargo;
	private int idade;
	private double salario;

	@Override
	public String toString() {
		return "[" + codigo + "] " + nome + " " + cargo + " " + idade + " R$ " + String.format("%.6f", salario);
	}

	public String getCargo() {
		return cargo;
	}

	public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
	}

}
