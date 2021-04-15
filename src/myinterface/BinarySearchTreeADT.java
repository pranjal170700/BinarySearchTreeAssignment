package myinterface;

public interface BinarySearchTreeADT<E extends Comparable<E>> {
    void insert(E data);
    boolean search(E searchElement);
    void inOrder(NodeADT<E> node);
    void preOrder(NodeADT<E> node);
    void postOrder(NodeADT<E> node);
    void reverseInOrder(NodeADT<E> node);
    void delete(E data);
    int height(NodeADT<E> node);
}
