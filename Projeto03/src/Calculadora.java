
public abstract class Calculadora {
	
	// ATRIBUTOS
	public double valor1;
	public double valor2;
	private double resultado;
	private static int instancias = 0;
	
	// GETTERS E SETTERS
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
		
	// CONSTRUTORES
	public Calculadora(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		instancias++;
	}

	// METODOS
	public void soma() {
		setResultado(valor1 + valor2);
		System.out.println("Soma: "+resultado);
	}

	public void subtrai() {
		setResultado(valor1 - valor2);
		System.out.println("Subtracao: "+resultado);
	}

    public void multiplica() {
		setResultado(valor1 * valor2);
		System.out.println("Multiplicacao: "+resultado);
	}

    public void divide() {
		setResultado(valor1 / valor2);
		System.out.println("Divisao: "+resultado);
	}
    
    public static void getInstancias() {
    	System.out.println("Instacias: " + instancias);
    	System.out.println("-");
	}
    
    
}
