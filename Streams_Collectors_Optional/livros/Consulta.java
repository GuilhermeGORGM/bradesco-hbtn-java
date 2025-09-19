
import java.util.List;

public class Consulta {
	static List<Produto> obterLivrosDoPedido(Pedido pedido) {
		return pedido.getProdutos().stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO)).toList();
	}
}
