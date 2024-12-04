import java.io.*;

class User implements Serializable {
    private String username;
    private transient String password; // Will not be serialized

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }
}

public class TransientKeyword {
    public static void main(String[] args) {
        User user = new User("abc", "123");

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user);
            System.out.println("Object Serialized: " + user);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) ois.readObject();
            System.out.println("Object Deserialized: " + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//The Serializable interface is implemented in Java to indicate that an object
// of the class can be converted into a stream of bytes and saved to a file or
// transmitted over a network after serialize and deserialize

//Here password is made transient so that it can't be serialized