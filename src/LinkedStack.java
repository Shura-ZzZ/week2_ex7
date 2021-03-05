import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedStack<E> implements Stack<E>{

    private int size;
    private Node<E> last;
    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element,Node<E> next) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    public LinkedStack(){
        size=0;
    }


    @Override
    public void push(E element) {
        Node<E> currentLast = last;
        Node<E> node = new Node<E>(currentLast, element, null);
        last = node;
        if(currentLast != null)
        currentLast.next = node;
        size++;
    }

    @Override
    public E pop() {
        Node<E> result = last;
        if (result == null)
            return null;
        E element = result.element;
        Node<E> prev = result.prev;
        result.element = null;
        result.prev = null;
        last = prev;
        if (prev != null)
            prev.next = null;
        size--;
        return element;
    }

    @Override
    public E peek() {
        Node<E> result = last;
       if(result == null) return null;
       return result.element;
    }

    @Override
    public boolean empty() {
        return size==0;
    }

    //По заданию это реализовывать не нужно
    @Override
    public int size() {
        return size;
    }


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }




}
