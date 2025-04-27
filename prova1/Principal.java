import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        Produto produto = null;

        boolean sair = false;

        //Menu
        while(!sair) {

            System.out.println();
            System.out.println("---Menu---");
            System.out.println("1 - Criar produto informando nome");
            System.out.println("2 - Criar produto informando nome e preço");
            System.out.println("3 - Exibir informações do produto");
            System.out.println("4 - Atribuir nome do produto");
            System.out.println("5 - Obter nome do produto");
            System.out.println("6 - Atribuir preço do produto");
            System.out.println("7 - Obter preço do produto");
            System.out.println("8 - Atribuir quantidade em estoque");
            System.out.println("9 - Obter quantidade em estoque");
            System.out.println("0 - Sair");

            String opcao = scanner.nextLine();

            switch (opcao) {

                case "1":
                    System.out.println("Digite o nome do produto: ");
                    produto = new Produto(scanner.nextLine());
                    System.out.println("Produto criado com nome");
                    break;
                case "2":
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o preço do produto");
                    double preco = scanner.nextDouble();
                    produto = new Produto(nome, preco);
                    break;
                case "3":
                    System.out.println("Exibindo informações do produto: ");
                    if(produto == null) {
                        System.out.println("Produto não criado");
                    } else {
                        produto.exibirInformacoes();
                    }
                    break;
                case "4":
                    if(produto == null) {
                        System.out.println("Produto não criado");
                    } else {
                        System.out.println("Informe um nome para o produto: ");
                        produto.setNome(scanner.nextLine());
                    }
                    break;
                case "5":
                    if(produto == null){
                        System.out.println("Produto não criado");
                    } else {
                        System.out.println("Nome do produto: ");
                        System.out.println(produto.getNome());
                    }
                    break;
                case "6":
                    if(produto == null){
                        System.out.println("Produto não criado");
                    } else {
                        System.out.println("Informe um preço para o produto: ");
                        produto.setPreco(scanner.nextDouble());
                    }
                    break;
                case "7":
                    if(produto == null){
                        System.out.println("Produto não criado");
                    } else {
                        System.out.println("Preço do produto: ");
                        System.out.println(produto.getPreco());
                    }
                    break;
                case "8": 
                    if(produto == null){
                        System.out.println("Produto não criado");
                    } else {
                        System.out.println("Informe uma quantidade em estoque para o produto: ");
                        produto.setQuantidadeEstoque(scanner.nextInt());
                        scanner.nextLine();
                    }
                    break;
                case "9": 
                    if(produto == null){
                        System.out.println("Produto não criado");
                    } else {
                        System.out.println("Quantidade em estoque: ");
                        System.out.println(produto.getQuantidadeEstoque());
                    }
                    break;
                case "0":
                    System.out.println("Saindo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Escolha uma opção válida do menu!");
            }
        }

        scanner.close();
	}

}
