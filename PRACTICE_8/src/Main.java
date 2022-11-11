import Classes.UnfairWaitList;
import Classes.WaitList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        UnfairWaitList <Integer> list = new UnfairWaitList<Integer>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            list.add(scanner.nextInt());
            System.out.println(list);
        }

        System.out.println("Move to back: ");
        list.moveToBack(scanner.nextInt());
        System.out.println(list);
        System.out.println("Remove: ");
        list.remove(scanner.nextInt());
        System.out.println(list);
        System.out.println("Remove: ");
        list.remove(scanner.nextInt());
        System.out.println(list);
        System.out.println("Remove()");
        list.remove();
        System.out.println(list);
        System.out.println("Remove()");
        list.remove();
        System.out.println(list);
    }
}
