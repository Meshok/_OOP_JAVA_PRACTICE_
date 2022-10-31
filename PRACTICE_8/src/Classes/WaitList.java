package Classes;

import java.net.CookieHandler;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList <E> implements IWaitList <E> {
    protected ConcurrentLinkedQueue <E> queue;

    public WaitList() {

    }

    public WaitList(Collection <E> c) {

    }


    @Override
    public void add(E element) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return false;
    }

    @Override
    public String toString() {
        return "WaitList{}";
    }
}
