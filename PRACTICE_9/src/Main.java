import Classes.*;

import java.util.Random;

public class Main {
    public static void printStudentList(Student[] arr) {
        System.out.print(arr[0].getId() + ": " + arr[0].getFinalResult());
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i].getId() + ": " + arr[i].getFinalResult());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        Random rand = new Random();
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(rand.nextInt(100), rand.nextInt(1000));
        }

        printStudentList(students);

        SortingAlgorithms.quickSort(students, new SortingStudentsByGPA());

        printStudentList(students);

        try {
            System.out.println(SearchingAlgorithms.linearSearch(students[0], students, new SortingStudentsByGPA()));
            System.out.println(SearchingAlgorithms.linearSearch(students[6], students, new SortingStudentsByGPA()));
            System.out.println(SearchingAlgorithms.linearSearch(new Student(-1, -1), students, new SortingStudentsByGPA()));
        } catch (SearchException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }


}
