package ru.job4j.list;

import java.util.Iterator;

/**
 * Class SimpleStack - implementation Stack.
 *
 * @param <T> - param.
 * @author Artur Glyzin.
 * @version 2.0.
 * @since 04.03.2019.
 */

public class SimpleStack<T> implements Iterable<T> {

    private MyLinkedList<T> list = new MyLinkedList<>();

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     */

    public T poll() {
        return list.removeLast();
    }

    /**
     * Pushes an element onto the stack represented by this list.
     *
     * @param value - the element to push.
     */

    public void push(T value) {
        list.add(value);
    }

    /**
     * Returns size of the list.
     *
     * @return size.
     */

    public int size() {
        return list.getSize();
    }

    /**
     * Iterator for SimpleStack.
     *
     * @return iterator.
     */

    public boolean isEmpty() {
        return list.getSize() == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }
}
