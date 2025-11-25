# 🎵 Atividade E2 - CRUD com JavaFX e MySQL

<div align="center">
    <img src="https://img.shields.io/badge/Java-21-orange" alt="Java 21">
    <img src="https://img.shields.io/badge/JavaFX-21-blue" alt="JavaFX">
    <img src="https://img.shields.io/badge/MySQL-8.0-lightgrey" alt="MySQL">
    <img src="https://img.shields.io/badge/Maven-Build-C71A36" alt="Maven">
</div>

## 📄 Sobre o Projeto
Esta atividade é a evolução da **E1**. O objetivo foi transformar a modelagem orientada a objetos (baseada na música *Bohemian Rhapsody*) em um sistema funcional com persistência de dados real.

Abandonamos o arquivo CSV e a interface simples para adotar um **Banco de Dados Relacional (MySQL)** e uma interface gráfica moderna e estilizada com **JavaFX** e **CSS**.

## 🚀 Funcionalidades
- **CRUD Completo:** Criar, Ler, Atualizar e Deletar registros.
- **Interface Gráfica (GUI):** Telas interativas com abas para separar os contextos.
- **Estilização:** Tema *Modern Dark* (inspirado em IDEs modernas) aplicado via CSS.
- **Polimorfismo:** Botão de "Executar Ação" que resgata os métodos originais da E1 (`cantar()`, `tocar()`, `cometer()`).
- **Arquitetura:** Uso do padrão **MVC** (Model-View-Controller) e **DAO** (Data Access Object).

## 🗂 Estrutura das Tabelas (Modelagem)
O sistema gerencia três entidades principais:
1.  **Músicos (PessoaMusica):** Nome, Sentimento, Papel (ex: Vocalista).
2.  **Instrumentos:** Tipo, Marca, Preço.
3.  **Crimes (Narrativa):** Tipo, Local, Pena (anos).

## 🛠️ Como Rodar o Projeto

### Pré-requisitos
* JDK 21 instalado.
* Maven instalado.
* MySQL (XAMPP ou serviço dedicado).

### 1. Configurar o Banco de Dados
Execute o script abaixo no seu cliente MySQL (DBeaver, Workbench ou phpMyAdmin) para criar o banco e as tabelas:

```sql
CREATE DATABASE IF NOT EXISTS atividade_e2;
USE atividade_e2;

CREATE TABLE IF NOT EXISTS pessoa_musica (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sentimento VARCHAR(50),
    papel VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS instrumento_musical (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    marca VARCHAR(50),
    preco DECIMAL(10, 2)
);

CREATE TABLE IF NOT EXISTS crime (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    local_crime VARCHAR(100),
    pena_anos INT
);
```

### 2. Configurar a Conexão
Verifique o arquivo src/main/java/com/atividade/e2/dao/ConexaoDB.java. Certifique-se de que a senha do banco (PASSWORD) corresponde à sua configuração local (Padrão: "" ou "123456").

### 3. Executar
Abra o projeto no IntelliJ IDEA (ou sua IDE de preferência), aguarde o Maven baixar as dependências e execute a classe Main.java
