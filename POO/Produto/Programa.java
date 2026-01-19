package POO.Produto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        produto prod = new produto();
        System.out.println("Entre com os dados do produto: ");
        System.out.print("Nome: ");
        prod.nome = sc.nextLine();
        System.out.print("Preço: ");
        prod.preco = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        prod.quantidade = sc.nextInt();

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
