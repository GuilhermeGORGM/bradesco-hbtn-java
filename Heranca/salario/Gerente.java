public class Gerente extends Empregado {

	public Gerente(double salarioFixo) {
		super(salarioFixo);
		// TODO Auto-generated constructor stub
	}

	public double calcularBonus(Departamento departamento) {
		if (departamento.alcancouMeta())
			return getSalarioFixo() * 0.2;
		return 0;
	}
}
