
public class Main {

	public static void main(String[] args) {
		
		Aluno aa = new Aluno("Jose", 123456789);
		aa.login();
		aa.telaInicial();
		aa.pendencias();
		aa.calculaMedia("Pedro", 10,4);
		aa.calculaMedia("Lucas", 10,0);
	}
}
