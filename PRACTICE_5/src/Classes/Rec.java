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
            res = Math.max(res, a);
        }
        return res;
    }

    static public void triangleSequence(int n) {
        if (n > 0) fu(n, 0);
    }

    static private void fu(int n, int k) {
        if (n > 0) {
            for (int i = 0; i < Math.min(n, k); i++) System.out.print(k + " ");
            fu(n - k, k + 1);
        }
    }

    static public void numSequence(int n) {
        if (n > 0) {
            numSequence(n - 1);
            System.out.print(n + " ");
        }
    }
}
