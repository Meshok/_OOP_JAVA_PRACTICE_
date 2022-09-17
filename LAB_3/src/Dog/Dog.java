package Dog;

abstract public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog () {
        this("Puppy", 0);
    }

    public Dog(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Собака " + name + '(' + age + " лет) породы " + getSort().toLowerCase();
    }

    abstract public String getSort();
    abstract public void getDescription();
}
