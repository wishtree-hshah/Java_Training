class Student {
    private int id;
    private String name;
    private static int nextId = 1;

    public Student(String name){
        this.name = name;
        this.id = nextId++;
    }

    public void show(){
        System.out.println("id = " + id + " name: " + name);
    }

    public void shownextId(){
        System.out.println("next student id : " + nextId);
    }
}

public class StudentBasic {
    public static void main(String[] args) {
        Student a = new Student("a");
        Student b = new Student("b");

        a.show();
        b.show();
        a.shownextId();
        b.shownextId();

        {
            Student c = new Student("c");
            Student d = new Student("d");

            c.show();
            d.show();
            c.shownextId();
            d.shownextId();
        }
        //Here after the end of braces the next student should id should be 3
        //but it is showing 5
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
//next student id : 5