package desafios.desafio_01;


//  Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".
//  Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".
//  Crie uma classe chamada Estudos para imprimir anotações de estudos no console.
//  Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
//      Crie uma classe Subtração para imprimir o resultado de 10 - 5 no console.

//  Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
//      Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
//  Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
//  Depois de finalizar, testar e conferir que seu programa foi executado com sucesso, crie uma variável inteira para exibir a temperatura em Fahrenheit sem casas decimais.
//  Lembre-se que provavelmente você precisará fazer um casting de valores.

public class Perfil {
    public static void main(String[] args) {
        System.out.println("Olá, Alibio");
        System.out.println("Tudo bem?");
        System.out.println("Estou estudando programação Java, no Instítuto Caldeira");

    }
}

class Soma {
    public static void main(String[] args) {
        System.out.println(10 + 5);
    }
}

class Subtracao {
    public static void main(String[] args) {
        System.out.println(10 - 5);
    }
}

class TemperatureConverter {

    public static void main(String[] args) {

        double temperature = 31;
        double convertCelciusToFahrenheint = (temperature * 1.8) + 32;

        int showTemperature = (int) convertCelciusToFahrenheint;
        System.out.println(showTemperature);

    }
}