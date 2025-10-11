
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {
	private int codigo;
	private String nome;
	private String cargo;
	private int idade;
	private double salario;
	private List<String> hobbies;

	@Override
	public String toString() {
		return "[" + codigo + "] " + nome + " " + cargo + " " + idade + " R$ "
				+ String.format("%.6f", salario).replace('.', ',');
	}

	public String getCargo() {
		return cargo;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public double getSalario() {
		return salario;
	}

	public int getIdade() {
		return idade;
	}

	public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
		this.salario = salario;
		this.hobbies = hobbies;
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.nome.compareTo(o.nome);
	}
}
