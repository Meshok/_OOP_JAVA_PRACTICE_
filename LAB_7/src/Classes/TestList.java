package Classes;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TestList {

    public static void test() {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);

        int i = 10;
        while (scanner.hasNextInt() && i-- > 0) {
            list.offerFirst(scanner.nextInt());
            while (list.size() > 5) {
                list.removeLast();
            }
            System.out.println(list);
        }

        System.out.println("Third element is " + list.get(2));

        System.out.println("Let's change this to 666 :D");
        list.set(2, 666);
        System.out.println(list);
    }
}
