package Classes;

public class Student {
    private final int id;
    private final int finalResult;

    public Student(int id, int finalResult) {
        this.id = id;
        this.finalResult = finalResult;
    }

    public int getFinalResult() {
        return finalResult;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", finalResult=" + finalResult +
                '}';
    }
}
