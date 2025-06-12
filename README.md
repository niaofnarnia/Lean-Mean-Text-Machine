# Mi Primer Proyecto Spring Boot 💻🚀

Welcome to **Lean Mean Text Machine**! This RESTful service lets you create, read, update, and delete inspirational, funny, or Lorem Ipsum-style phrases — a simple CRUD app.

---

## 🧠 Objectives

- Learn how to build a Spring Boot API following the MVC architecture (3-layered design).
- Practice using a client-server architecture with RESTful endpoints.
- Store and manipulate data using a MySQL database.

---

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 3.5.0**
- **MySQL**
- **Maven**
- **Postman** for testing
- **IntelliJ IDEA** for development

---

## 📁 Project Structure

com.FemCoders.Lean.Mean.Text.Machine

├── Controller → REST API endpoints

├── Model → Phrase entity

├── Repository → JPA repository interface

├── service → Business logic

│ ├── PhraseService

│ └── PhraseServiceImpl

├── LeanMeanTextMachineApplication.java

└── resources

└── application.properties


---

## 📦 Features (CRUD for Phrases)

| Method | Endpoint            | Description              |
|--------|---------------------|--------------------------|
| GET    | `/api/phrases`      | Get all phrases          |
| GET    | `/api/phrases/{id}` | Get phrase by ID         |
| POST   | `/api/phrases`      | Add a new phrase         |
| PUT    | `/api/phrases/{id}` | Update an existing phrase|
| DELETE | `/api/phrases/{id}` | Delete a phrase by ID    |

Each phrase includes:
- `text`: The phrase content
- `author`: Who said it

---

## ⚙️ How to Run This Project

1. **Clone the repository**:
   ```bash
   git clone https://github.com/niaofnarnia/Lean-Mean-Text-Machine.git
   
Set up your MySQL database:

Open MySQL Workbench and run:

    CREATE DATABASE phrase_machine;

Update application.properties (already configured for local dev):

    spring.datasource.url=jdbc:mysql://localhost:3306/phrase_machine?useSSL=false&serverTimezone=UTC
    spring.datasource.username=your username
    spring.datasource.password=your password

Build and run the app:

In IntelliJ, press the green play button on LeanMeanTextMachineApplication.java

Or run:

    ./mvnw spring-boot:run

Test the API with Postman or any REST client.

📌 Features

✅ Functional:

Create, view, update, and delete phrases.

View phrase by ID.

List all phrases.

✅ Non-Functional:
Spring Boot for API backend.

MySQL as the database.

3-layered MVC architecture.

📬 Example JSON for POST/PUT

    {
    "text": "Stay hungry, stay foolish.",
    "author": "Steve Jobs"
    }



🧑‍💻 Author
Project by [@niaofnarnia](https://github.com/niaofnarnia) — developed as part of the FemCoders Bootcamp.