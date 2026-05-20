# -------- STAGE 1: Build --------
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy full project (IMPORTANT)
COPY . .

# Build only user-service module
RUN mvn clean package -pl services/user-service -am -DskipTests


# -------- STAGE 2: Run --------
FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

# Copy jar
COPY --from=builder /app/services/user-service/target/*.jar app.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "app.jar"]