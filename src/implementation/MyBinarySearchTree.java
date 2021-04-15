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
        if(node != null){
            inOrder(node.getLeft());
            System.out.print(node.getData() + ", ");
            inOrder(node.getRight());
        }
    }

    @Override
    public void preOrder(Node<E> node) {
        if(node != null){
            System.out.print(node.getData() + ", ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    @Override
    public void postOrder(Node<E> node) {
        if(node != null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData() + ", ");
        }
    }

    @Override
    public void reverseInOrder(Node<E> node) {
        if(node != null){
            reverseInOrder(node.getRight());
            System.out.println(node.getData() + ", ");
            reverseInOrder(node.getLeft());
        }
    }

    @Override
    public void delete(E data) {
        Node<E> temp = root;
        Node<E> parent = null;
        while(temp != null){
            if(data.compareTo(temp.getData()) == 0){
                break;
            }
            else{
                parent = temp;
                if(data.compareTo(temp.getData()) < 0){
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
        }
        if(temp != null) {
            // case 1
            if(isLeaf(temp)){
                // root node
                if (parent == null){
                    root = null;
                }
                else{
                    if(data.compareTo(parent.getData()) < 0){
                        parent.setLeft(null);
                    }
                    else{
                        parent.setRight(null);
                    }
                }
            }
            // case 2
            // left child
            else if(hasLeftChild(temp)){
                // root node
                if(parent == null){
                    root = root.getLeft();
                }
                else{
                    if(data.compareTo(parent.getData()) < 0){
                        parent.setLeft(temp.getLeft());
                    }
                    else{
                        parent.setRight(temp.getLeft());
                    }
                }
            }
            // right child
            else if(hasRightChild(temp)){
                // root case
                if(parent == null){
                    root = root.getRight();
                }
                else{
                    if(data.compareTo(parent.getData()) < 0){
                        parent.setLeft(temp.getRight());
                    }
                    else {
                        parent.setRight(temp.getRight());
                    }
                }
            }
            // case 3
            else{
                Node<E> successor = getSuccessor(temp);
                // delete successor
                delete(successor.getData());
                successor.setLeft(temp.getLeft());
                successor.setRight(temp.getRight());
                // root case
                if(parent == null){
                    root = successor;
                }
                else{
                    if(data.compareTo(parent.getData()) < 0){
                        parent.setLeft(successor);
                    }
                    else{
                        parent.setRight(successor);
                    }
                }
            }
        }
        else{
            System.out.println("cannot delete");
        }
    }

    private boolean hasLeftChild(Node<E> temp) {
        return temp.getLeft() != null && temp.getRight() == null;
    }

    private boolean hasRightChild(Node<E> temp) {
        return temp.getRight() != null && temp.getLeft() == null;
    }

    private Node<E> getSuccessor(Node<E> temp) {
        Node<E> response = null;
        Node<E> tem = temp.getRight();
        while (tem.getLeft() != null) {
            tem = tem.getLeft();
        }
        response = tem;
        return response;
    }

    private boolean isLeaf(Node<E> temp) {
        return temp.getLeft() == null && temp.getRight() == null;
    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
}
