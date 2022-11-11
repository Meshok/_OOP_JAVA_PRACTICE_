package Classes;

import java.util.Collection;

public interface IWaitList <E> {
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean isEmpty();
    boolean containsAll(Collection<E> c);
}
