package application;

public class Programa {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.numero = 123;
		primeiraConta.saldo = 0.0;
		primeiraConta.agencia = "Banco do brasil";
		primeiraConta.dataDeAbertura = "24/10/2002";
		primeiraConta.titular = "Guilherme Ribeiro";

		//Conta segundaConta = primeiraConta;
		Conta segundaConta = new Conta();
		segundaConta.numero = 123;
		segundaConta.saldo = 0.0;
		segundaConta.agencia = "Banco do brasil";
		segundaConta.dataDeAbertura = "24/10/2002";
		segundaConta.titular = "Guilherme Ribeiro";
		
		
		
		if (primeiraConta == segundaConta) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
			System.out.println();
		}
		
		primeiraConta.depositar(1000);
		primeiraConta.sacar(500);
		
		
		segundaConta.depositar(2000);
		segundaConta.sacar(1000);
		

		
		System.out.println(primeiraConta.recuperaDadosParaImpressao());
		System.out.println();
		System.out.println(segundaConta.recuperaDadosParaImpressao());

		
	}

}
