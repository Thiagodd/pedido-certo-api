FROM eclipse-temurin:17-jdk-alpine
LABEL authors="thiagodd"

WORKDIR /app

COPY target/pedidocerto-api-0.0.1.jar pedidocerto-api-0.0.1.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "pedidocerto-api-0.0.1.jar"]