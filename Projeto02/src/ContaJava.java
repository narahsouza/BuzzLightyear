
public class ContaJava {

	public static void main(String[] args) {
			
		ContaBancaria cliente01 = new ContaBancaria("JOSE FERREIRA", 101, 100);
		cliente01.opcoes01();
		
		ContaPoupanca cliente02 = new ContaPoupanca("MARIA SILVA", 102, 200, 10);
		cliente02.opcoes01();
		
		ContaEspecial cliente03 = new ContaEspecial("JESUS MOURA", 103, 300);
		cliente03.opcoes01();
		
		System.out.println("\nSem mais clientes.");
		
		
		/*
		 * a) Incluir dados relativos a(s) conta(s) de um cliente;
		 * b) Sacar um determinado valor da(s) sua(s) conta(s);
		 * c) Depositar um determinado valor na(s) sua(s) conta(s);
		 * d) Mostrar o novo saldo do cliente, a partir da taxa de rendimento, 
		 * daqueles que possuem conta poupança;
		 * e) Mostrar os dados da(s) conta(s) de um cliente;*/
	}

}
