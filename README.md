# Sistema de Cadastro Escolar

Este é um projeto Java que permite cadastrar Turmas, Professores, Alunos e Cursos. Os dados são inseridos pelo usuário através do console usando a classe `Scanner`.

## Funcionalidades

- Cadastro de Turmas
- Cadastro de Professores
- Cadastro de Alunos
- Cadastro de Cursos
- Possibilidade de obter dados a partir de um arquivo XML

## Requisitos

- Java 8 ou superior



Entendi, aqui está o conteúdo completo do arquivo README.md em um único bloco de texto:

markdown
Copy code
# Cadastro de Profissionais

Este projeto é um sistema simples para cadastro de profissionais utilizando Java, Scanner para entrada de dados e PostgreSQL via JDBC para armazenamento.

## Estrutura da Classe Profissional

A classe `Profissional` contém os seguintes atributos:

```java
private Integer id;
private String nome;
private String email;
private String telefone;
private String especializacao;


Estrutura da Tabela no Banco de Dados
A tabela profissional é definida da seguinte maneira:

CREATE TABLE profissional (
    id              INTEGER         PRIMARY KEY,
    nome            VARCHAR(100)    NOT NULL,
    email           VARCHAR(50)     NOT NULL,
    telefone        VARCHAR(50)     NOT NULL,
    especializacao  VARCHAR(100)    NOT NULL
);

Requisitos
Java JDK 8 ou superior

PostgreSQL
Driver JDBC do PostgreSQL
Configuração do Banco de Dados
Instale o PostgreSQL.
Crie um banco de dados e a tabela profissional usando a declaração SQL fornecida.

