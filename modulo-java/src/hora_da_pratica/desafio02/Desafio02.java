package hora_da_pratica.desafio02;

public class Desafio02 {
}

class ContaBancaria {
    private String numeroDaConta;
    private double saldo;
    public String titular;

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumerodaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}

class Pessoa {

    private String nome;
    private int idade;

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

    public void verificarIdade(int idade) {
        String verificarIdade = idade >= 18 ? "Você é maior de idade" : "Você é menor de idade";
        System.out.println(verificarIdade);
    }
}

class Produto {
    private String nome;
    private double preco;

    public void aplicarDesconto(int valor) {
        System.out.println("Desconto: " + preco * valor);
    }
}

class Aluno {

    private String nome;
    private int nota1;
    private int nota2;
    private int nota3;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public double calcularNotas() {
        return (double) (nota1 + nota2 + nota3) / 3;
    }
}

class Livro {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        String detalhes = """
                Livro -, titulo: %s, autor: %s
                """.formatted(titulo,autor);
    }
}