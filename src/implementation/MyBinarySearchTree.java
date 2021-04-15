package implementation;

import myinterface.BinarySearchTreeADT;

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
        boolean response = false;
        Node<E> temp = root;
        while(temp != null){
            if(searchElement.compareTo(temp.getData()) == 0){
                response = true;
                break;
            }
            else if(searchElement.compareTo(temp.getData()) < 0){
                temp = temp.getLeft();
            }
            else{
                temp = temp.getRight();
            }
        }
        return response;
    }

    @Override
    public void inOrder(Node<E> node) {
    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
