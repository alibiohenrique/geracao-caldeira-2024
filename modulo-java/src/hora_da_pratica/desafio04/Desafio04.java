package hora_da_pratica.desafio04;

public class Desafio04 {

    public static void main(String[] args) {

        CalculadorSalaRetangular calculadorSalaRetangular = new CalculadorSalaRetangular(50, 30);
        System.out.println(calculadorSalaRetangular.calcularArea());
        System.out.println(calculadorSalaRetangular.calcularPerimetro());

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao(5);
        tabuadaMultiplicacao.mostrarTabuada(tabuadaMultiplicacao.getNumber());

        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao(37.5);
        System.out.println(conversorTemperaturaPadrao.celsiusParaFahrenheit(conversorTemperaturaPadrao.getDegrees()));
        System.out.println(conversorTemperaturaPadrao.fahrenheitParaCelsius(conversorTemperaturaPadrao.getDegrees()));

        Produto produto = new Produto(5);
        System.out.println(produto.calcularPrecoTotal(10));
    }


}


class ConversorMoeda implements ConversaoFinanceira {

    private double cotacao;
    private double valor;

    public ConversorMoeda(double valor, double cotacao) {
        this.cotacao = cotacao;
        this.valor = valor;
    }

    @Override
    public double converterDolarParaReal() {
        return cotacao * valor;
    }
}

interface ConversaoFinanceira {
    double converterDolarParaReal();
}

class CalculadorSalaRetangular implements CalculoGeometrico {

    private double altura;
    private double largura;

    public CalculadorSalaRetangular(double largura, double altura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

    @Override
    public double calcularPerimetro() {
        return (altura + largura) * 2;
    }
}

interface CalculoGeometrico {

    double calcularArea();

    double calcularPerimetro();
}

interface Tabuada {
    void mostrarTabuada(int number);

}

class TabuadaMultiplicacao implements Tabuada {
    private int number;

    public int getNumber() {
        return number;
    }

    public TabuadaMultiplicacao(int number) {
        this.number = number;
    }

    @Override
    public void mostrarTabuada(int number) {

        System.out.println("#".repeat(30));
        System.out.println("TABUADA DO " + number);
        System.out.println("#".repeat(30));

        for (int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println("#".repeat(30));

    }
}

interface ConversorTemperatura {
    double celsiusParaFahrenheit(double celsius);

    double fahrenheitParaCelsius(double fahrenheit);
}

class ConversorTemperaturaPadrao implements ConversorTemperatura {
    private double degrees;

    public ConversorTemperaturaPadrao(double degrees) {
        this.degrees = degrees;
    }

    public double getDegrees() {
        return degrees;
    }

    @Override
    public double fahrenheitParaCelsius(double fahrenheit) {

        return ((fahrenheit - 32) * 5 / 9);

    }

    @Override
    public double celsiusParaFahrenheit(double celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}

interface Calculavel {

    double calcularPrecoFinal();
}

class Livro implements Calculavel {
    private double preco;
    private double desconto;
    private String titulo;


    @Override
    public double calcularPrecoFinal() {
        return preco * desconto;
    }
}

class ProdutoFisico implements Calculavel {
    private String nome;
    private double preco;
    private double taxaAdicional;

    @Override
    public double calcularPrecoFinal() {
        return taxaAdicional * preco;
    }

}

interface Vendavel {

    double calcularPrecoTotal(int quantidade);
}

class Produto implements Vendavel {

    private double precoProduto;

    Produto (double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        precoProduto *= quantidade;
        return quantidade >= 10 ? precoProduto * 0.85 : precoProduto;
    }
}
class Servico implements Vendavel {

    private double precoServico;

    Servico (double precoServico) {
        this.precoServico= precoServico;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        precoServico *= quantidade;
        return quantidade >= 5 ? precoServico * 0.9 : precoServico;
    }
}
