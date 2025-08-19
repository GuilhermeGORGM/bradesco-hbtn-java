
import exceptions.OperacaoInvalidaException;

public abstract class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        } else if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -= valor;
    }

    double calcularTarifaMensal() {
        double percentDezSaldo = this.saldo * 0.1;
        double valorLimiteTarifa = 10;
        return Math.min(percentDezSaldo, valorLimiteTarifa);
    }

    double calcularJurosMensal() {
        if (this.saldo <= 0) {
            return 0;
        } else {
            return this.saldo * (this.taxaJurosAnual / 1200);
        }
    }

    void aplicarAtualizacaoMensal() {
        this.saldo += this.calcularJurosMensal();
        this.saldo -= this.calcularTarifaMensal();
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public ContaBancariaBasica() {
    }
}
