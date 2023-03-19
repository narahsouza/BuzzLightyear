
public class CalculadoraCientifica extends Calculadora {

	// CONSTRUTORES
	public CalculadoraCientifica(int valor1, int valor2) {
		super(valor1, valor2);
	}
	
	// METODOS
	public void potencia() {
		setResultado(Math.pow(valor1, valor2));
		System.out.println("Potencia: "+getResultado());
	}
	
	public void raiz1() {
		setResultado(Math.sqrt(valor1));
		System.out.println("Raiz Valor 1: "+getResultado());
	}
	
	public void raiz2() {
		setResultado(Math.sqrt(valor2));
		System.out.println("Raiz Valor 2: "+getResultado());
	}
	
	public void calculos() {
		soma();
		subtrai();
		multiplica();
		divide();
		potencia();
		raiz1();
		raiz2();
		getInstancias();
	}
}
