import Classes.Human;

public class Main {

    public static void main(String[] args) {
        Human man = new Human();
        Human woman = new Human("Anna", 22);
        System.out.println(man);
        System.out.println("======================");
        man.shakeAll();
        System.out.println("======================");
        System.out.println(woman);
        System.out.println(woman.getName());
        System.out.println(woman.getAge());
        System.out.println("======================");
        man.setAge(woman.getAge());
        System.out.println(man);
        man.setName(woman.getName());
        System.out.println(man);
    }
}
