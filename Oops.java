
import java.util.*;
import java.util.Scanner;

class Student {
    String name;
    int age;
    String course;

    public static void data() {
        Scanner sc = new Scanner(System.in);
        System.out.println("name");
        String s.name = sc.nextLine();
        System.out.println("course");
        String s.course = sc.nextLine();
        System.out.println("age");
        int s.age = sc.nextInt();
        System.out.println("thanks for your details");
    }

    static void info() {
        System.out.println(("hello" + s.name + " your age is" + s.age + "you are pursuing  " + s.course));
    }
}

public class Oops {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student.data();

    }
}
