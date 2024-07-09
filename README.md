CRUD API Rest with Java Spring Boot

(This repository serves as a showcase of my capabilities in backend development and is aimed at potential employers to demonstrate my proficiency and readiness for related job roles.)

This repository contains a CRUD (Create, Read, Update, Delete) API developed using Java and Spring Boot. This project demonstrates my skills in backend development, particularly in creating RESTful web services, managing databases, and ensuring a robust and scalable application.

Features

* Create: Add new records to the database.
* Read: Retrieve existing records from the database.
* Update: Modify existing records in the database.
* Delete: Remove records from the database.

Technologies Used

* Java 21: The programming language used for development.
* Spring Boot 2.5: Framework for building the API.
* PostgreSQL: Database management system used for data storage.
* Maven: Dependency management and build automation tool.
* Docker: Containerization platform to ensure consistency across environments.

Getting Started

Prerequisites

* JDK 21 or higher
* Maven
* Docker
* PostgreSQL

Installation
1.Clone the repository:

"git clone https://github.com/your-username/crud-api-rest-spring.git" 
"cd crud-api-rest-spring"

2.Configure the database:

* Ensure PostgreSQL is running.
* Update the application.properties file with your database credentials.

3.Build and run the application:

"mvn clean install"
"mvn spring-boot:run"

4.Alternatively, run the application using Docker:

"docker-compose up --build"

API Endpoints

* POST /api/entities - Create a new entity
* GET /api/entities - Retrieve all entities
* GET /api/entities/{id} - Retrieve a specific entity by ID
* PUT /api/entities/{id} - Update a specific entity by ID
* DELETE /api/entities/{id} - Delete a specific entity by ID

Project Structure

* src/main/java: Contains the source code, organized by packages.
* src/main/resources: Contains configuration files.
* src/test: Contains unit and integration tests.

Contributing
Contributions are welcome! Please fork the repository and submit pull requests for any enhancements or bug fixes.

