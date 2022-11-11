import Classes.Complex.ConcreteFactory;

public class Main {

    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        System.out.println(factory.createComplex());
        System.out.println(factory.createComplex(2, 5));
        System.out.println(factory.createComplex(1, -4));
    }
}
