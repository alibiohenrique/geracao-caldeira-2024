package hora_da_pratica.desafio10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] args) {
        MenuCompras menuCompras = new MenuCompras();
        menuCompras.mostrarMenu();
    }
}

interface Menu {
    void mostrarMenu();

    void menuSecundario();
}

class CartaoDeCredito {
    List<Compra> compras;
    private double limiteCartao;
    private double saldo;

    public CartaoDeCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
        saldo = this.limiteCartao;
        compras = new ArrayList<>();
    }

    public void diminuirSaldo(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public double definirLimite(double limiteCartao) {
        saldo = limiteCartao;
        return this.limiteCartao = limiteCartao;

    }

    public void adicionarCompra(Compra compra) {
        compras.add(compra);
        System.out.println("Compra realizada!");
    }

    @Override
    public String toString() {
        return "Cartão de Credito: " + "compras=" + compras + ", limite de cartão=" + limiteCartao + ", saldo=" + saldo + '}';
    }
}

class Compra implements Comparable<Compra> {

    private String descricao;
    private double valor;

    public Compra(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(outraCompra.valor);
    }


    @Override
    public String toString() {
        return "Compra: {" + "descricao='" + descricao + '\'' + ", valor=" + valor + '}';
    }
}

class MenuCompras implements Menu {
    private Scanner sc = new Scanner(System.in);
    private CartaoDeCredito cartaoCredito = new CartaoDeCredito(0);
    private int opcao;
    private Compra compra;

    @Override
    public void mostrarMenu() {

        System.out.println("#".repeat(50));
        System.out.println("Menu Compras no Cartão de Crédito");
        System.out.println("#".repeat(50));
        System.out.print("Digite o limite do cartão: ");

//        cartaoCredito = new CartaoCredito(cartaoCredito.definirLimite(sc.nextDouble()));
        cartaoCredito.definirLimite(sc.nextDouble());

        menuSecundario();
        System.out.println();
        while (opcao != 0) {
            switch (opcao) {
                case 1 -> menuSecundario();
                case 2 -> listarCompras();
                default -> {
                    System.out.println("Tente novamente!");
                    mostrarOpcao();
                }
            }
        }

        System.out.println(cartaoCredito);
    }

    public void realizarCompra(double valor, String descricao) {

        compra = new Compra(descricao, valor);
        if (cartaoCredito.getLimiteCartao() < valor || cartaoCredito.getSaldo() < valor) {
            System.out.println("Saldo insuficiente!");
            System.out.println("Seu saldo: " + cartaoCredito.getSaldo());
            System.out.println("Sua compra: " + valor);
        } else {
            cartaoCredito.adicionarCompra(compra);
            cartaoCredito.diminuirSaldo(valor);

        }

        classificarComprasPorValor();

    }

    public void mostrarOpcao() {
        System.out.println();
        System.out.print("Digite 0 para sair, 1 para continuar, ou 2 para listar compras e mostrar saldo atual: ");
        opcao = sc.nextInt();
    }

    public void classificarComprasPorValor() {
        Collections.sort(cartaoCredito.getCompras());
    }

    public void listarCompras() {
        System.out.println();
        for (Compra compra : cartaoCredito.getCompras()) {
            System.out.println(compra.toString());
        }
        System.out.println("Seu saldo atual: " + cartaoCredito.getSaldo());
        mostrarOpcao();

    }

    @Override
    public void menuSecundario() {
        sc.nextLine();
        System.out.print("Digite a descrição da compra: ");
        String descricao = sc.nextLine();
        System.out.print("Digite o valor da compra: ");
        double valor = sc.nextDouble();
        realizarCompra(valor, descricao);
        mostrarOpcao();

    }
}
