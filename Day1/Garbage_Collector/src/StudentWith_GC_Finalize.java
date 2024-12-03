class Student1 {
    private int id;
    private String name;
    private static int nextId = 1;

    public Student1(String name){
        this.name = name;
        this.id = nextId++;
    }

    public void show(){
        System.out.println("id = " + id + " name: " + name);
    }

    public void shownextId(){
        System.out.println("next student id : " + nextId);
    }

    protected void finalize() {
        --nextId;
        //The number of object created it will be called
    }
}

public class StudentWith_GC_Finalize {
    public static void main(String[] args) {
        Student1 a = new Student1("a");
        Student1 b = new Student1("b");

        a.show();
        b.show();
        a.shownextId();
        b.shownextId();

        {
            Student1 c = new Student1("c");
            Student1 d = new Student1("d");

            c.show();
            d.show();
            c.shownextId();
            d.shownextId();

            c = null;
            d = null;

            System.gc();
            System.runFinalization();
        }

        a.shownextId();
    }
}

//output:
//id = 1 name: a
//id = 2 name: b
//next student id : 3
//next student id : 3
//id = 3 name: c
//id = 4 name: d
//next student id : 5
//next student id : 5
//next student id : 3
