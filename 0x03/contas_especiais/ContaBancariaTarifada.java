
import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {
    private int quantidadeTransacoes = 0;

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    public ContaBancariaTarifada() {
    }

    @Override
    void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        setSaldo(getSaldo() - 0.1);
        quantidadeTransacoes++;
    }

    @Override
    void depositar(double valor) throws OperacaoInvalidaException {
        super.depositar(valor);
        setSaldo(getSaldo() - 0.1);
        quantidadeTransacoes++;
    }
}
