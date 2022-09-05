package Classes;

import java.util.Arrays;

public class Print {

    public static void printArgs(String[] args) {
        int count = (int) Arrays.stream(args).count();
        for (int i = 0; i < count - 1; i++) {
            System.out.println(args[i]);
        }
        System.out.print(args[count - 1]);
    }
}
