package desafios.desafio_02;

// Essas habilidades formam a base para o desenvolvimento eficaz de programas em Java, por isso criamos atividades práticas (não obrigatórias) para você praticar.
//  Vamos praticar?
//
//    Crie um programa que realize a média de duas notas decimais e exiba o resultado.
//    Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
//    Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
//    Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
//      Calcule o valor total multiplicando o preço do
//      produto pela quantidade e apresente o resultado em uma mensagem.
//    Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
//      Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
//    Declare uma variável do tipo double precoOriginal.
//      Atribua um valor em reais a essa variável, representando o preço original de um produto.
//      Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto
//      (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

public class Desafio02 {

    public double avg(double num1, double num2) {
        return (num1 + num2) /2;
    }
    public int returnIntSumFromADouble(double num1, int num2) {
        return (int) num1 + num2;
    }

    public String concatCharAndString(String word, char letter) {
        return word + letter;
    }

    public double multiplyProductPrice(double productPrice, int quantity) {
        System.out.println("Preço: " + productPrice + "vezes: " +quantity+ " é igual a" + productPrice * quantity);
        return productPrice * quantity;
    }

    public void convertDollarToReal(double quantity) {
        double cotation = 4.94;
        System.out.println("Sua conversão para real, de " + quantity + ", na cotação " + cotation + " é igual a" + quantity * cotation);
    }


    public void calculateDiscount(double originalPrice, double discountPercentage) {
        System.out.println("O preço original do produto é: " + originalPrice + ", e o desconto foi de: " + discountPercentage + "." +
                "\nTotal é de: " + originalPrice * discountPercentage);
    }





}
