package implementation;

import jdk.dynalink.NoSuchDynamicMethodException;
import myinterface.NodeADT;

public class Node<E extends Comparable<E>> implements NodeADT<E> {
    //complete node class
    private E data;
    private Node<E> left;
    private Node<E> right;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }
}
