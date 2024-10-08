FROM eclipse-temurin:21-jdk
ARG JAR_FILE=target/api-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]