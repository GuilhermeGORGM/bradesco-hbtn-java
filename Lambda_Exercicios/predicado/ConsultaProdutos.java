
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
	public static List<Produto> filtrar(List<Produto> listaProdutos, Predicate<Produto> criterioFiltro) {
		List<Produto> listaFiltrada = listaProdutos.stream().filter(p -> criterioFiltro.test(p)).toList();
		return listaFiltrada;
	}
}
