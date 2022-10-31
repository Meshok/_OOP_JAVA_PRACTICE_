package Classes;

import java.util.Collection;

public interface IWaitList <E> {
    abstract public void add(E element);
    abstract public E remove();
    abstract public boolean contains(E element);
    abstract public boolean isEmpty();
    abstract public boolean containsAll(Collection<E> c);
}
