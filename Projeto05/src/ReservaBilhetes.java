import java.util.ArrayList;
import java.util.Scanner;

public class ReservaBilhetes {
	
	private static ArrayList<String> listaAssentos;

    public ReservaBilhetes() {
        listaAssentos = new ArrayList<>();
    }

    public void defineAssentosVazios(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            listaAssentos.add(null);
        }
    }
	
    public static void main(String[] args) {
             
        ReservaBilhetes vooAD6004 = new ReservaBilhetes();
        vooAD6004.defineAssentosVazios(6);

        int escolha;
		
        do {
	        // EXIBE MENU
        	System.out.println("Escolha a opção desejada:");
        	System.out.println();
            System.out.println("1 - Reservar");
            System.out.println("2 - Cancelar");
            System.out.println("3 - Verificar");
            System.out.println("4 - Exibir");
            System.out.println("5 - Sair");
            System.out.println();
            
            // ESCOLHA        
            Scanner scanner = new Scanner(System.in);
            escolha = scanner.nextInt();
            
            
            switch (escolha) {
    	        case 1:
    	        	reserva();
    	            break;
    	        case 2:
    	        	cancela();
    	            break;
    	        case 3:
    	        	verifica();
    	            break;
    	        case 4:
    	        	exibe();
    	            break;
    	        case 5:
    	            System.out.println("Encerrado.");
    	            System.out.println();
    	            break;
    	        default:
    	            System.out.println("Opção inválida. Por favor, tente novamente.");
    	    }
        } while (escolha != 5);
    }
    
    // METODOS
       
    public static void reserva() {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println();
    	System.out.println("Insira o nome:");
    	System.out.println();
        String nome = scanner.nextLine();
        
        System.out.println();
        System.out.println("Escolha o assento:");
    	System.out.println();
        System.out.println("0 - A1");
        System.out.println("1 - A2");
        System.out.println("2 - A3");
        System.out.println("3 - A4");
        System.out.println("4 - A5");
        System.out.println("5 - A6");
        System.out.println();
        int escolhaAssento = scanner.nextInt();
        
        adicionarNome(nome, escolhaAssento);
        System.out.println();
        System.out.println("Assento reservado.");
        System.out.println();
    }
    
    public static void adicionarNome(String nome, int indice) {
    	listaAssentos.add(indice, nome);
    }
    
    public static void cancela() {
    	System.out.println();
    	System.out.println("Indisponível.");
    	System.out.println();
    }
    
    public static void verifica() {
    	System.out.println();
    	System.out.println("Indisponível.");
    	System.out.println();
    }
    
    public static void exibe() {
    	System.out.println();
    	System.out.println("Reservas:");
    	System.out.println();
        for (String nome : listaAssentos) {
            System.out.println(nome);
        }
        System.out.println();
    }
}