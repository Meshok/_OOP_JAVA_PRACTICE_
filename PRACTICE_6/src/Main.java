import Classes.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] array = {
                new Student(1, 55),
                new Student(2, 22),
                new Student(3, 25)};
        for (Student it: array) {
            System.out.println(it);
        }

        Arrays.sort(array, new SortingStudentsByGPA());

        System.out.println("===========================");
        for (Student it: array) {
            System.out.println(it);
        }
    }
}
