import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 00 - TITULO LINDO
        System.out.println("LANCHONETE DA NARAH :)");
        Linha.tracejada();
        
        // 01 - EXIBE OPCOES DE LANCHE
        System.out.println("Opcoes de lanches:");
        for (Lanche c : Lanche.values()) {
            System.out.println(c.name() + " - R$" + c.getPreco());
        }
        
        /*
         * LEMBRETE SOBRE O TRECHO ACIMA:
         * "values()" RETORNA TODOS OS VALORES DO ENUM
         * "name()" OBTEM O NOME DA OPCAO DE ENUM
        */        

        // 02 - CLIENTE ESCOLHE LANCHE
        Linha.tracejada();
        System.out.println("Digite o nome do lanche desejado:");
        Lanche lancheSelecionado = Lanche.valueOf(scanner.nextLine().toUpperCase());
        
        /*
         * LEMBRETE SOBRE O TRECHO ACIMA:
         * "valueOf()" CONVERTE A ENTRADA EM UM VALOR ENUM
         * "toUpperCase()" CONVERTE PARA MAIUSCULAS
        */
        
        // 03 - EXIBE OPCOES DE BEBIDA
        Linha.tracejada();
        System.out.println("Opcoes de bebidas:");
        for (Bebida b : Bebida.values()) {
            System.out.println(b.name() + " - R$" + b.getPreco());
        }

        // 04 - CLIENTE ESCOLHE BEBIDA
        Linha.tracejada();
        System.out.println("Digite o nome da bebida desejada:");
        Bebida bebidaSelecionada = Bebida.valueOf(scanner.nextLine().toUpperCase());

        // 05 - CALCULA O VALOR DA CONTA
        double precoFinal = lancheSelecionado.getPreco() + bebidaSelecionada.getPreco();
        Linha.tracejada();
        System.out.println("Valor total da conta: R$" + precoFinal);
        
        // 07 - ENCERRA O METODO SCANNER
        scanner.close();
        
        // 08 - FINALIZA O ATENDIMENTO ;*
        Linha.tracejada();
        System.out.println("VOLTE SEMPRE <3");

        
    }
}
