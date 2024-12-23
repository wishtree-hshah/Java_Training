- Dirty Read: Occurs when a transaction reads data that has been modified but not yet committed by another transaction.
- Non-Repeatable Read: Occurs when a transaction reads the same row multiple times and gets different results because another transaction modified the data between the reads.
- Phantom Read: Occurs when a transaction executes the same query twice, but additional rows appear or disappear between the queries due to another transaction inserting or deleting data.

- TRANSACTION_READ_UNCOMMITTED:
    - The lowest level of isolation. Transactions can see uncommitted changes made by other transactions.
    - Dirty reads, non-repeatable reads, and phantom reads can occur.

- TRANSACTION_READ_COMMITTED:
    - A transaction can only read committed changes from other transactions. Prevents dirty reads.
    - Non-repeatable reads and phantom reads can still occur.

- TRANSACTION_REPEATABLE_READ
    - Ensures that if a transaction reads a row twice, the data will not change during the transaction. Prevents dirty and non-repeatable reads.
    - Phantom reads can occur.

- TRANSACTION_SERIALIZABLE
    - The highest level of isolation. Ensures complete isolation by serializing transactions.