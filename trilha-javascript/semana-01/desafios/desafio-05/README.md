# Desafios

### 1) Altere o conteúdo da tag h1 com document.querySelector e atribua o seguinte texto: Hora do Desafio.

```JS
let titulo = document.querySelector("h1");
titulo.innerHTML = "Hora do desafio";
```

### 2) Crie uma função que exiba no console a mensagem O botão foi clicado sempre que o botão Console for pressionado.

```html
<button onclick = "isButtonPressed()" class="button"> Desafio 2 </button>
```

```JS
function isButtonPressed() {
    alert("O botão foi criado!");
}
```


### 3) Crie uma função que exiba um alerta com a mensagem: Eu amo JS, sempre que o botão Alerta for pressionado.

```html
<button onclick = "showLoveJS()" class="button"> Desafio 3 </button>


```

```JS
function showLoveJS() {
    alert("Eu amo JS");
}
```


### 4) Crie uma função que é executada quando o botão prompt é clicado, perguntando o nome de uma cidade do Brasil. Em seguida, exiba um alerta com a mensagem concatenando a resposta com o texto: Estive em {cidade} e lembrei de você.

```html
<button onclick = "showPrompt()" class="button"> Desafio 1</button>
```

```JS
function showPrompt() {
    let city = prompt("Digite o nome de uma cidade no Brasil");
    alert(`Estive em ${city} e lembrei de você`);
}
```

### 5) Ao clicar no botão soma, peça 2 números inteiros e exiba o resultado da soma em um alerta.


```html
<button onclick = "sum()" class="button"> Desafio 1</button>
```

```JS
function sum() {

    let firNum = prompt("Digite um número ");
    let secNum = prompt("Digite o segundo número ");
    let sum = firNum + secNum; 

    alert(`Resultado de ${firNum} e ${secNum} é igual a: ${sum}`);
}
```



