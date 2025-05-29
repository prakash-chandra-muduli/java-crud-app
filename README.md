## 🛠 How to Run and Check the CRUD App in Java

### 🚀 Running the Application

1. **Clone the Repository**

```bash
git clone https://github.com/your-username/spring-crud-rest.git
cd spring-crud-rest
```

2. **Set Up the Environment**  
   Ensure you have the following installed:

- Java Development Kit (JDK) 11 or higher
- Maven 3.6 or higher
- A database (e.g., MySQL or PostgreSQL)

3. **Configure the Database**  
   Update the `application.properties` file located in `src/main/resources` with your database credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
```

4. **Build the Project**  
   Run the following command to build the project:

```bash
mvn clean install
```

5. **Run the Application**  
   Start the application using:

```bash
mvn spring-boot:run
```

### 🔍 Testing the Application

1. **Access the API**  
   Open your browser or API testing tool (e.g., Postman) and navigate to:

```
http://localhost:8080/api/v1/resource
```

2. **Perform CRUD Operations**

- **Create**: Send a POST request to add a new resource.
- **Read**: Send a GET request to retrieve resources.
- **Update**: Send a PUT request to modify an existing resource.
- **Delete**: Send a DELETE request to remove a resource.

3. **Check Logs**  
   Monitor the console logs for any errors or status updates.

---

Feel free to explore and customize the application as needed!
