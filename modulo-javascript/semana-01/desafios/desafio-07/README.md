# Desafios

### 1)  Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.

```JS

    function calculateBMI(heigth, weight) {
        return weight / Math.pow(heigth,2);
    }

```

### 2)   Crie uma função que calcule o valor do fatorial de um número passado como parâmetro.
```JS
   function factorial(num) {
    var factorial = 1;

        if (num < 0) {
            return 0;
        } else if (num == 1) {
            return factorial;
        }
        else {
            while (num > 1) {
                factorial *= num;
                num--;
            }
        }
        return factorial;
    }
```


### 3)      Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a cotação do dólar igual a R$4,80.

```JS
    function dolarExchange(reais) {
        var dolarCotation = 4.80;
        return reais / dolarCotation;
    }

```


### 4)      Crie uma função que mostre na tela a área e o perímetro de uma sala retangular, utilizando altura e largura que serão dadas como parâmetro.      
```JS
    function calculateRectangleArea(base, height) {
        return base * height;
    }

```

### 5)      Crie uma função que mostre na tela a área e o perímetro de uma sala circular, utilizando seu raio que será fornecido como parâmetro. Considere Pi = 3,14.

```JS
    function calculateCircleArea(radius) {
        return 3.14 * Math.pow(radius, 2);
    }

```

### 6)    Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.

```JS
    function showMultiplicationTable(num){
        var zero = 0;
        while(zero <= 10) {
            var multiplicationTable = document.querySelector('p');
            multiplicationTable.innerHTML(zero + " vezes " + num " é igual a: " + zero * num);

            zero ++;
        }
    }
    

```

