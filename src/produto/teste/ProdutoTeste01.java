package produto.teste;

import produto.dominio.Produto01;

public class ProdutoTeste01 {
    static void main(String[] args) {
        Produto01 produto01 = new Produto01();

        produto01.setNome("Teclado");
        produto01.setPreco(150.00);
        produto01.setQuantidade(5);

        Produto01 produto02 = new Produto01();

        produto02.setNome("Mouse");
        produto02.setPreco(80.00);
        produto02.setQuantidade(10);

        System.out.println("========== PRODUTO 01 ==========");
        System.out.println("Nome: " + produto01.getNome());
        System.out.println("Preço: R$ " + produto01.getPreco());
        System.out.println("Quantidade: " + produto01.getQuantidade());
        System.out.println("Valor do estoque: R$ "
                + produto01.calcularValorEstoque());

        System.out.println("\n========== PRODUTO 02 ==========");
        System.out.println("Nome: " + produto02.getNome());
        System.out.println("Preço: R$ " + produto02.getPreco());
        System.out.println("Quantidade: " + produto02.getQuantidade());
        System.out.println("Valor do estoque: R$ "
                + produto02.calcularValorEstoque());

        produto01.setPreco(-500);
        produto02.setQuantidade(-10);

        produto01.adicionarEstoque(3);

        System.out.println("\nQuantidade do teclado após adicionar estoque: "
                + produto01.getQuantidade());


    }
}

