## Request Handling and Controller Annotations:

1. @Controller
    - Marks a class as a controller in the MVC architecture.
    - Typically used in combination with @RequestMapping to define request handling methods.
    - Returns a View (e.g., a .jsp or .html file).

2. @RestController
    - Combines @Controller and @ResponseBody.
    - Marks a class as a RESTful controller, meaning all methods return JSON/XML directly, rather than a view.

3. @RequestMapping
    - Maps HTTP requests to handler methods or classes.

4. @RequestParam
    - Binds a query parameter from the request to a method parameter.

5. @PathVariable
    - Binds a URI template variable to a method parameter.

6. @RequestBody
    - Binds the body of an HTTP request to a method parameter (used for JSON/XML payloads).

7. @ResponseBody
    - Indicates that a method’s return value is written directly to the HTTP response body (used for JSON/XML responses).

## Springboot Annotations:

1. @SpringBootApplication: Marks the main entry point for a Spring Boot application. Usually placed on the main class of the application.

2. @SpringBootConfiguration: Indicates that the class provides Spring Boot configuration, acting as a specialized version of @Configuration.

3. @EnableAutoConfiguration: Enables Spring Boot's auto-configuration mechanism, which automatically configures the application context based on the dependencies in the classpath.

4. @ComponentScan: Scans for Spring components (e.g., @Component, @Service, @Repository, and @Controller) in the package of the annotated class and its sub-packages.

## Exception Annotations:

1. @ExceptionHandler: Used to define a method that handles specific exceptions within a controller or globally when combined with @ControllerAdvice.

2. @ControllerAdvice: Used to define a global exception handler across multiple controllers.

3. @ResponseStatus: Marks an exception with a specific HTTP status code, which will be sent back to the client when the exception is thrown.