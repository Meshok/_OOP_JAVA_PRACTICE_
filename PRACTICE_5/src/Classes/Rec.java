package Classes;

import java.util.Scanner;

public class Rec {
    static public int max() {
        int a = new Scanner(System.in).nextInt();
        int res;
        if (a == 0) {
            res = 0;
        } else {
            res = max();
            res = res < a ? a : res;
        }
        return res;
    }
}
