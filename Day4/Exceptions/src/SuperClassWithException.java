import java.io.*;

// Case 1: SubClass declares an exception not a child of
// SuperClass's exception (invalid case)
class SuperClassCase1 {
    void method() throws RuntimeException {
        System.out.println("SuperClass - Case 1");
    }
}

class SubClassCase1 extends SuperClassCase1 {
    @Override
    void method() throws Exception { // Compiler Error: Exception is broader than RuntimeException
        System.out.println("SubClass - Case 1");
    }
}

// Case 2: SubClass declares a child exception of
// SuperClass's exception (valid case)
class SuperClassCase2 {
    void method() throws Exception {
        System.out.println("SuperClass - Case 2");
    }
}

class SubClassCase2 extends SuperClassCase2 {
    @Override
    void method() throws IOException { // IOException is a child of Exception
        System.out.println("SubClass - Case 2");
    }
}

// Case 3: SubClass does not declare any exception (valid case)
class SuperClassCase3 {
    void method() throws IOException {
        System.out.println("SuperClass - Case 3");
    }
}

class SubClassCase3 extends SuperClassCase3 {
    @Override
    void method() { // No exception declared
        System.out.println("SubClass - Case 3");
    }
}

// Driver Code
public class SuperClassWithException {
    public static void main(String[] args) throws Exception {
        // Case 1
//         SuperClassCase1 superClassCase1  = new SubClassCase1();
//         superClassCase1.method(); // This will not compile due to invalid overriding

        // Case 2
        SuperClassCase2 superClassCase2 = new SubClassCase2();
        superClassCase2.method();

        // Case 3
        SuperClassCase3 superClassCase3 = new SubClassCase3();
        superClassCase2.method();
    }
}
