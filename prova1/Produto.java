public class Produto {

    //Atributos privados
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    
    //Construtor que recebe apenas o nome do produto
    public Produto(String nome) {
        this.nome = nome;
        this.quantidadeEstoque = 0; //Inicializado com zero unidades
    }

    //Construtor que recebe nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0; //Inicializado com zero unidades
    }

    //Métodos get
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    //Métodos set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    //Método chamado exibirinformacoes()
    public void exibirInformacoes() {
        System.out.println("_____________________");
        System.out.println("Nome: "+ nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Quantidade em estoque: "+ quantidadeEstoque);
    }
}
