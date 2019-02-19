# spring-boot-oauth2
Spring Boot Restfull Application secured with spring boot Oauth2 protocol

## Prerequisite
1. JDK 1.8
2. Database MySql- 5+ 
3. Apache Maven-3

## Application Stracture
There are four main entities involve in Oauth2 Authentication  
1. Resource Server - The server that containing the protected resource.
2. Authorization Server - To authorize the request
3. Resource Owner - You or the user that owns the resource.
4. Client - The client that want to access the resource.


Below is the diagram that shows the Oauth2 authentication flow.

```
![alt text](https://raw.githubusercontent.com/bhupeshpadiyar/spring-boot-oauth2/master/src/main/resources/static/images/oauth2_authentication_flow.png)
```

## Steps to create the database to run this project
1. Create a database schema with name users
     ```
      CREATE SCHEMA `users` ;
      ```
2. Create a table inside this schema
    ```
    CREATE TABLE `user` (
      `id` bigint(20) NOT NULL AUTO_INCREMENT,
      `age` int(11) DEFAULT NULL,
      `password` varchar(255) DEFAULT NULL,
      `salary` bigint(20) DEFAULT NULL,
      `username` varchar(255) DEFAULT NULL,
      PRIMARY KEY (`id`)
    ) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
    ```

3. Insert some users inside the user table
    ```
      INSERT INTO User (id, username, password, salary, age) VALUES (1, 'Bhupesh', '                  $2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 111, 33);
      INSERT INTO User (id, username, password, salary, age) VALUES (2, 'Ram', '$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK', 222, 33);
      INSERT INTO User (id, username, password, salary, age) VALUES (3, 'Shyam', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 333, 22);
    ```

## Steps to run the project
1. Download The Project
2. Go to the project folder
3. Run following command
      ```
      mvn eclipse:eclipse
      ```
      ```
      mvn clean compile
      ```
      ```
      mvn spring-boot:run
      ```
      
# Steps To test the project
Below are the screen shots to test the application in Postman.

## Generate AuthToken:
```
![alt text](https://raw.githubusercontent.com/bhupeshpadiyar/spring-boot-oauth2/master/src/main/resources/static/images/client.png)
```
##
```
![alt text](https://raw.githubusercontent.com/bhupeshpadiyar/spring-boot-oauth2/master/src/main/resources/static/images/authorize.png)
```

## Access The Resource with the generated auth_token:
```
![alt text](https://raw.githubusercontent.com/bhupeshpadiyar/spring-boot-oauth2/master/src/main/resources/static/images/authenticate.png)
```


