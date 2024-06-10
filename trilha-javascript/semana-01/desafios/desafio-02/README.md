# Desafios

### 1) Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". Caso contrário, mostre "Boa semana!".
```JS
var whichDay = prompt("Qual é o dia da semana?");
if(whichDay === "Sábado" || whichDay === "Domingo") {
    alert("Bom final de semana")
} else {
    alert("Boa semana!");
}

```
### 2)Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando.
```JS
var num = prompt("Digite um número positivo ou negativo");

if(num >= 0) {
    alert("O número digitado é positivo!");
} else {
    alert("O número digitado é negativo!");

}

```
### 3) Crie um sistema de pontuação para um jogo. Se a pontuação for maior ou igual a 100, mostre "Parabéns, você venceu!". Caso contrário, mostre "Tente novamente para ganhar.".
```JS

var score = prompt("Digite a sua pontuação do jogo");
if(score >= 100) {
    alert("Parabéns, você venceu!")
} else {
    alert("Tente novamente para ganhar")
}
```
### 4) Crie uma mensagem que informa o usuário sobre o saldo da conta, usando uma template string para incluir o valor do saldo.
```JS
var balance = prompt("Digite o seu saldo")
alert("O valor do saldo atual da sua conta é " + ${balance})

```
### 5) Peça ao usuário para inserir seu nome usando prompt. Em seguida, mostre um alerta de boas-vindas usando esse nome.

```JS
var user = prompt("Digite seu nome")
alert("Boas vindas, " + ${user});

```



