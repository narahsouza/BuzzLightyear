
public class ContaPoupanca extends ContaBancaria {

	// ATRIBUTOS
	int diaderendimento;
	int rendimentos;
	float novoSaldo;
	
	// GETTERS E SETTERS
	
	// CONSTRUTORES
	
	public ContaPoupanca(String cliente, int numConta, float saldo, int diaderendimento) {
		super(cliente, numConta, saldo);
		this.diaderendimento = diaderendimento;
	}

	// METODOS
	public void verSaldo() {
		linhaTracejada();
		calcularNovoSaldo();
		linhaTracejada();
	}
	
	public void calcularNovoSaldo() {
		// recebe a taxa de rendimento da poupança e atualiza o saldo
		System.out.println("Saldo anterior de " + cliente + ": R$" + saldo);
		rendimentos = diaderendimento * 1;
		saldo += rendimentos;
		System.out.println("Rendimentos: R$" + rendimentos);
		System.out.println("Total: R$" + saldo);
	}
}
