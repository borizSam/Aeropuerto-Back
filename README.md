![Aeropuerto Backend Banner](https://i.imgur.com/l4ktSLG.png)

# Aeropuerto Backend – API REST con Spring Boot

> ✈️ API REST para la gestión integral de un sistema de **Aeropuerto**.  
Permite administrar vuelos, pasajeros, aerolíneas y operaciones.  
Forma parte del ecosistema **Aeropuerto System**, junto con el frontend y la infraestructura cloud (repos separados).

---

## 🚀 Tecnologías principales
- ☕ **Java 21**
- 🌱 **Spring Boot 3**
- 🧩 **Spring Data JPA** + **MySQL**
- 🔐 **Spring Security + JWT**
- 🐳 **Docker**
- ⚙️ **Maven**
- 🚀 **GitHub Actions (CI/CD)**

---

## 🧩 Arquitectura del proyecto

```plaintext
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

```

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
##### http://localhost:8080

### 🐳 Docker
    Construir imagen
    docker build -t borizsam/aeropuerto-backend .

### Ejecutar contenedor
    docker run -p 8080:8080 borizsam/aeropuerto-backend

## 🔌 Endpoints principales

| Método | Endpoint | Descripción |
|:-------|:----------|:-------------|
| `GET` | `/api/health` | Verificar estado del servicio |
| `GET` | `/api/aeropuertos` | Listar todos los aeropuertos |
| `POST` | `/api/aeropuertos` | Crear un nuevo aeropuerto |
| `GET` | `/api/aviones` | Listar todos los aviones |
| `POST` | `/api/aviones` | Registrar un nuevo avión |
| `GET` | `/api/vuelos` | Listar vuelos disponibles |
| `POST` | `/api/vuelos` | Crear un nuevo vuelo |
| `POST` | `/api/login` | Autenticación JWT (inicio de sesión) |

> 🔐 Los endpoints protegidos requieren un token **JWT** válido en el encabezado `Authorization`.

---

## 🌐 Frontend del proyecto

Si deseas probar el sistema completo en local, puedes ejecutar también el **frontend React + Vite**, disponible en el repositorio:

👉 [**Aeropuerto-Front**](https://github.com/borizSam/Aeropuerto-Front)

Una vez clonado y configurado, asegúrate de crear un archivo `.env` en la raíz del frontend con la siguiente variable:

```bash
VITE_API_URL=http://localhost:8080/api
```
---

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

### 🌐 Repositorios relacionados

[🖥️ Frontend: Aeropuerto-Front](https://github.com/borizSam/Aeropuerto-Front.git)

[☁️ Infraestructura: Aeropuerto-Infra](https://github.com/borizSam/Aeropuerto-infra.git)

#### Licencia
    Eres libre de usarlo y modificarlo con atribución.

###### Desarrollado por @borizSam


