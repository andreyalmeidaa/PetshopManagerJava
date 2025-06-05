# Sistema de Gerenciamento de Petshop em Java

![Java Logo](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/Visual_Studio_Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white)

## 🐾 Sobre o Projeto

Este projeto é um sistema de gerenciamento simples para um petshop, desenvolvido em Java. Ele foi criado com o objetivo de modelar entidades como animais e serviços, demonstrando os princípios fundamentais da Programação Orientada a Objetos (POO), como herança, polimorfismo e o uso dos métodos da classe `Object` (como `toString()`, `equals()` e `hashCode()`).

O sistema permite criar diferentes tipos de animais, registrar serviços e calcular seus preços com base nas características do animal, além de comparar objetos para verificar a igualdade e a unicidade.

## ✨ Funcionalidades 

O sistema implementa as seguintes funcionalidades, conforme os requisitos do projeto:

* **Classe Abstrata `Animal`**: Define atributos comuns a todos os animais (nome, raça/tipo, idade, proprietário)  e implementa `toString()`, `equals()` e `hashCode()` para representação e comparação de objetos.
* **Subclasses de `Animal`**:
    * `Cachorro`: Herda de `Animal`  e adiciona o atributo `porte`.
    * `Gato`: Herda de `Animal`  e adiciona o atributo `corOlhos`.
    * `OutroAnimal`: Herda de `Animal`  e adiciona o atributo `tipoEspecifico`.
    * Todas as subclasses implementam `toString()`, `equals()` e `hashCode()` considerando seus atributos específicos.
* **Classe Abstrata `Servico`**: Define atributos comuns a todos os serviços (nome, preço base)  e declara um método abstrato `calcularPreco(Animal animal)` que varia conforme o tipo de animal. Também implementa `toString()`.
* **Subclasses de `Servico`**:
    * `Banho`: Herda de `Servico`  e implementa `calcularPreco()` com base no porte do `Cachorro`.
    * `Tosa`: Herda de `Servico`  e implementa `calcularPreco()` com base na raça do `Cachorro` ou um acréscimo para `Gato`.
    * `ConsultaVeterinaria`: Herda de `Servico`  e implementa `calcularPreco()` com base na idade do animal (ex: acréscimo para filhotes/idosos).
    * Todas as subclasses implementam `toString()`, `equals()` e `hashCode()`.
* **Classe `App` (Gerenciador Principal)**: Contém o método `main()` para executar o sistema[cite: 13]. Demonstra a criação de instâncias de diferentes tipos de animais e serviços [cite: 14], a exibição de serviços e seus preços utilizando `calcularPreco()` [cite: 15], e o uso de `equals()` e `hashCode()` para comparar objetos.
* **Conceitos de POO**: O sistema demonstra os conceitos de herança, polimorfismo e os métodos da classe `Object` (`toString()`, `equals()` e `hashCode()`).

## 🚀 Como Compilar e Executar

Siga os passos abaixo para compilar e rodar o projeto em seu ambiente:

1.  **Navegue até a pasta raiz do projeto:**
    Abra seu terminal ou prompt de comando e entre na pasta `PETSHOP_`:
    ```bash
    cd PETSHOP_
    ```

2.  **Compilar o Código Fonte:**
    Utilize o comando `javac` para compilar todas as classes do projeto. Certifique-se de estar na pasta `PETSHOP_`.
    ```bash
    javac src/modelo/*.java src/servico/*.java src/App.java
    ```
    *Isso criará os arquivos `.class` nas suas respectivas subpastas dentro de `src`.*

3.  **Executar o Sistema:**
    Após a compilação bem-sucedida, execute a classe principal `App` (que contém o método `main()`) utilizando o comando `java`. O `-cp src` é crucial para que o Java encontre suas classes nos pacotes `modelo` e `servico`.
    ```bash
    java -cp src App
    ```

    Você verá a saída do programa no terminal, demonstrando as funcionalidades.

## 🤝 Autor

Desenvolvido como projeto universitário por: Andrey Cavalcante
