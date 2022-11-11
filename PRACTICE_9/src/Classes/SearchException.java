package Classes;

public class SearchException extends RuntimeException {
    public SearchException() {
        super("Поиск студента завершился неудачно");
    }
}
