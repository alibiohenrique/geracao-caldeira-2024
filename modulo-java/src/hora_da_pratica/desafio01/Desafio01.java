package hora_da_pratica.desafio01;

public class Desafio01 {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Joãozin", 13);
        aluno.exibirInformacoes();

    }
}

class Pessoa {

    public void exibirNome() {
        System.out.println("Olá, mundo!");
    }
}

class Calculadora {

    public double dobro(double num) {
        return num * 2;
    }
}

class Musica {

    private String titulo;
    private String artista;
    private String anoDeLancamento;
    private double avaliacao;
    private int numAvaliacoes;

    public void exibirFichaTecnica() {
        String ficha = """
                Música: %s
                Artista: %s
                Ano de Lançamento: %s
                Número de Avaliações: %d
                """.formatted(titulo, artista, anoDeLancamento, numAvaliacoes);

        System.out.println(ficha);

    }

    public void avaliarMusica(double nota) {
        double totalAvaliacao = avaliacao + nota;
        numAvaliacoes++;
    }

    public double calcularMediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }

}

class Carro {

    private int ano;
    private String modelo;
    private String cor;
    private String atributos;

    public void exibirFichaTecnica() {
        String fichaTecnica = """
                Carro:
                Modelo: %s
                Ano: %d
                Cor: %s
                atributos: %s
                """.formatted(ano, modelo, cor, atributos);
    }

    public void calcularIdadeDoCarro(){
        System.out.println("A idade do carro é: " + (2023 - ano));
    }
}

class Aluno{
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome + ", idade: " + idade);
    }
}

