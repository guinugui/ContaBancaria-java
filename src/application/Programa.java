package application;

public class Programa {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.getNumero();
		primeiraConta.getSaldo();
		
		boolean consegui = primeiraConta.saca(2000);
		if (consegui) {
		System.out.println("Consegui sacar");
		} else {
		System.out.println("Não consegui sacar");
		}
		

		
	}

}
