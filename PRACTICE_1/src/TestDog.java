import Classes.Dog;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        System.out.println("===================");

        Dog d4 = new Dog();
        System.out.println(d4);
        d4.intoHumanAge();
        d4.setName(d2.getName());
        d4.setAge(d2.getAge());
        System.out.println(d4);
        d4.intoHumanAge();
    }
}
