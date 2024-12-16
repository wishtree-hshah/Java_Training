import java.util.*;

class Student {
    String name;
    int age;
    int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 85));
        students.add(new Student("Bob", 22, 90));
        students.add(new Student("Charlie", 21, 90));
        students.add(new Student("David", 23, 80));

        // Sorting students by marks in descending order,
        // and if marks are the same, sort by name in alphabetical order
        students.sort(Comparator.comparingInt(Student::getMarks)
                .reversed()  // Sort by marks in descending order
                .thenComparing(Student::getName));  // Sort by name in alphabetical order in case marks is same

        // Display sorted students
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getMarks() + " marks, Age: " + student.getAge());
        }
    }
}
