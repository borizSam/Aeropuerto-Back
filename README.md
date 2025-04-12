# 📦 Backend - Spring Boot

## Descripción
Este proyecto representa el backend de un sistema de gestión de aeropuerto desarrollado con **Spring Boot**. Expone una API REST para gestionar los recursos relacionados (vuelos, aerolíneas, etc.).

## Tecnologías
- Java 17
- Spring Boot
- Maven
- Docker
- GitHub Actions

## Estructura
- `src/main`: contiene la lógica del backend.
- `Dockerfile`: genera la imagen Docker del backend.
- `.github/workflows`: contiene el pipeline de CI/CD con GitHub Actions.

## Build y ejecución local
```bash
./mvnw clean install
java -jar target/*.jar
```

## Docker
```bash
docker build -t tu_usuario_docker/aeropuerto-backend .
docker run -p 8080:8080 tu_usuario_docker/aeropuerto-backend
```