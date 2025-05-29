### Project Structure

```
spring-crud-rest/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/
│   │   │         └── springcrudrest/
│   │   │               ├── controller/
│   │   │               │   └── UserController.java
│   │   │               ├── model/
│   │   │               │   └── User.java
│   │   │               ├── repository/
│   │   │               │   └── UserRepository.java
│   │   │               ├── service/
│   │   │               │   └── UserService.java
│   │   │               ├── congig/
│   │   │               │   └── DataInitailizer.java
│   │   │               └── SpringCrudRestApplication.java
│   │   └── resources/
│   │       ├── application.properties
├── pom.xml
└── README.md
```

#### Spring Framework Annotations used here

1. **`@SpringBootApplication`**

- Marks the main class of a Spring Boot application.
- Combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`.

2. **`@RestController`**

- Indicates that the class is a controller where `@RequestMapping` methods return `@ResponseBody`.

3. **`@RequestMapping`**

- Maps HTTP requests to handler methods of MVC and REST controllers.

4. **`@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`**

- Specialized annotations for mapping HTTP GET, POST, PUT, and DELETE requests.

5. **`@PathVariable`**

- Used to extract values from the URI template.

6. **`@RequestBody`**

- Maps the body of the HTTP request to a Java object.

7. **`@Autowired`**

- Enables automatic dependency injection.

8. **`@Entity`**

- Specifies that the class is an entity and is mapped to a database table.

9. **`@Table`**

- Used to specify the table name for an entity.

10. **`@Id`**

- Marks a field as the primary key.

11. **`@GeneratedValue`**

- Specifies how the primary key should be generated (e.g., auto-increment).

12. **`@Column`**

- Maps a field to a specific column in the database.

13. **`@Transactional`**

- Indicates that a method or class should be executed within a transaction.

#### Validation Annotations

1. **`@NotNull`**

- Ensures that a field cannot be null.

2. **`@Size`**

- Specifies the size constraints for a field.

3. **`@Min` and `@Max`**

- Define minimum and maximum values for numeric fields.

4. **`@Pattern`**

- Validates a field against a regular expression.
