# quiz_microservice
This project is a Quiz application built using Spring Boot 3 and Spring Cloud. It leverages microservices architecture to ensure scalability and maintainability. The application uses Hibernate JPA for database interactions with MySQL and includes an API Gateway for routing and managing API requests.

Features
Microservices architecture
RESTful APIs for Quiz management
User authentication and authorization
Database interaction using Hibernate JPA
API Gateway for routing and managing API requests
Centralized configuration management
Architecture
The application consists of the following microservices:

Quiz Service: Manages quizzes and questions.
User Service: Manages user information and authentication.
Gateway Service: Acts as an entry point to the microservices, routing requests to appropriate services.
Config Service: Centralized configuration management using Spring Cloud Config.
 (Insert architecture diagram if available)

Technologies Used
Spring Boot 3: Framework for building microservices.
Spring Cloud: Tools for managing microservices.
Hibernate JPA: ORM framework for database interaction.
MySQL: Relational database management system.
Spring Cloud Gateway: API Gateway for routing and managing API requests.
Setup
Prerequisites
JDK 17 or higher
Maven 3.6+
MySQL 8+
Configuration
Clone the repository:

bash

git clone https://github.com/rdshree/quiz-microservices.git
cd quiz-microservices
Configure MySQL database:

Create databases for each service (e.g., quiz_service_db, user_service_db) and update the database connection properties in application.yml files located in the respective service directories.

Start Config Service:

bash

cd config-service
mvn spring-boot:run
Start other services:

Open separate terminal windows for each service and run the following commands:

bash

cd quiz-service
mvn spring-boot:run
bash

cd user-service
mvn spring-boot:run
bash

cd gateway-service
mvn spring-boot:run
Running the Application
Once all services are up and running, the application can be accessed via the API Gateway.
