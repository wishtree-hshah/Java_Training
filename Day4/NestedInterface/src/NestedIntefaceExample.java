class OuterClass{
    public interface PublicNestedInterface{
        void show();
    }

    private interface PrivateNestedInterface{
        void show();
    }

    protected interface ProtectedNestedInterface{
        void show();
    }

    interface DefaultInterface{
        void show();
    }

    public void demonstratePrivateInterface() {
        class PrivateImplementation implements PrivateNestedInterface {
            @Override
            public void show() {
                System.out.println("Private Nested inside class");
            }
        }
        PrivateNestedInterface privateObj = new PrivateImplementation();
        privateObj.show();
    }
}

interface OuterInterface{
    interface DefaultInterface{
        void print();
    }

    public interface PublicInterface{
        void print();
    }
}

class PublicImpl implements OuterClass.PublicNestedInterface,OuterInterface.PublicInterface{
    @Override
    public void show() {
        System.out.println("Public nested inside class");
    }

    @Override
    public void print() {
        System.out.println("Public nested inside interface");
    }
}

class ProtectedImpl implements OuterClass.ProtectedNestedInterface{
    @Override
    public void show() {
        System.out.println("Protected nested inside class");
    }
}

class DefaultImpl implements OuterClass.DefaultInterface, OuterInterface.DefaultInterface{
    @Override
    public void print() {
        System.out.println("Default nested inside interface");
    }

    @Override
    public void show() {
        System.out.println("Default nested inside class");
    }
}

public class NestedIntefaceExample {
    public static void main(String[] args) {
        OuterClass.PublicNestedInterface publicNestedInterface = new PublicImpl();
        publicNestedInterface.show();

        OuterClass.DefaultInterface defaultInterface = new DefaultImpl();
        defaultInterface.show();

        OuterClass.ProtectedNestedInterface protectedNestedInterface = new ProtectedImpl();
        protectedNestedInterface.show();

        OuterClass outerClass = new OuterClass();
        outerClass.demonstratePrivateInterface();

        System.out.println();

        OuterInterface.PublicInterface publicInterface = new PublicImpl();
        publicInterface.print();

        OuterInterface.DefaultInterface defaultInterface1 = new DefaultImpl();
        defaultInterface1.print();
    }
}
