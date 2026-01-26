package POO.Produto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Preço: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        int quantidade = sc.nextInt();

        produto prod = new produto(nome, preco, quantidade);

        prod.setNome("Computador");
        prod.setPreco(1200.00);
        prod.setQuantidade(10); 
        System.out.println("Nome atualizado: " + prod.getNome());
        System.out.println("Preço atualizado: " + prod.getPreco());
        System.out.println("Quantidade atualizada: " + prod.getQuantidade());

        System.out.println();
        System.out.println("Dados do produto" + prod);
        System.out.println("Entre com o número de produtos a ser adicionado ao estoque: ");
        int qte = sc.nextInt();
        prod.adicionarProdutos(qte);
        System.out.println();
        System.out.println("Dados atualizados" + prod);
        System.out.println("Entre com o número de produtos a ser removido do estoque: ");
        qte = sc.nextInt();
        prod.removerProdutos(qte);
        System.out.println();
        System.out.println("Dados atualizados" + prod);

        sc.close();
    }
}
