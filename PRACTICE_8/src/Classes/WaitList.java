package Classes;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList <E> {
    protected ConcurrentLinkedQueue <E> queue;

    public WaitList() {
        queue = new ConcurrentLinkedQueue<E>();
    }

    public WaitList(Collection <E> c) {
        queue = new ConcurrentLinkedQueue<E>(c);
    }


    @Override
    public void add(E element) {
        queue.add(element);
    }

    @Override
    public E remove() {
        return queue.remove();
    }

    @Override
    public boolean contains(E element) {
        return queue.contains(element);
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return queue.containsAll(c);
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
