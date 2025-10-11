
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ConsultaPessoas {
	public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {
		Map<String, Map<Integer, Long>> pessoasPorCargo = pessoas.stream().collect(Collectors
				.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade, Collectors.counting())));
		return pessoasPorCargo;
	}

	public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas) {
		Map<String, Double> pessoasPorCargo = pessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.averagingDouble(Pessoa::getSalario)));

		return pessoasPorCargo;
	}

	public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> pessoas) {
		Map<String, TreeSet<String>> pessoasPorCargo = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
				Collectors.flatMapping(p -> p.getHobbies().stream(), Collectors.toCollection(TreeSet::new))));
		return pessoasPorCargo;
	}
}
