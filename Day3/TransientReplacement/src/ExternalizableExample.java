import java.io.*;

class Employee implements Serializable {
    private String name;
    private int age;
    private String password;  // This field is not marked as transient

    // Constructor
    public Employee(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    // Custom writeObject method

    /**
     *
     * @param oos
     * @throws IOException
     */
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
    }

    // Custom readObject method to exclude 'password' from deserialization

    /**
     *
     * @param ois
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        password = null;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Password: " + password;
    }
}

public class ExternalizableExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee emp = new Employee("John", 30, "password123");

        // Serialize the object to a file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
        oos.writeObject(emp);
        oos.close();

        // Deserialize the object from the file
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
        Employee deserializedEmp = (Employee) ois.readObject();
        ois.close();

        // Print the deserialized object
        System.out.println(deserializedEmp);  // Password should be null
    }
}
