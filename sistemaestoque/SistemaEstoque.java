package sistemaestoque;

import java.util.Scanner;
import sistemaestoque.src.model.Produto;
import sistemaestoque.src.service.EstoqueService;

public class SistemaEstoque {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstoqueService estoque = new EstoqueService();

        int opcao;

        do {
            System.out.println("\n==== SISTEMA DE ESTOQUE ====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("0 - Sair");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("Nome:");
                    String nome = sc.nextLine();
                     
                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    Produto produto = new Produto(nome, preco, quantidade);
                    estoque.cadastrarProduto(produto);
                    
                    break;

                case 2:
                    estoque.listarProdutos();
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } 
        
        while(opcao != 0);
        sc.close();
    } 
}
