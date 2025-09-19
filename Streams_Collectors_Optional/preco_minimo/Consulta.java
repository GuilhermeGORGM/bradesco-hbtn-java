
import java.util.Comparator;
import java.util.List;

public class Consulta {
	static List<Produto> obterLivrosDoPedido(Pedido pedido) {
		return pedido.getProdutos().stream().filter(p -> p.getCategoria().equals(CategoriaProduto.LIVRO)).toList();
	}

	static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
		return produtos.stream().max(Comparator.comparingDouble(Produto::getPreco)).get();
	}

	static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, double precoMinimo) {
		return produtos.stream().filter(p -> p.getPreco() >= precoMinimo).toList();
	}
}
