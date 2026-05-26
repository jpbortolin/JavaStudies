package sistemaestoque.src.service;

import java.util.ArrayList;
import sistemaestoque.src.model.Produto;

public class EstoqueService {
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public void cadastrarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }
    
    public void listarProdutos(){
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado");
            return;
        } 
        else {
            for(Produto p : produtos){
                System.out.println(p);
            }
        }
    }
}
