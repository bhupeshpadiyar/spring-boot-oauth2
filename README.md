# spring-boot-oauth2
Spring Boot Restfull Application secured with spring boot Oauth2 protocol

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
      
#Testing the Application
Below are the screen shots to test the application in Postman.

##Generate AuthToken:


##Generate Access The Resource with the generated auth_token:



