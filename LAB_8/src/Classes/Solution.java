package Classes;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static String path = "test.txt";

    public Solution() throws IOException {
        FileWriter fileWriter = new FileWriter(path, false);
        fileWriter.write(new Scanner(System.in).nextLine());
        fileWriter.flush();
        fileWriter.close();
    }

}
