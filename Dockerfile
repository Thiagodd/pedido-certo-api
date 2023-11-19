FROM eclipse-temurin:17-jdk-alpine
LABEL authors="thiagodd"

WORKDIR /app

COPY . .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "pedidocerto-api-0.0.1.jar"]