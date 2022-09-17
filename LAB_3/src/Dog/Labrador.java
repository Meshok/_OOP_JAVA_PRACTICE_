package Dog;

public class Labrador extends Dog{
    private String sort = "Лабрадор";

    public Labrador(String name, int age) {
        super(name, age);
    }

    public Labrador() {
        super();
    }

    public Labrador(String name) {
        super(name);
    }

    @Override
    public String getSort() {
        return sort;
    }

    @Override
    public void getDescription() {
        System.out.println("Лабрадоры — это крупные, сильные собаки с крепким телосложением и прочным скелетом.");
        System.out.println("У них широкие голова и нежные, умные глаза.");
    }
}
