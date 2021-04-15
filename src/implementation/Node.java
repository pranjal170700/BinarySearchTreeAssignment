package implementation;

import jdk.dynalink.NoSuchDynamicMethodException;
import myinterface.NodeADT;

public class Node<E extends Comparable<E>> implements NodeADT<E> {
    //complete node class
    private E data;
    private Node<E> left;
    private Node<E> right;
}
