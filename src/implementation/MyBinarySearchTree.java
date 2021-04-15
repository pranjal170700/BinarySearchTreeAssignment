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
        Node<E> node = new Node<>(data);
        if(isEmpty()){
            root = node;
        }
        else {
            Node<E> temp = root;
            Node<E> parent = null;
            while(temp != null) {
                parent = temp;
                if(data.compareTo(temp.getData()) <= 0){
                    temp = temp.getLeft();
                }
                else {
                    temp = temp.getRight();
                }
            }
            if(data.compareTo(parent.getData()) <= 0){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }
        }
    }

    private boolean isEmpty() {
        return root == null;
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
