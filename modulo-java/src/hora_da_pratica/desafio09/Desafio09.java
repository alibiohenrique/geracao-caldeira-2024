package hora_da_pratica.desafio09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Desafio09 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        Collections.sort(list);
        System.out.println(list.toString());


        Titulo t1 = new Titulo("B");
        Titulo t2 = new Titulo("C");
        Titulo t3 = new Titulo("A");
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(t1);
        titulos.add(t2);
        titulos.add(t3);
        Collections.sort(titulos);
        System.out.println(titulos);

        List<Titulo> titulos1 = new ArrayList<>();
        titulos1.add(t1);
        titulos1.add(t2);
        titulos1 = new LinkedList<>();
        titulos1.add(t3);

    }

}

class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo titulo) {
        return this.getNome().compareTo(titulo.getNome());

    }

    @Override
    public String toString() {
        return "Titulo{" +
               "nome='" + nome + '\'' +
               '}';
    }
}
