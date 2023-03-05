
public class ContaEspecial extends ContaBancaria {

	// ATRIBUTOS
	float limite; // redefinição do método sacar, permitindo saldo negativo até o valor limite
	
	// GETTERS E SETTERS
	
	// CONSTRUTORES

	public ContaEspecial(String cliente, int numConta, float saldo) {
		super(cliente, numConta, saldo);
		this.cliente = cliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	// METODOS
	
	@Override
	public void sacar() {
		linhaTracejada();
		System.out.println("Valor do saque: ");
		float valorSaque = input.nextFloat();
		saldo -= valorSaque;
		verSaldo();
	}
}
