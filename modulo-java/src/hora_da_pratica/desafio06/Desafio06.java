package hora_da_pratica.desafio06;

import java.util.ArrayList;

public class Desafio06 {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Bob Brown", 23);
        Pessoa p2 = new Pessoa("Johny White", 24);
        Pessoa p3 = new Pessoa("Maria Green", 25);

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println(pessoas.size());
        System.out.println(pessoas.get(0));
        System.out.println(pessoas);
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
               "nome='" + nome + '\'' +
               ", idade=" + idade +
               '}';
    }
}

