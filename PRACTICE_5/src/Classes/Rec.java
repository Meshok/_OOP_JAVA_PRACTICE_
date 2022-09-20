package Classes;

import java.util.Scanner;

public class Rec {
    static public int max() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int res;
        if (a == 0) {
            res = 0;
        } else {
            res = max();
            if (res < a) {
                res = a;
            }
        }
        return res;
    }
}
