import java.util.Scanner;

public class ContaBancaria {

	// ATRIBUTOS
	String cliente;
	int numConta;
	float saldo;
	Scanner input = new Scanner(System.in);
	
	// GETTERS E SETTERS
	
	// CONSTRUTORES
	public ContaBancaria(String cliente, int numConta, float saldo) {
		this.cliente = cliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	// METODOS
	
	public void opcoes01() {
		novaLinha();
		System.out.println("Atender proximo cliente? 1 - SIM / 2 - NAO");
		int escolhaOpcoes01 = input.nextInt();
		linhaTracejada();
		switch (escolhaOpcoes01) {
			case 1:
				System.out.println("Proximo cliente a ser atendido:");
				dadosCliente();
				opcoes02();
				break;
			case 2:
				break;
		}
	}
	
	public void opcoes02() {
		System.out.println("Selecione:");
		System.out.println("1 - SALDO");
		System.out.println("2 - SAQUE");
		System.out.println("3 - DEPOSITO");
		System.out.println("4 - FINALIZAR");
		int escolhaOpcoes02 = input.nextInt();
		switch (escolhaOpcoes02) {
			case 1:
				verSaldo();
				opcoes02();
				break;
			case 2:
				sacar();
				opcoes02();
				break;
			case 3:				
				depositar();
				opcoes02();
				break;
			case 4:
				linhaTracejada();
				System.out.println("Atendimento finalizado.");
				break;
		}
	}
	
	public void dadosCliente() {
		System.out.println("NOME: " + cliente);
		System.out.println("CONTA: " + numConta);
		linhaTracejada();
	}
	
	public void verSaldo() {
		linhaTracejada();
		System.out.println("Saldo atual de " + cliente + ": R$" + saldo);
		linhaTracejada();
	}
	
	public void sacar() {
		linhaTracejada();
		System.out.println("Valor do saque: ");
		float valorSaque = input.nextFloat();
		float teste = saldo - valorSaque;
		
		// Testa se o saldo ficara negativo ou positivo.
		if (teste <= 0) System.out.println("Valor nao permitido!");
		else saldo = teste;
		
		verSaldo();
	}
	
	public void depositar() {
		linhaTracejada();
		System.out.println("Valor do deposito: ");
		float valorDeposito = input.nextFloat();
		saldo += valorDeposito;
		
		verSaldo();
	}
	
	public void novaLinha() {
		System.out.println();
	}
	public void linhaTracejada() {
		novaLinha();
		System.out.println("===========================================");
	}
}
