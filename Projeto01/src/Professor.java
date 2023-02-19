
public class Professor extends Empresa {
		
	// CONSTRUTORES
	public Professor(String nome, int codigo) {
		super(nome, codigo);
	}

	// METODOS
	public void telaInicial() {
		System.out.println("Ola Professor " + nome + "!");
		System.out.println("Seus dados cadastrais:");
		System.out.println("Nome: " + nome);
		System.out.println("Codigo: " + codigo);
		System.out.println("---");
	}
	
	public void pendencias() {
		System.out.println("Voce tem notas para avaliar!");
		System.out.println("---");
	}
}
