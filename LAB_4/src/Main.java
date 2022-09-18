import Nameables.*;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Бобби", 4);
        Automobile auto = new Automobile(5000000, "седан", "s510");
        Planet planet = new Planet(true,true, "Земля");

        System.out.println(dog.getName());
        System.out.println(auto.getName());
        System.out.println(planet.getName());
    }
}
