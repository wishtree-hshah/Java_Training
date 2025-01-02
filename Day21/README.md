- Two ways of interacting with database:
    1. JDBC 
    2. JPA (Java Persistence API)

## Spring Data JPA:

- JPA (Java Persistence API):
    - JPA is a standard for object-relational mapping (ORM) in Java. It defines a set of rules for managing, persisting, and retrieving Java objects from relational databases.
    - JPA is not a framework itself but a specification, and it can be implemented by different libraries.

- Spring Data JPA:
    - Spring Data JPA is a part of the Spring Data project that simplifies the development of data access layers using JPA.
    - It provides integration with Spring and removes the need for boilerplate code for common tasks like CRUD operations, pagination, and sorting.

- Repository Pattern:
    - In Spring Data JPA, the Repository pattern is used to abstract the database interactions.
    - It provides methods to interact with the database (e.g., save(), findById(), delete()) without writing implementation code for common database operations.
    - JpaRepository and CrudRepository are two core interfaces that Spring Data JPA provides, offering ready-made methods to perform operations.

- @Entity and @Table Annotations:
    - @Entity: Marks a class as an entity that is mapped to a table in the database.
    - @Table: Specifies the table to which the entity will be mapped (optional if the table name is the same as the class name).

- Primary Key (@Id):
    - Each entity must have a primary key, annotated with @Id. This uniquely identifies an entity in the database.

    - Primary Key Generation Strategies:

        1. GenerationType.AUTO: The JPA provider chooses the strategy based on the database configuration.
        ```Java
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        ```

        2. GenerationType.IDENTITY: The database automatically generates the primary key value (auto-increment).
        ```Java
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        ```

        3. GenerationType.SEQUENCE: Relies on a database sequence to generate primary keys.
        ```Java
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        ```

        4. GenerationType.TABLE: Uses a table to generate primary keys. A special table (@TableGenerator) is used to manage the ID generation.
        ```Java
        @GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_table")
        @TableGenerator(name = "employee_table", table = "id_table", pkColumnName = "entity_name", valueColumnName = "next_id", allocationSize = 1)
        private Long id;
        ```
- @Query: use the @Query annotation in Spring Data JPA when the query you need cannot be derived automatically by Spring Data from the method name or when you require a custom, optimized, or complex query that cannot be achieved with predefined methods.