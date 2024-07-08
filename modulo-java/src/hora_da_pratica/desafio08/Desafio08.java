package hora_da_pratica.desafio08;

import java.util.ArrayList;

public class Desafio08 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Ana");
        nomes.add("Jose");
        for (String nome : nomes) {
            System.out.println(nome);
        }


        Animal animal = new Cachorro("Marrom", "Terrestre");
        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            cachorro.latir();
        }

        Produto p1 = new Produto("Banana", 5.33);
        Produto p2 = new Produto("Ovo", 12.99);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        int count = 0;
        double precoTotal = 0;

        for (Produto produto : produtos) {
            count++;
            precoTotal += produto.getPreco();
        }
        System.out.println(precoTotal / count);

        Circulo circulo = new Circulo(50);
        Quadrado quadrado = new Quadrado(5, 5);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);

        for (Forma forma : formas) {
            System.out.println(forma.calcularArea());
        }

        ContaBancaria cb1 = new ContaBancaria(253, 1);
        ContaBancaria cb2 = new ContaBancaria(254, 2);
        ContaBancaria cb3 = new ContaBancaria(255, 3);
        ContaBancaria cb4 = new ContaBancaria(250, 4);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(cb1);
        contas.add(cb2);
        contas.add(cb3);
        contas.add(cb4);
        double maiorSaldo = 0;
        ContaBancaria numeroContaMaior = null;

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() >= maiorSaldo) {
                maiorSaldo = conta.getSaldo();
                numeroContaMaior = conta;

            }

        }
        System.out.println(numeroContaMaior.getSaldo());

    }
}

class Animal {
    private String cor;
    private String tipo;

    public Animal(String cor, String tipo) {
        this.cor = cor;
        this.tipo = tipo;
    }
}

class Cachorro extends Animal {
    private String tamanhoPelo;


    public Cachorro(String cor, String tipo) {
        super(cor, tipo);
    }


    public Cachorro(String cor, String tipo, String tamanhoPelo) {
        super(cor, tipo);
        this.tamanhoPelo = tamanhoPelo;
    }

    public void latir() {
        System.out.println("Au! Au!");
    }
}

class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
}

interface Forma {
    double calcularArea();
}

class Circulo implements Forma {
    final double PI = 3.14159265359;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return this.PI * (Math.pow(raio, 2.0));
    }
}

class Quadrado implements Forma {
    private double lado;
    private double altura;


    public Quadrado(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return lado * altura;
    }
}

class ContaBancaria {
    private double saldo;
    private int numeroDaConta;

    public ContaBancaria(double saldo, int numeroDaConta) {
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
}