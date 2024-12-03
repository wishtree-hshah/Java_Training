
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//Java code to demonstrate use of 
//class object created by jvm
public class Test {
    public static void main(String[] args) {
        //create instance of student class
        Student s1 = new Student();

        // Get the runtime class of the object
        Class c1 = s1.getClass();

        // Print the name of the class
        System.out.println(c1.getName());

        //getting all method
        Method m[] = c1.getDeclaredMethods();
        for(Method method : m){
            System.out.println(method.getName());
        }

        Field f[] = c1.getDeclaredFields();
        for(Field field : f){
            System.out.println(field.getName());
        }
        
    }
}

//A class whose info is fetched in
//above class
class Student{
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}