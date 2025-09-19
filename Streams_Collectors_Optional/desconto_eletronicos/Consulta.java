
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

	static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedido) {
		return pedido.stream().filter(
				p -> p.getProdutos().stream().anyMatch(prod -> prod.getCategoria().equals(CategoriaProduto.ELETRONICO)))
				.toList();
	}

	static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
		return produtos.stream().map(p -> {
			if (p.getCategoria().equals(CategoriaProduto.ELETRONICO))
				p.setPreco(p.getPreco() - p.getPreco() * 0.15);
			return p;
		}).collect(Collectors.toList());
	}
}
