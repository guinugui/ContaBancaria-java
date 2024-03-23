package application;

public class Conta {

	private int numero;
	private Cliente titular = new Cliente();
	private String agencia;
	private double saldo;
	private Data dataDeAbertura = new Data();

	public boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;

		} else {
			this.saldo = this.saldo - valor;
			return true;
		}
	}

	boolean transfere(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if (retirou == false) {
			System.out.println("Nao deu para tranferencia");
			return false;
		} else {
			destino.depositar(valor);
			System.out.println("tranferencia concluida");
			return true;
		}
	}

	public int getNumero() {
		return this.numero;
	}
	
	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public String getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public Data getDataDeAbertura() {
		return dataDeAbertura;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public double calculaRendimento() {
		return this.saldo * 0.1;
	}

	public String recuperaDadosParaImpressao() {
		return "Nome:" + titular + " \nNumero da conta:" + numero + " \nAgencia:" + agencia + " \nSaldo:" + saldo
				+ " \nData de abertura:" + "\nData de abertura: " + this.dataDeAbertura.dataFormatada() + dataDeAbertura
				+ ". E o rendimento da conta foi de:" + calculaRendimento();
	}
}
