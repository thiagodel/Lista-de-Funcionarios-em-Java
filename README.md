# Exercício – Lista de Funcionários em Java

## 📌 Objetivo

Este exercício tem como objetivo praticar conceitos básicos e intermediários da linguagem Java, utilizando Programação Orientada a Objetos e listas para o cadastro e exibição de funcionários.

---

## 🧠 Conteúdos Trabalhados

- Classes e objetos
- Encapsulamento (atributos privados)
- Construtores
- `List` e `ArrayList`
- Métodos estáticos
- Expressões Lambda e Stream
- Sobrescrita de métodos (`@Override`)
- Validação de dados (ID único)

---

## 🗂 Estrutura do Projeto

src/
├── application/
│ └── Program.java
└── entities/
└── Employee.java


---

## 🧑‍💼 Classe `Employee`

A classe `Employee` representa um funcionário e contém:

### Atributos
- `id` – identificador do funcionário
- `nome` – nome do funcionário
- `salario` – salário do funcionário

### Métodos
- Construtor padrão
- Construtor com parâmetros
- Getters e setters
- Método `toString()` sobrescrito para exibição formatada
- Método estático para verificar se um ID já existe na lista

---

## 🔎 Validação de ID

Para evitar IDs duplicados, o programa utiliza um método estático que verifica se o ID informado já está presente na lista de funcionários.

```java
public static boolean hasId(List<Employee> list, int id) {
    return list.stream().anyMatch(x -> x.getId() == id);
}
📤 Exemplo de Saída no Console
List of employees:
333, Maria Brown, 4000.00
536, Alex Grey, 3300.00
772, Bob Green, 5000.00
▶️ Como Executar
Compile o projeto

Execute a classe Program

Informe os dados solicitados no console

O programa exibirá a lista final de funcionários

🎯 Conclusão
Este exercício auxilia no entendimento do uso de listas, métodos e conceitos fundamentais de POO em Java, servindo como base para o desenvolvimento de sistemas maiores no futuro.

✍️ Aluno
Thiago Delmiro
