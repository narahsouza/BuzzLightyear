import java.util.Scanner;

public class Aluno extends Professor {

	// ATRIBUTOS
	private int resposta;
	Scanner input = new Scanner (System.in);
	private String aluno;
	private double media;
	
	// CONSTRUTORES
	public Aluno(String nome, int codigo) {
		super(nome, codigo);
	}
	
	// METODOS
	
	public void calculaMedia(String aluno, int nota1, int nota2) {
		this.aluno = aluno;
		media = (nota1 + nota2) / 2;
		System.out.println("Nome do aluno: " + aluno);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Media de " + aluno + ": " + media);
		System.out.println("---");
		avaliar();
	}
	
	public void avaliar() {
		System.out.println("Avalie o aluno:");
		System.out.println("1 - APROVADO / 2 - REPROVADO");
		resposta = input.nextInt();
		if (resposta == 1)
			System.out.println("O aluno " + aluno +" foi aprovado!");
		if (resposta == 2)
			System.out.println("O aluno " + aluno +" foi reprovado!");
		System.out.println("---");
	}
}
