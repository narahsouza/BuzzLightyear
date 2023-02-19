
public class Empresa {
	
	// ATRIBUTOS
	protected String nome;
	protected int codigo;
	
	// CONSTRUTORES
	public Empresa(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
		
	// METODOS
	public void login() {
		System.out.println("Seja bem-vindo!");
		System.out.println("Insira seus dados para entrar:");
		System.out.println("Nome: " + nome);
		System.out.println("Codigo: " + codigo);
		System.out.println("---");
	}
}
