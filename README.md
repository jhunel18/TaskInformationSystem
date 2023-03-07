# TaskInformationSystem
This is an exercise on the use of Spring Boot JPA and Postgres Database

# Docker Folder
The File is located in this folder
https://github.com/jhunel18/TaskInformationSystem/tree/master/src/main/docker

# Convert the Application to JAR File
  Run this command in the current directory
  `./mvnw clean package -DskipTests`
  
# Docker Folder
Using the command below copy the jar file from target folder to src\main\docker using the command:
`cp target/task-0.0.1-SNAPSHOT.jar src/main/docker`

# DockerFile Configuration
Create a Docker File under scr\main\docker folder using the following script similar to the link below:

https://github.com/jhunel18/TaskInformationSystem/blob/master/src/main/docker/dockerfile


# docker-compose.yml

Creat a docke-compose.yml configuration scr\main\docker folder using the following script similar to the link below:

https://github.com/jhunel18/TaskInformationSystem/blob/master/src/main/docker/docker-compose.yml
      
# Build and Run
To build the application
`docker build -t task-app`

To run the application
`docker-compose up`

# Access the End point
Go to the url http://localhost:8080

