package Classes;

public class BoundedWaitList <E> extends WaitList <E> {
    private final int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (queue.size() < capacity) super.add(element);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
