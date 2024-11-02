This project demonstrates how to implement JWT (JSON Web Token) authentication and authorization in a Spring Boot application with a PostgreSQL database.

**Table of Contents**
Project Overview
Technologies Used
Features
Getting Started
Prerequisites
Configuration
Building and Running the Application
API Endpoints
Usage
License

**Project Overview**
This application provides a RESTful API for user authentication and management using JWT for secure access. It includes features like user registration, login, demonstrating secure handling of user credentials and sessions.

**Technologies Used**
Java 17+
Spring Boot
Spring Security
PostgreSQL
JWT (JSON Web Tokens)
Maven (for dependency management)

**Features**
User registration with hashed passwords.
JWT authentication for secure access to API endpoints.
RESTful API endpoints for user management.
Error handling and response customization.

Getting Started
Follow these instructions to set up and run the project on your local machine.

**Prerequisites**
Java 17 or higher
Maven (for dependency management)
PostgreSQL installed locally or run in Docker
Configuration
Clone the Repository

bash
Copy code
git clone https://github.comprachitil11/JWTSecurity.git
cd JWTSecurity
Setup application.properties

Edit the src/main/resources/application.properties file with the correct configuration for PostgreSQL.

properties
Copy code
# PostgreSQL properties
spring.datasource.url=jdbc:postgresql://localhost:5433/jwtsecurity
spring.datasource.username=postgres
spring.datasource.password=1234
spring.datasource.driver-class-name=org.postgresql.Driver

# JPA Properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Building and Running the Application
Build and start the Spring Boot application:

bash
Copy code
mvn clean install
mvn spring-boot:run
API Endpoints
Authentication
Register User: POST /register
Login User: POST /login
User Management (Protected Endpoints)
Note: Protected endpoints require a valid JWT token in the Authorization header: Bearer {token}.

Usage
Register a new user using the /register endpoint.
Login with your credentials to receive a JWT token.
Use the received token in the Authorization header to access protected resources.
