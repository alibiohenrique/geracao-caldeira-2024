package hora_da_pratica.desafio03;

public class Desafio03 {

    public static void main(String[] args) {

        Carro carro = new Carro(new ModeloCarro("Ford K.A"), 14000, 15000, 15233);
        carro.exibirInformacoes();
        carro.exibirMenorMaior();

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        System.out.println(numerosPrimos.verificarPrimalidade(4));

        GeradorPrimo geradorPrimo = new GeradorPrimo();
        System.out.println(geradorPrimo.gerarProximoPrimo(5));

    }


}

class Carro {

    private double precoAnoUm;
    private double precoAnoDois;
    private double precoAnoTres;
    private ModeloCarro modelo;

    public Carro(ModeloCarro modelo, double precoAnoUm, double precoAnoDois, double precoAnoTres) {
        this.modelo = modelo;
        this.precoAnoUm = precoAnoUm;
        this.precoAnoDois = precoAnoDois;
        this.precoAnoTres = precoAnoTres;
    }

    public Carro(double precoAnoUm, double precoAnoDois, double precoAnoTres) {
        this.precoAnoUm = precoAnoUm;
        this.precoAnoDois = precoAnoDois;
        this.precoAnoTres = precoAnoTres;
    }


    public void setPrecoAnoUm(double precoAnoUm) {
        this.precoAnoUm = precoAnoUm;
    }

    public void setPrecoAnoDois(double precoAnoDois) {
        this.precoAnoDois = precoAnoDois;
    }

    public void setPrecoAnoTres(double precoAnoTres) {
        this.precoAnoTres = precoAnoTres;
    }


    public double calcularPrecos() {
        return precoAnoTres + precoAnoDois + precoAnoUm;
    }

    public void exibirMenorMaior() {
        double menor;
        double maior;
        if (precoAnoTres > precoAnoUm && precoAnoTres > precoAnoDois) {
            maior = precoAnoTres;
            menor = precoAnoDois < precoAnoUm ? precoAnoDois : precoAnoUm;
        } else if (precoAnoDois > precoAnoUm && precoAnoDois > precoAnoTres) {
            maior = precoAnoDois;
            menor = precoAnoTres < precoAnoUm ? precoAnoTres : precoAnoUm;
        } else {
            maior = precoAnoUm;
            menor = precoAnoTres < precoAnoDois ? precoAnoTres : precoAnoDois;

        }
        System.out.println("O maior preco dos três anos é: " + maior + ", e o menor é: " + menor);
    }

    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo.getModelo());
        System.out.println("Preço primeiro ano: " + precoAnoUm);
        System.out.println("Preço segundo ano: " + precoAnoDois);
        System.out.println("Preço terceiro ano: " + precoAnoTres);
        System.out.println("A soma dos três anos é de: " + calcularPrecos());
    }

}

class ModeloCarro {

    private String modelo;

    public ModeloCarro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

class Animal {
    public void emitimSom() {
    }

}

class Cachorro extends Animal {
    @Override
    public void emitimSom() {
        System.out.println("Au! au!");
    }

    public void arranharMoveis() {
        System.out.println("O gato está arranhando móveis");

    }
}

class Gato extends Animal {
    @Override
    public void emitimSom() {
        System.out.println("Miau!");
    }

    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo");
    }
}

class ContaBancaria {

    private double balanco;

    public void depositar(double valor) {
        balanco += valor;
    }

    public void sacar(double valor) {
        balanco -= valor;
    }

    public String consultar() {
        return "O saldo é de: " + balanco;
    }
}

class ContaCorrente extends ContaBancaria {
    private double taxaMensal;

    public void cobrarTarifaMensal() {
        sacar(taxaMensal);
    }
}

class NumerosPrimos {

    public boolean verificarPrimalidade(int num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class VerificadorPrimo extends NumerosPrimos {
    public boolean verificarSeEhPrimo(int num) {
        return verificarPrimalidade(num);
    }
}

class GeradorPrimo extends NumerosPrimos {
    public int gerarProximoPrimo(int num) {
        int proximoNum = num + 1;
        while(!verificarPrimalidade(proximoNum)) {
            proximoNum++;
        }
        return proximoNum;
    }
}