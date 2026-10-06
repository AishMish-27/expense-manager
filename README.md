# Smart Expense & Budget Management System

<p align="center">
  <b>A backend-focused expense and budget management application built with Java and Spring Boot.</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot" />
  <img src="https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge&logo=postgresql" />
  <img src="https://img.shields.io/badge/JPA-Hibernate-red?style=for-the-badge" />
</p>

---

## About The Project

**Smart Expense & Budget Management System** is a RESTful backend application designed to help users manage their expenses, set budgets, and understand their spending patterns.

The project focuses on building a structured and scalable backend using **Spring Boot, JPA, and PostgreSQL**.

---

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Programming Language |
| Spring Boot | Backend Framework |
| Spring Data JPA | Database Operations |
| Hibernate | ORM |
| PostgreSQL | Database |
| Spring Security | Authentication & Authorization |
| JWT | Token-Based Authentication |
| Maven | Dependency Management |
| Docker | Containerization |

---

## Features

- User registration and authentication
- JWT-based authentication
- Expense management
- Budget management
- Spending analytics
- Monthly expense reports
- Input validation
- Exception handling
- RESTful APIs
- Dockerized application

---

## Architecture

```text
Client
   |
   v
Controller
   |
   v
Service
   |
   v
Repository
   |
   v
PostgreSQL
```

The application follows a layered architecture:

- **Controller** → Handles HTTP requests
- **Service** → Contains business logic
- **Repository** → Handles database operations
- **Entity** → Represents database tables

---

## Project Structure

```text
src/main/java/com/expensemanager/expense_manager
│
├── Controller
├── Service
├── Repository
└── Entity
```

---

## Database Design

Main entities:

```text
User
 │
 └──< Expense

User
 │
 └──< Budget
```

PostgreSQL is used for persistent data storage, with Hibernate/JPA handling entity relationships and database operations.

---

## Development Progress

### Completed

- [x] Spring Boot project setup
- [x] PostgreSQL configuration
- [x] Database design
- [x] User Entity
- [x] Expense Entity
- [x] Expense Repository
- [x] Expense Service

### In Progress / Upcoming

- [ ] Expense REST Controller
- [ ] DTOs
- [ ] Validation
- [ ] Exception Handling
- [ ] User Registration
- [ ] Spring Security
- [ ] JWT Authentication
- [ ] Budget Management
- [ ] Spending Analytics
- [ ] Monthly Reports
- [ ] Docker
- [ ] Deployment

---

## Getting Started

### Prerequisites

- Java 17+
- PostgreSQL
- Maven
- Git

### Clone Repository

```bash
git clone <your-repository-url>
cd expense-manager
```

### Configure Database

Create a PostgreSQL database and configure the application using environment variables.

```text
DB_URL
DB_USERNAME
DB_PASSWORD
```

### Run Application

```bash
mvn spring-boot:run
```

The application will start on:

```text
http://localhost:8080
```

---

## Future Improvements

- Advanced spending analytics
- Automated monthly reports
- Budget alerts
- Docker deployment
- Cloud deployment
- API documentation with Swagger/OpenAPI

---

## Author

**Aishwary Mishra**

Computer Science Engineering Student

---

<p align="center">
  Built with Java, Spring Boot & PostgreSQL
</p>
