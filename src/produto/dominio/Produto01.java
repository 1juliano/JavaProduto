package produto.dominio;

public class Produto01 {
    private String nome;
    private double preco;
    private int quantidade;

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: nome inválido!");
        }
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: preço não pode ser negativo!");
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: quantidade não pode ser negativa!");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double calcularValorEstoque() {
        return this.preco * this.quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Erro: informe uma quantidade positiva!");
        }
    }
}
