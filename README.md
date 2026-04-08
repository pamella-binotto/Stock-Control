# 📦 Stock API

<p align="center">
  <img src="https://img.shields.io/badge/Status-Em%20Construção-yellow?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge&logo=postgresql" />
  <img src="https://img.shields.io/badge/Docker-Containerized-2496ED?style=for-the-badge&logo=docker" />
</p>

---

> 🚧 **Projeto em Construção**
> Este projeto ainda está em desenvolvimento. Novas funcionalidades, validações, testes e melhorias estão sendo adicionados continuamente.

---

## 📖 Sobre o Projeto

A **Stock API** é uma aplicação backend desenvolvida com **Java + Spring Boot** para gerenciamento de estoque através de uma API REST com operações completas de CRUD.

O projeto foi criado com foco em praticar conceitos reais de desenvolvimento backend, arquitetura em camadas e integração com banco de dados relacional.

---

## ✨ Funcionalidades

* ✅ Criar novos produtos
* ✅ Listar todos os produtos cadastrados
* ✅ Buscar produto por ID
* ✅ Atualizar produto existente
* ✅ Remover produto
* ✅ Persistência com PostgreSQL
* ✅ Banco containerizado com Docker

---

## 🛠️ Tecnologias Utilizadas

| Tecnologia      | Função                        |
| --------------- | ----------------------------- |
| Java 17         | Linguagem principal           |
| Spring Boot     | Framework backend             |
| Spring Data JPA | Persistência de dados         |
| Hibernate       | ORM                           |
| PostgreSQL      | Banco de dados relacional     |
| Docker          | Containerização do banco      |
| Postman         | Testes de endpoints           |
| Maven           | Gerenciamento de dependências |

---

## 📁 Estrutura do Projeto

```text id="0b1a8q"
src/main/java/com/binotto/stock
│
├── controller/      # Endpoints da API REST
├── model/           # Entidades JPA
├── repository/      # Camada de acesso a dados
├── service/         # Regras de negócio
│
└── StockApplication.java
```

---

## 🔗 Endpoints da API

| Método | Endpoint         | Descrição                |
| ------ | ---------------- | ------------------------ |
| GET    | `/products`      | Listar todos os produtos |
| GET    | `/products/{id}` | Buscar produto por ID    |
| POST   | `/products`      | Criar produto            |
| PUT    | `/products/{id}` | Atualizar produto        |
| DELETE | `/products/{id}` | Remover produto          |

---

## 🗄️ Banco de Dados

Este projeto utiliza **PostgreSQL** como banco de dados relacional.

O banco está sendo executado em um **container Docker**, garantindo praticidade no ambiente local e padronização da infraestrutura.

---

## 🧪 Testes da API

Todos os endpoints são testados e validados utilizando **Postman** durante o desenvolvimento.

---

## ▶️ Como Executar o Projeto

### 1. Clonar o Repositório

```bash id="lm7g5w"
git clone https://github.com/seu-usuario/stock-api.git
```

---

### 2. Subir Container PostgreSQL

```bash id="v9s4bq"
docker run --name postgres-db \
-e POSTGRES_PASSWORD=sua_senha \
-p 5432:5432 \
-d postgres
```

---

### 3. Configurar Variáveis de Ambiente

Atualize o arquivo `application.yml` com suas credenciais locais do PostgreSQL.

---

### 4. Executar a Aplicação

```bash id="t2vmbn"
./mvnw spring-boot:run
```

Ou execute diretamente pela IDE.

---

## 🌐 Frontend do Projeto

A interface frontend deste sistema está disponível em:

➡️ **Frontend React: https://github.com/pamella-binotto/Stock-Control-Frontend**

---

## 🚀 Melhorias Futuras

* Validação de dados com Bean Validation
* Tratamento global de exceções
* Testes unitários e de integração
* Autenticação e autorização com JWT
* Documentação automática com Swagger/OpenAPI
* Deploy da aplicação

---

## 👩‍💻 Autora

**Pamella Binotto**
Desenvolvedora Backend / Full Stack em formação 🚀
