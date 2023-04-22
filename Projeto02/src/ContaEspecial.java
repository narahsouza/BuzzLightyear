public class ContaEspecial extends ContaBancaria {

    // ATRIBUTOS
    float limite; // redefinição do método sacar, permitindo saldo negativo até o valor limite

    // GETTERS E SETTERS

    // CONSTRUTORES

    public ContaEspecial(String cliente, int numConta, float saldo) {
        super(cliente, numConta, saldo);
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    // METODOS

    public void sacarEspesial() {
        linhaTracejada();
        System.out.println("Caro " + cliente + ", qual valor deseja sacar?");
        float valSacar = input.nextFloat();
        if (saldo < valSacar) {

            float resultado = saldo - valSacar;
            System.out.println("Saldo disponível: " + resultado);

            if (resultado < limite) {
                System.out.println("Saldo disponível para emprestimo: $ 50,00");
            } else {
                System.out.println("Acima do limite permitido, não será realizado emprestimo");
            }

        } else {
            System.out.println("Efetuado com sucesso!");
            float resultado = saldo - valSacar;
            System.out.println("Saldo disponível: " + resultado);
        }
    }
}
