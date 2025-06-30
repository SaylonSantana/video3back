
# 🍔 Cardápio Digital API - Backend

Bem-vindo ao **backend** do projeto **Cardápio Digital**, construído com **Spring Boot** e **Java 21**.  
Essa API RESTful permite **cadastrar**, **listar** e **remover pratos** de um cardápio online. Ideal para quem está estudando desenvolvimento Java ou quer integrar com um frontend React!

---

## 🛠️ Tecnologias & Ferramentas

- ☕ Java 21
- 🖥️ Eclipse IDE
- 📬 Postman
- 🌱 Spring Boot
- 📦 Maven
- 🧰 Lombok
- 🐬 MySQL

---

## 📌 Dependências do Projeto (Maven)

- 🌐 Spring Web
- 🗄️ Spring Data JPA
- 🧱 Lombok
- 🐬 MySQL Driver
- 🔄 Spring Boot DevTools

---

## 🚀 Como Rodar Localmente

### ✅ Pré-requisitos:

- Java 21 instalado
- Eclipse (ou sua IDE favorita)
- Lombok configurado na IDE
- MySQL rodando
- Postman (para testar os endpoints)

---

### ▶️ Passo a passo:

1. **Clone o repositório:**

\`\`\`bash
git clone https://github.com/SaylonSantana/video3back.git
cd video3back
\`\`\`

2. **Crie o banco de dados no MySQL:**

\`\`\`sql
CREATE DATABASE Food;
\`\`\`

⚠️ **Atenção:**  
O arquivo \`application.properties\` está configurado para usuário **root sem senha**.  
Se o seu MySQL for diferente, altere as configurações no arquivo:

\`\`\`properties
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
\`\`\`

---

3. **Abra o projeto na IDE:**

- Aguarde o Maven baixar as dependências.
- Rode a classe principal:

\`\`\`java
CardapioApplication.java
\`\`\`

4. **API estará disponível em:**

👉 [http://localhost:8080/food](http://localhost:8080/food)

---

## 📂 Estrutura de Pastas (src/main/java):

\`\`\`
src/
├── main/
│   ├── java/
│   │   └── com/example/cardapio/
│   │       ├── controller/
│   │       │   └── FoodController.java
│   │       ├── dto/
│   │       │   ├── FoodRequestDTO.java
│   │       │   └── FoodResponseDTO.java
│   │       ├── entity/
│   │       │   └── Food.java
│   │       └── repository/
│   │           └── FoodRepository.java
│   └── resources/
│       └── application.properties
└── test/
\`\`\`

---

## 🧪 Exemplos de Testes (Postman)

### 📍 Listar todos os pratos (GET):

\`\`\`bash
GET http://localhost:8080/food
\`\`\`

**Exemplo de resposta:**

\`\`\`json
[
  {
    "title": "cachaca",
    "image": "https://imagem.com/lasanha.jpg",
    "price": 2.0
  }
]
\`\`\`

---

### ➕ Cadastrar novo prato (POST):

\`\`\`bash
POST http://localhost:8080/food
\`\`\`

**Body (JSON):**

\`\`\`json
{
  "title": "agua",
  "image": "https://imagem.com/pizza.jpg",
  "price": 1.0
}
\`\`\`

**Resposta:**  
\`201 Created\`

---

### ❌ Deletar prato (DELETE):

\`\`\`bash
DELETE http://localhost:8080/food/{id}
\`\`\`

**Exemplo:**

\`\`\`bash
DELETE http://localhost:8080/food/1
\`\`\`

---

## 📚 Referências

- Projeto baseado em práticas modernas de desenvolvimento com **Spring Boot**
- Ideal para estudos, projetos de portfólio e integração com frontend React.

🎥 **Vídeo base:**  
[Como criar uma aplicação Fullstack com Java e React – Fernanda Kipper](https://www.youtube.com/)

---

## 👤 Criador
Saylon Santana  
