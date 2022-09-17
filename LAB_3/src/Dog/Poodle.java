package Dog;

public class Poodle extends Dog{
    private String sort = "Пудель";

    public Poodle(String name, int age) {
        super(name, age);
    }

    public Poodle() {
        super();
    }

    public Poodle(String name) {
        super(name);
    }

    @Override
    public String getSort() {
        return sort;
    }

    @Override
    public void getDescription() {
        System.out.println("Пудель – одна из самых добрых и послушных собак.");
        System.out.println("Обладает незаурядным умом, выдающимся обонянием, слухом и зрением.");
    }
}
