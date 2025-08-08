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

	void apresentarResumoPedido() {
//		String resumo = "------- RESUMO PEDIDO -------\r\n"
//				+ "Tipo: Livro  Titulo: Um de nos esta mentindo  Preco: 40,17  Quant: 1  Total: 40,17\r\n"
//				+ "Tipo: Livro  Titulo: Mindset Milionario  Preco: 36,46  Quant: 2  Total: 72,91\r\n"
//				+ "Tipo: Dvd  Titulo: Anjos da Noite 5 - Guerras de Sangue  Preco: 20,28  Quant: 1  Total: 20,28\r\n"
//				+ "----------------------------\r\n" + "DESCONTO: 6,67\r\n" + "TOTAL PRODUTOS: 133,36\r\n"
//				+ "----------------------------\r\n" + "TOTAL PEDIDO: 126,69\r\n" + "----------------------------";
		String resumo = "------- RESUMO PEDIDO -------\r\n";
		double totalProdutos = 0;

		for (ItemPedido itemPedido : itensPedido) {
			String tipoProduto = itemPedido.getProduto().getClass().getSimpleName();
			String titulo = itemPedido.getProduto().getTitulo();

			double preco = itemPedido.getProduto().obterPrecoLiquido();
			String precoFormat = String.format("%.2f", preco);

			int quantidade = itemPedido.getQuantidade();

			double precoTotal = itemPedido.getQuantidade() * preco;
			String precoTotalFormat = String.format("%.2f", precoTotal);

			totalProdutos += precoTotal;

			resumo += "Tipo: " + tipoProduto + "  Titulo: " + titulo + "  Preco: " + precoFormat + "  Quant: "
					+ quantidade + "  Total: " + precoTotalFormat + "\r\n";

		}
		double desconto = totalProdutos * (percentualDesconto / 100);
		resumo += "----------------------------\r\n" + "DESCONTO: " + String.format("%.2f", desconto) + "\r\n";
		resumo += "TOTAL PRODUTOS: " + String.format("%.2f", totalProdutos) + "\r\n";
		resumo += "----------------------------\r\n" + "TOTAL PEDIDO: " + String.format("%.2f", calcularTotal())
				+ "\r\n" + "----------------------------";

		System.out.println(resumo);
	}
}
