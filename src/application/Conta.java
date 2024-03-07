package application;

public class Conta {

	int numero;
	String titular;
	String agencia;
	double saldo;
	String dataDeAbertura;

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		return "Nome:" + titular + " \nNumero da conta:" + numero + " \nAgencia:" + agencia + " \nSaldo:" + saldo
				+ " \nData de abertura:" + dataDeAbertura + ". E o rendimento da conta foi de:" + calculaRendimento();
	}
}
