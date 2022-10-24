import Classes.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 1)
            new MyProgram(args[0]);
        else
            System.out.println("This program require 1 parameter!");
    }
}
