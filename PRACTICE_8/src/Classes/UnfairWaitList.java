package Classes;

public class UnfairWaitList <E> extends WaitList <E> {
    public UnfairWaitList() {
        super();
    }

    public void remove(E element) {
        queue.remove(element);
    }

    public void moveToBack(E element) {
        remove(element);
        queue.add(element);
    }
}
