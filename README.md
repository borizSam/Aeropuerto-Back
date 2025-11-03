![Aeropuerto Backend Banner](https://i.imgur.com/l4ktSLG.png)
# 🧱 Aeropuerto Backend – API REST con Spring Boot

> ✈️ API REST para la gestión integral de un sistema de Aeropuerto. 
Permite administrar vuelos, pasajeros, aerolíneas y operaciones.  
Forma parte del ecosistema **Aeropuerto System**, junto con el frontend y la infraestructura cloud (repos separados).

---

## Tecnologías principales
- ☕ **Java 21**
- 🌱 **Spring Boot 3**
- 🧩 **Spring Data JPA** + **MySQL**
- 🔐 **Spring Security + JWT**
- 🐳 **Docker**
- ⚙️ **Maven**
- 🚀 **GitHub Actions** (CI/CD)

---

## Arquitectura del proyecto

Aeropuerto-Backend/
│
├── 📁 src/
│   ├── 📁 main/java/com/example/aeropuerto/
│   │   ├── ⚙️ config/                   # Configuración general (seguridad, CORS, etc.)
│   │   ├── 🎯 controller/               # Controladores REST (Vuelos, Pasajeros, Aerolíneas)
│   │   ├── 🧩 model/                    # Entidades JPA
│   │   ├── 🗄️ repository/               # Repositorios (Spring Data JPA)
│   │   ├── 💡 service/                  # Lógica de negocio y capa intermedia
│   │   └── 🚀 AeropuertoApplication.java # Clase principal de Spring Boot
│   │
│   └── 📁 resources/
│       ├── ⚙️ application.properties     # Configuración de entorno
│       └── 🧾 data.sql                   # Datos iniciales (opcional)
│
├── 🧪 test/                              # Tests unitarios y de integración
│
├── 🐳 Dockerfile                         # Imagen Docker del backend
├── 📦 pom.xml                            # Configuración Maven
├── 🧰 mvnw / mvnw.cmd                    # Maven Wrapper
├── 🚫 .gitignore                         # Archivos y carpetas ignoradas por Git
├── ⚙️ .gitattributes                     # Configuración de atributos Git
└── 🔄 .github/workflows/ci.yml           # Pipeline CI/CD con GitHub Actions

---

## ⚙️ Ejecución local

### 🔹 Opción 1: Maven Wrapper
```bash
./mvnw clean spring-boot:run
```
### 🔹 Opción 2: Compilar y ejecutar JAR
```bash
./mvnw clean package
java -jar target/aeropuerto-0.0.1-SNAPSHOT.jar
```
Por defecto la aplicación se ejecuta en:
👉 http://localhost:8080

### 🐳 Docker
    Construir imagen
    docker build -t borizsam/aeropuerto-backend .

### Ejecutar contenedor
    docker run -p 8080:8080 borizsam/aeropuerto-backend

### 🔌 Endpoints principales
    Método	Endpoint	Descripción
    GET	/api/vuelos	Listar vuelos
    POST	/api/vuelos	Crear vuelo
    GET	/api/aerolineas	Listar aerolíneas
    POST	/api/login	Autenticación JWT
    GET	/api/health	Verificar estado del servicio

🔐 Los endpoints protegidos requieren un token JWT válido en el encabezado Authorization.

## 🔄 CI/CD

    Pipeline automatizado con GitHub Actions:

    🧱 Compila el proyecto con Maven

    ✅ Ejecuta tests automáticos

    🐳 Construye y publica la imagen Docker en Docker Hub

    ☁️ Despliega el backend en AWS ECS (infraestructura separada)

    Archivo: .github/workflows/ci.yml

## ☁️ Despliegue

El despliegue se gestiona desde el repositorio:
👉 Aeropuerto-Infra

    Incluye:

    ECS (Elastic Container Service)

    Docker Hub

    Load Balancer + Auto Scaling

    Monitoreo con CloudWatch

#### Licencia
    Este proyecto está bajo la licencia MIT.
    Eres libre de usarlo y modificarlo con atribución.

###### Desarrollado por @borizSam


