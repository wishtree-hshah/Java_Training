## Features of spring framework:

- IoC (Inversion of Control) Container:
    -  It reduces manual dependency management, decouples components, and makes the code more modular and easier to test.
    - org.springframework.beans and org.springframework.context handle IoC

- Data Access Framework
    - It handles common issues like database connection management, exception handling, and transaction management, simplifying database operations for developers

- Spring MVC Framework:
    - It separates the user interface (view), business logic (model), and user input handling (controller), making the web application easier to manage and maintain.

- Transaction Management:
    - ensure that operations are either fully completed or rolled back. 
    - It supports both local and global transactions, making it easier to manage without cluttering your application code.

- Spring Web Service:
    - It simplifies sending and receiving XML messages between machines
    - making it easy to build and manage web services for communication over the network

- JDBC Abstraction Layer:
    - It reduces boilerplate code for JDBC operations and translates SQL exceptions into a runtime exception (DataAccessException), making it easier to handle errors.

- Spring TestContext Framework:
    - makes testing easier by managing the app setup, rolling back transactions automatically, and injecting dependencies into test cases.

## Why to use Spring?

- Easy, Simple, and Lightweight 
- Builds Secure Web Applications 
- MVC Pattern 
- Easy Communication with Databases 
- Modular Design
- Can be Integrated with Other Frameworks
- Dependency Injection

## Why springboot

- Auto-Configuration: Automatically configures your application based on dependencies.
- Embedded Servers: Comes with Tomcat/Jetty, so no external server setup.
- Starter Packs: Pre-defined dependencies for faster setup.
- Microservices: Ideal for creating standalone, production-ready microservices.
- Minimal Code: Reduces boilerplate code with annotations and defaults.
- Rapid Development: Enables quick prototyping and deployment.

- spring-boot-starter-web is a dependency for building web applications. 
It includes:
    - Spring MVC: For creating RESTful APIs and web applications.
    - Embedded Tomcat: Runs your app without external server configuration.
    - Jackson: For JSON serialization/deserialization.





