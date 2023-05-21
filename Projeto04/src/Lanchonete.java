import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 00 - TITULO LINDO <3
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
        Lanche lancheSelecionado;
        
        // 03 - BLOCO TRY-CATCH PARA EXIBIR MENSAGEM EM CASO DE ERRO DE DIGITACAO
        try {
            lancheSelecionado = Lanche.valueOf(scanner.nextLine().toUpperCase());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Opcao de lanche invalida!");
            System.out.println("Por favor, inicie o pedido novamente.");
            scanner.close();
            return;
        }
        
        /*
         * LEMBRETE SOBRE O TRECHO ACIMA:
         * "valueOf()" CONVERTE A ENTRADA EM UM VALOR ENUM
         * "toUpperCase()" CONVERTE PARA MAIUSCULAS
        */
        
        // 04 - EXIBE OPCOES DE BEBIDA
        Linha.tracejada();
        System.out.println("Opcoes de bebidas:");
        for (Bebida b : Bebida.values()) {
            System.out.println(b.name() + " - R$" + b.getPreco());
        }

        // 05 - CLIENTE ESCOLHE BEBIDA
        Linha.tracejada();
        System.out.println("Digite o nome da bebida desejada:");
        Bebida bebidaSelecionada;
        
        // 06 - BLOCO TRY-CATCH PARA EXIBIR MENSAGEM EM CASO DE ERRO DE DIGITACAO
        try {
            bebidaSelecionada = Bebida.valueOf(scanner.nextLine().toUpperCase());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Opcao de bebida invalida!");
            System.out.println("Por favor, inicie o pedido novamente.");
            scanner.close();
            return;
        }

        // 07 - CALCULA O VALOR DA CONTA
        double precoFinal = lancheSelecionado.getPreco() + bebidaSelecionada.getPreco();
        Linha.tracejada();
        System.out.println("Valor total da conta: R$" + precoFinal);
        
        // 08 - ENCERRA O METODO SCANNER
        scanner.close();
        
        // 09 - FINALIZA O ATENDIMENTO ;*
        Linha.tracejada();
        System.out.println("VOLTE SEMPRE <3");
    }
}
