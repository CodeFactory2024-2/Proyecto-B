FROM openjdk:17-jdk-slim
COPY target/artifacts/reserva_b.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]