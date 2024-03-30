package JavaControlStatements;

import java.util.Arrays;
import java.util.List;

public class Java_For_each_loop {
    public static void for_each1() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        for(Integer x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
    }

    public static void for_each2() {
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");

        for( String name : names) {
            System.out.print( name );
            System.out.print(",");
        }
    }

    public static void for_each3() {
        Student[] students = { new Student(1, "Julie"), new Student(3, "Adam"), new Student(2, "Robert")};

        for (Student student : students) {
            System.out.print( student );
            System.out.print(",");
        }
    }

    public static void main(String[] args) {
//        for_each1();
//        for_each2();
        for_each3();
    }
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "[ " + this.rollNo + ", " + this.name + " ]";
    }
}
