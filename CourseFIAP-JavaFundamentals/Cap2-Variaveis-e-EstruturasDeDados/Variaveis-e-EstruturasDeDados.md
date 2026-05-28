# ☕ Java Fundamentos — Capítulo 2: IDEs, Variáveis e Hello World

Este capítulo apresenta os primeiros passos práticos no Java, utilizando a IDE Eclipse, além dos conceitos básicos de variáveis, operadores, estruturas condicionais e entrada de dados.

## IDEs e Eclipse

Uma IDE (Integrated Development Environment) é um ambiente que auxilia no desenvolvimento de software, oferecendo recursos como:
- Editor de código
- Compilador
- Depuração (debug)
- Organização de projetos
- Testes e refatoração

Durante o curso foi utilizada a IDE **Eclipse**, bastante popular no desenvolvimento Java.

### Estrutura básica no Eclipse

- **Workspace:** diretório de trabalho
- **Projeto:** conjunto de arquivos do sistema
- **Pacotes:** organização das classes
- **Classes:** arquivos `.java`

## Primeiro Programa em Java

O ponto de entrada de um programa Java é o método `main`.

### Exemplo:
```java
public class OlaMundo {

    public static void main(String[] args) {
        System.out.println("Olá Mundo");
    }

}
```

### Comandos importantes:
- `System.out.println()` → imprime com quebra de linha
- `System.out.print()` → imprime sem quebrar linha

## Variáveis e Tipos Primitivos

Java é uma linguagem fortemente tipada, então toda variável precisa ter um tipo definido.

### Exemplos:
```java
int idade = 18;
double preco = 10.5;
char sexo = 'M';
boolean ativo = true;
```

### Principais tipos:
- `int` → números inteiros
- `double` → números decimais
- `char` → caracteres
- `boolean` → verdadeiro ou falso

## Conversão de Tipos (Cast)

Às vezes é necessário converter um tipo em outro.

### Exemplo:
```java
double x = 10.5;
int y = (int) x;
```

Nesse caso ocorre perda da parte decimal.