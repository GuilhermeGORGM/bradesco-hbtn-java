public class Pedido {
	private double percentualDesconto;
	private ItemPedido[] itensPedido;

	public Pedido(double percentualDesconto, ItemPedido[] itensPedido) {
		super();
		this.percentualDesconto = percentualDesconto;
		this.itensPedido = itensPedido;
	}

	double calcularTotal() {
		double valorTotal = 0;
		for (ItemPedido itemPedido : itensPedido) {
			valorTotal += itemPedido.getQuantidade() * itemPedido.getProduto().obterPrecoLiquido();
		}
		valorTotal = valorTotal - (valorTotal * (percentualDesconto / 100));

		return valorTotal;
	}
}
