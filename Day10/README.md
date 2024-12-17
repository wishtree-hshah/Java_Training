## Java I/O:

- uses concept of stream to make io operations faster.
- stream: is a sequence of data and is composed of bytes.
    - system.out: o/p stream
    - system.in: i/p stream
    - system.err: error stream
- How stream works?
    - source: text file, cmd, socket it will take data and now the data is converted into binary form where read operation occurs by input stream.
    - Java Application
    - destination: now write operation takes place by output stream and finally data is written on destination (file, console, socket)
- Byte Streams: process data byte by byte and are generally used for binary data
    1. BufferedInputStream and BufferedOutputStream: reads or write a large chunk of data readucing no. of io operations:
    2. DataInputStream and DataOutputStream: Java's primitive data types in a byte stream.
    3. FileInputStream and FileOutputStream: for reading and writing files byte by byte.
    4. PrintStream: includes print and println.
- Character Streams handle text data (characters) and are typically used for reading/writing text files.
    1. FileReader and FileWriter are used for reading and writing text data from files.
    2. BufferedReader and BufferedWriter enhance efficiency by using buffers for reading and writing.
    3. InputStreamReader and OutputStreamReader are used for converting between byte streams and character streams.
    4. PrintWriter simplifies printing formatted text to output streams.
- FileDescriptor:
    - It makes sure that any changes you made to a file (like writing data) are actually saved to the disk.
    - After writing to a file, you can call sync() to ensure all changes are properly saved
- SequenceInputStream:
    - A SequenceInputStream in Java is used to combine multiple input streams into one. 
    - It allows reading from multiple streams sequentially as if they were a single stream. 
    - This is particularly useful when you have multiple files or streams and you want to read them one after another.

## Lambda Expression:

- it an anonymous function having no modifier and no return type
- Java compiler infer the type of variable passed in argument from functional interface
```Java
(a,b) -> a+b;
```

## Stream Api:

- The Stream API in Java is a way to work with collections of data (like lists or arrays) in a simpler and more readable way