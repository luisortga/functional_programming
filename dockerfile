# ETAPA 1: Compilación de la aplicación
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# ETAPA 2: Ejecución de la aplicación
FROM eclipse-temurin:17-jre-alpine
WORKDIR /functional_programming
# Asegúrate de cambiar "mi-app-1.0.0.jar" por el nombre real de tu .jar generado en la carpeta target
COPY --from=build /app/target/mi-app-1.0.0.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]