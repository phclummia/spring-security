# Spring Send Mail API

This application developed for Spring Security capabilities. 
At the beginning there exist only one endpoint without security. 
<br/>
In time I will add new branches with different capabilities.

# Branch jdbc-authentication

With this branch `inMemoryAuthentication` convert to `jdbcAuthentication`. 
<br/>
For jdbc authentication you need valid database and tables structure.

## There is valid database

If you have valid database, you can run [create.sql](docker/create.sql) for creating tables and relations.
<br/>
After that you need to update [application.yml](src/main/resources/application.yml) related `datasource` details.
````yaml
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/workshop_security
        username: root
        password: pass
        driver-class-name: com.mysql.cj.jdbc.Driver
````

## There isn't valid database (Docker Solution)

If you don't have valid database, you can use  [docker-compose.yml](docker/docker-compose.yml) 
for creating database, tables and relations in a container.
<br/>
Run the below command in the `docker` directory.

````shell
    docker-compose -f "docker-compose.yml" up -d --build
````

If you use this solution, you don't need to update [application.yml](src/main/resources/application.yml)

# Branch security-first-init

With this branch added features detailed below. 

|Feature |Description|
|-----|--------|
|pom.xml | Added Spring Security dependencies to pom.xml       |
|WebSecurityConfig.java  | Added `inMemoryAuthentication` to REST API      |

# Technologies

The project is built on Spring Boot architecture. Maven used as build automation tool.

# Project Setup

- **You need valid database, tables and relations. 
At branch change notes there is two solutions for database requirements.**

- Make sure to be in the root directory
- Run the command to run the project locally:
```
mvnw spring-boot:run
```

- Run the command to run the tets:
```
mvnw test
```

- Run the command to create runnable jar file:
```
mvnw package
```

# API Endpoints


## GET Endpoint `/api/v1/security/get/`

This endpoint return SecurityResponse object. That means successfully access the resource.

## Authentication Detail 

|Authentication Type |User Name | Password |
|-----|--------|--------|
|Basic Authentication | user | pass|

### Response

```json
    {
      "id": 7919202912837799685,
      "key": "Resource Key",
      "value": "Resource Value"
    }
```

## POST Endpoint `/api/v1/security/post/`

This endpoint return SecurityResponse object. That means successfully access the resource.

## Authentication Detail

|Authentication Type |User Name | Password |
|-----|--------|--------|
|Basic Authentication | user | pass|

### Request 

```json
    {
      "key": "Resource Key",
      "value": "Resource Value"
    }
```

### Response

```json
    {
      "id": 7919202912837799685,
      "key": "Resource Key",
      "value": "Resource Value"
    }
```
