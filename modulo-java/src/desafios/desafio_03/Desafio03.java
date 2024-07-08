package desafios.desafio_03;

// Dicas:
//
//    Para gerar um número aleatório em Java: new Random().nextInt(100);
//    Utilize o Scanner para obter os dados do usuário;
//    Utilize uma variável para contar as tentativas;
//    Utilize um loop para controlar as tentativas;
//    Utilize a instrução break; para interromper o loop.

//  Para aprimorar essas habilidades, propomos atividades práticas (não obrigatórias). Vamos lá?
//
//    Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
//    Peça ao usuário para inserir dois números inteiros.
//      Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
//    Crie um menu que oferece duas opções ao usuário:
//      "1. Calcular área do quadrado" e
//      "2. Calcular área do círculo".
//          Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
//    Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
//    Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
//    Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

import java.util.Scanner;

public class Desafio03 {

    public int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }

    public void guessGame() {
        Scanner sc = new Scanner(System.in);
        int generatedNumber = generateRandomNumber();
        int counter = 0;

        System.out.println("-".repeat(30));
        System.out.println("JOGO DO NÚMERO ALEATÓRIO");
        System.out.println("-".repeat(30));
        System.out.println("Digite  o número aleatório: ");
        int userGuess = sc.nextInt();
        sc.nextLine();

        while (userGuess != generatedNumber) {
            userGuess = sc.nextInt();
            if (userGuess < generatedNumber) {
                System.out.println("O número gerado é maior");
                counter++;
            } else {
                System.out.println("O número gerado é menor");
                counter++;
            }
        }
        System.out.println("Você venceu com " + counter + " tentativas");

        sc.close();


    }

    public void isPositiveOrNegative(int number) {
        if (number < 0) {
            System.out.println("Negativo!");
        } else {
            System.out.println("Positivo! ");
        }
    }

    public void twoNumComparator(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("São iguais");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else {
            System.out.println("O segundo número é maior que o segundo");
        }
    }

    public void squareOrCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("#".repeat(30));
        System.out.println("CALCULO DE QUADRADO OU CIRCULO");
        System.out.print("1. Calcular área do quadrado: ");
        System.out.print("2. Calcular área do círculo: ");
        System.out.println("#".repeat(30));

        int option = sc.nextInt();
        if (option == 1) {
            System.out.print("Digite a altura do quadrado: ");
            double height = sc.nextDouble();
            System.out.print("Digite a base do quadrado: ");
            double base = sc.nextDouble();

            System.out.println("O retorno de " + height + " + " + base + " é igual á" + base * height);

        } else {
            System.out.print("Digite o raio do círculo: ");
            double radius = sc.nextDouble();
            double area = 3.14 * (radius * radius);
            System.out.println("A área do círculo, com o raio " + radius + " é igual a" + area);
        }
        sc.close();
    }

    public void multiplicationTable() {
        Scanner sc = new Scanner(System.in);

        System.out.println("#".repeat(30));
        System.out.println("SISTEMA DA TABUADA");
        System.out.println("#".repeat(30));
        System.out.print("DIGITE UM NÚMERO: ");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + " x " + number + " = " + i * number);
        }

        sc.close();
    }

    public void isOddOrEven() {
        Scanner sc = new Scanner(System.in);

        System.out.println("#".repeat(30));
        System.out.println("JOGO DO É PAR OU IMPAR? ");
        System.out.println("#".repeat(30));
        System.out.print("DIGITE UM NÚMERO: ");

    }
}
