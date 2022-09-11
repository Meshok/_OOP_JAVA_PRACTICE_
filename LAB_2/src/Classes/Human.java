package Classes;

public class Human {
    private String name = "Unknown";
    private int age = 0;
    private Head head = new Head();
    private Hand rightHand = new Hand();
    private Hand leftHand = new Hand();
    private Leg rightLeg = new Leg();
    private Leg leftLeg = new Leg();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {}

    public void shakeAll() {
        head.shake();
        rightHand.shake();
        leftHand.shake();
        rightLeg.shake();
        leftLeg.shake();
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human " + name + " (" + age + "):"
                + "\nHead: " + head.toString()
                + "\nLeft hand: " + leftHand.toString()
                + "\nRight hand: " + rightHand.toString()
                + "\nLeft leg: " + leftLeg.toString()
                + "\nRight leg: " + rightLeg.toString();
    }

    private class Head {
        Boolean existence;

        public Head() {
            existence = true;
        }

        public Head(Boolean existence) {
            this.existence = existence;
        }

        public void shake() {
            if (existence) {
                System.out.println("Shaking head");
            }
        }

        @Override
        public String toString() {
            if (existence)
                return "exist";
            return "not exist";
        }
    }

    private class Hand {
        Boolean existence;

        public Hand() {
            existence = true;
        }

        public Hand(Boolean existence) {
            this.existence = existence;
        }

        public void shake() {
            if (existence) {
                System.out.println("Shaking hand");
            }
        }

        @Override
        public String toString() {
            if (existence)
                return "exist";
            return "not exist";
        }
    }

    private class Leg {
        Boolean existence;

        public Leg() {
            existence = true;
        }

        public Leg(Boolean existence) {
            this.existence = existence;
        }

        public void shake() {
            if (existence) {
                System.out.println("Shaking leg");
            }
        }

        @Override
        public String toString() {
            if (existence)
                return "exist";
            return "not exist";
        }
    }
}
