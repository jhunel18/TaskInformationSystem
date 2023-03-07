# TaskInformationSystem
This is an exercise on the use of Spring Boot JPA and Postgres Database

# Convert the Application to JAR File
  Run this command in the current directory
  ./mvnw clean package -DskipTests
  
# Docker Folder
Using the command below copy the jar file from target folder to src\main\docker using the command:
cp target/task-0.0.1-SNAPSHOT.jar src/main/docker

# DockerFile Configuration
Create a Docker File under scr\main\docker folder using the following script:

FROM openjdk:17
LABEL maintainer = "jhunelpenaflorida"
ADD task-0.0.1-SNAPSHOT.jar task-docker.jar
ENTRYPOINT ["java","-jar","task-docker.jar"]

# docker-compose.yml

Creat a docke-compose.yml configuration using the following command:

version: '2'

services:
  app:
    image: 'docker-spring-boot-postgres:latest'
    build:
      context: .
    container_name: app-task
    links:
      - app-db
    ports:
      - 8080:8080
    environment:
      - SPRING_DATASOURCE_URL=jdbc:postgresql://app-db:5432/task_db
      - SPRING_DATASOURCE_USERNAME=postgres
      - SPRING_DATASOURCE_PASSWORD=pass123
      - SPRING_JPA_HIBERNATE_DDL_AUTO=update
  app-db:
    image: postgres:9.6
    environment:
      - POSTGRES_USER=postgres
      - POSTGRES_PASSWORD=pass123
      - POSTGRES_DB=task_db
    expose:
      - 5432
      
# Build and Run
To build the application
`docker build -t task-app`

To run the application
`docker-compose up`

# Access the End point
Go to the url http://localhost:8080

