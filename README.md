# Spring Send Mail API

This application developed for Spring Security capabilities. 
At the beginning there exist only one endpoint without security. 
<br/>
In time I will add new branches with different capabilities. 

# Technologies

The project is built on Spring Boot architecture. Maven used as build automation tool.

# Project Setup

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


### Response

```json
    {
      "id": 7919202912837799685,
      "key": "Resource Key",
      "value": "Resource Value"
    }
```

## POST Endpoint `/api/v1/security/get/`

This endpoint return SecurityResponse object. That means successfully access the resource.

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