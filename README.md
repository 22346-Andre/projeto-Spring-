# 📌 Projeto Spring Boot - API de Cadastro de Usuários

## 📝 Descrição

Este projeto é uma API RESTful desenvolvida com **Spring Boot**, que permite realizar operações de cadastro, consulta, atualização e exclusão de usuários. Ele utiliza um banco de dados relacional para persistência dos dados, seguindo boas práticas de desenvolvimento backend.

---

## 🚀 Tecnologias Utilizadas

- ✅ Java 17
- ✅ Spring Boot
- ✅ Spring Data JPA
- ✅ Banco de Dados (MySQL ou PostgreSQL)
- ✅ Maven
- ✅ Postman (para testes)

---

## ⚙️ Funcionalidades

- 🔹 Cadastro de usuários
- 🔹 Listagem de usuários
- 🔹 Atualização dos dados dos usuários
- 🔹 Exclusão de usuários

---

## 📂 Estrutura do Projeto

```bash
projeto-Spring-/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── seuusuario/
│   │   │           └── projetospring/
│   │   │               ├── controller/
│   │   │               ├── model/
│   │   │               ├── repository/
│   │   │               └── service/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── ...
├── pom.xml
└── README.md
🔧 Como Executar o Projeto
📥 Clone o repositório:

    git clone https://github.com/22346-Andre/projeto-Spring-.git
📂 Navegue até o diretório do projeto:

    cd projeto-Spring-
🛠️ Configure o arquivo src/main/resources/application.properties com as credenciais do seu banco de dados.

Exemplo de configuração:

properties
    spring.datasource.url=jdbc:mysql://localhost:3306/seu_banco
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    spring.jpa.hibernate.ddl-auto=update
    spring.jpa.show-sql=true
    server.port=8080
▶️ Execute o projeto com o Maven:

    mvn spring-boot:run
🔗 Endpoints da API 

    GET /usuarios → Listar todos os usuários
    
    GET /usuarios/{id} → Buscar usuário por ID
    
    POST /usuarios → Cadastrar novo usuário
    
    PUT /usuarios/{id} → Atualizar dados do usuário
    
    DELETE /usuarios/{id} → Deletar usuário

🧪 Testes da API
Você pode testar os endpoints utilizando ferramentas como:

   - Postman
   - Insomnia


