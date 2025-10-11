
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {
	public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
		Map<String, List<Pessoa>> pessoasPorCargo = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
		return pessoasPorCargo;
	}

	public static Map<String, List<Pessoa>> obterPessoasPorCargoAcimaDe40anos(List<Pessoa> pessoas) {
		Map<String, List<Pessoa>> pessoasPorCargo = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,
				Collectors.filtering(p -> p.getIdade() > 40, Collectors.toList())));
		return pessoasPorCargo;
	}
}
