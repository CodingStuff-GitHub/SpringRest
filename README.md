# SpringRest
Spring Boot and PostgreSQL Rest API
API-application using Spring Boot, PostgreSQL, JPA and Hibernate.

Steps to Setup
1. Clone the application

2. Create PostgreSQL database

3. Change username and password as per your installation

open src/main/resources/application.properties

change spring.datasource.username and spring.datasource.password as per your PostgreSQL installation

4. Build and run the app using maven

The app will start running at ''http://localhost:9090''.

Explore Rest APIs :

The app defines following APIs.

GET ```/home```

GET ``/loads``

GET ``/loads/{id}``

PUT ``/loads/{id}``

DELETE ``/loads/{id}``

You can test them using postman or any other rest client.
