## JDBC - Java Database Connectivity:

- It is mediator between java program and DB.

- JDBC Architecture:
    1. JDBC Application Layer:
        - Java Application
        - JDBC API (user for querying)
    2. JDBC Driver Layer:
        - JDBC DB Driver
        - DB

- Interfaces:
    1. Connection: Represents a connection to the database. It is used to send SQL commands and interact with the database.

    2. PreparedStatement: Used to execute parameterized SQL queries, which prevent SQL injection and improve performance (executeUpdate())
    
    3. Statement: Executes static SQL queries (queries without parameters) (executeQuery(String query))

    4. ResultSet: Represents the result of a SQL query (e.g., SELECT). It allows you to iterate over the rows and fetch column data

- Classes:

    1. DriverManager: Manages a set of database drivers and establishes a connection to the database

## Transaction Managment:

- ensures that a series of database operations are executed as a single unit of work. 
- If any operation fails, the transaction can be rolled back to maintain data consistency.
- Atomicity means either all successful or none.
- Consistency ensures bringing the database from one consistent state to another consistent state.
- Isolation ensures that transaction is isolated from other transaction.
- Durability means once a transaction has been committed, it will remain so, even in the event of errors, power loss etc.

## Batch Processing:

- Instead of executing all sql statements one by one we can add it to one batch and execute it combinely.
- addBatch(): To add queries to batch
- executeBatch(): is used to execute all the statements in the batch at once