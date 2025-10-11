
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {
	public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
		Map<String, Long> pessoasPorCargo = pessoas.stream()
				.collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
		return pessoasPorCargo;
	}
}
