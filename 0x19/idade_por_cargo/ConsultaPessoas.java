
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {
	public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoas) {
		Map<String, List<Pessoa>> pessoasPorCargo = pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo));
		return pessoasPorCargo;
	}

	public static Map<String, List<Integer>> obterIdadePorCargo(List<Pessoa> pessoas) {
		Map<String, List<Integer>> idadePorCargo = pessoas.stream().collect(
				Collectors.groupingBy(Pessoa::getCargo, Collectors.mapping(Pessoa::getIdade, Collectors.toList())));
		return idadePorCargo;
	}
}
