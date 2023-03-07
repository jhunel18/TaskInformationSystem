#define docker image
FROM openjdk:17
LABEL maintainer = "jhunelpenaflorida"
ADD target/task-0.0.1-SNAPSHOT.jar task-docker.jar
ENTRYPOINT ["java","-jar","task-docker.jar"]
