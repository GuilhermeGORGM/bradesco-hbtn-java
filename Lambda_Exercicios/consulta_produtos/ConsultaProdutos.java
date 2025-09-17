
import java.util.List;

public class ConsultaProdutos {
	static List<Produto> filtrar(List<Produto> listaProdutos, CriterioFiltro criterioFiltro) {
		List<Produto> listaFiltrada = listaProdutos.stream().filter(p -> criterioFiltro.testar(p)).toList();
		return listaFiltrada;
	}
}
