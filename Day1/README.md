**Execution of Java Code:** At compile-time, Java source code or .java file is converted into bytecode or .class file. At runtime, JVM (Java Virtual Machine) will load the .class file and will convert it to machine code with the help of an interpreter. After compilation of method calls (using the Just-In-Time (JIT) compiler), JVM will execute the optimized code. So Java is both compiled as well as an interpreted language.
<br/>
<br/>
**Compile the Java File:**Compile the Hello.java file to produce the Hello.class file
```Java
javac Hello.java
```
**Create the JAR File:** 
```Java
jar --create --file Hello.jar Hello.class
```
**Execute the Program using jar file:**
```Java
java -cp Hello.jar Hello   
```
