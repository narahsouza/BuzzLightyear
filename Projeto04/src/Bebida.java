// ENUM PARA OPCOES DE BEBIDA
public enum Bebida {
	AGUA(2.0),
    SUCO(3.0),
    REFRIGERANTE(5.0);

	// VARIAVEL QUE RECEBE O ITEM DENTRO DOS PARENTESES
    private double preco; 

    // CONSTRUTOR PARA LANCHE
    private Bebida(double preco) {
    	this.preco = preco;
    }
    
    // METODO GET
    public double getPreco() {
    	return this.preco;
    }
}