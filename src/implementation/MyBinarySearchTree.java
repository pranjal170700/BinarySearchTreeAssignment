package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.NodeADT;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private Node<E> root;

    public Node<E> getRoot() {
        return root;
    }

    @Override
    public void insert(E data) {

    }

    @Override
    public boolean search(E searchElement) {
        return false;
    }

    @Override
    public void inOrder(NodeADT<E> node) {

    }

    @Override
    public void preOrder(NodeADT<E> node) {

    }

    @Override
    public void postOrder(NodeADT<E> node) {

    }

    @Override
    public void reverseInOrder(NodeADT<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(NodeADT<E> node) {
        return 0;
    }
}
