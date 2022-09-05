import Classes.Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ivan Popov", "ivPopov@gmail.com", 'M');
        Author a2 = new Author("Anna Ivanova", "anIvanova@gmail.com", 'F');
        Author a3 = new Author("Someone", "Someone@somewhere.com", 'g');

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println("====================");
        a3.setEmail(a1.getEmail());
        System.out.println(a3);
    }
}
