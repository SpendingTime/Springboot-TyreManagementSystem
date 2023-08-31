FROM openjdk:18-jdk

ARG JAR_FILE=target/*.jar

COPY ./target/backendtms-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]