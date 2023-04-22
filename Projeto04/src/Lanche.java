// ENUM PARA OPCOES DE COMIDA
public enum Lanche {
	SALGADO(5.0),
    BATATA(10.0),
    SANDUICHE(15.0);
    	
	// VARIAVEL QUE RECEBE O ITEM DENTRO DOS PARENTESES
    private double preco; 

    // CONSTRUTOR PARA LANCHE
    private Lanche(double preco) {
    	this.preco = preco;
    	}
    
    // METODO GET
    public double getPreco() {
        return this.preco;
    }
}