# 🚀 Spring Boot Backend con PostgreSQL

<div align="center">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.5.3-6DB33F" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/PostgreSQL-16-336791" alt="PostgreSQL"/>
  <img src="https://img.shields.io/badge/Java-21-007396" alt="Java"/>
  <img src="https://img.shields.io/badge/JWT-0.11.5-000000" alt="JWT"/>
</div>

## 🌟 Tecnologías Principales

| Tecnología | Logo | Descripción |
|------------|------|-------------|
| **Spring Boot** | <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=spring&logoColor=white" width="80"> | Framework backend para aplicaciones Java empresariales |
| **PostgreSQL** | <img src="https://img.shields.io/badge/PostgreSQL-336791?style=flat-square&logo=postgresql&logoColor=white" width="80"> | Potente base de datos relacional open-source |
| **JWT** | <img src="https://img.shields.io/badge/JWT-000000?style=flat-square&logo=jsonwebtokens&logoColor=white" width="80"> | Autenticación segura con JSON Web Tokens |
| **Docker** | <img src="https://img.shields.io/badge/Docker-2496ED?style=flat-square&logo=docker&logoColor=white" width="80"> | Contenedores para despliegue consistente |


## ⚡ Comenzar Rápido
```bash
# 1. Clonar repositorio
git clone (https://github.com/PatEche/backend-estudiantes)
cd backend-estudiantes

```
<div align="center">
  <img src="https://github.com/user-attachments/assets/a23d4891-0a6a-414b-8f25-e879db6592c3" width="600" alt="Diagrama Arquitectura"/>
</div>

# Propiedades de la base de datos
spring.datasource.url=
spring.datasource.password=

# Propiedades del driver
spring.datasource.driver-class-name=org.postgresql.Driver

# Propiedades de Hibernate y JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
