package hora_da_pratica.desafio07;

import java.util.ArrayList;

public class Desafio07 {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("Banana", 5.33 , 3);
        Produto p2 = new ProdutoPerecivel("Frango", 19.99 , 1, "07/07/2024");
        Produto p3 = new Produto("Arroz", 5.99 , 2);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        System.out.println(produtos);
        System.out.println(produtos.size());
        System.out.println(produtos.get(1));



    }

}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
               "nome='" + nome + '\'' +
               ", preco=" + preco +
               ", quantidade=" + quantidade +
               '}';
    }
}

class ProdutoPerecivel extends Produto {

    private String validade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String validade) {
        super(nome, preco, quantidade);
        this.validade = validade;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}