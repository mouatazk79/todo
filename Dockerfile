FROM openjdk:8
EXPOSE 8080
ADD target/todo-docker.jar todo-docker.jar
ENTRYPOINT ["java","-jar","todo-docker.jar"]