import Dog.*;

public class Main {
    public static void main(String[] args) {
        Labrador dog1 = new Labrador("Alex", 6);
        Poodle dog2 = new Poodle("Bobby", 8);

        Dog superDog = new Labrador("Брэд", 1);

        System.out.println(dog1);
        dog1.getDescription();

        System.out.println(dog2);
        dog2.getDescription();

        System.out.println(superDog);
        superDog.getDescription();

    }
}
