package main;

import implementation.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        //create binary search tree
        // and perform insert, search, traversal, delete
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.insert(50);
        myBinarySearchTree.insert(35);
        myBinarySearchTree.insert(70);
        myBinarySearchTree.insert(65);
        myBinarySearchTree.insert(90);
        myBinarySearchTree.insert(85);
        System.out.print("In Order = ");
        myBinarySearchTree.inOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.print("Pre Order = ");
        myBinarySearchTree.preOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.print("Post Order = ");
        myBinarySearchTree.postOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.print("Reverse in order = ");
        myBinarySearchTree.reverseInOrder(myBinarySearchTree.getRoot());
        System.out.println();
        myBinarySearchTree.delete(50);
        System.out.print("In Order = ");
        myBinarySearchTree.inOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.print("Post Order = ");
        myBinarySearchTree.postOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.print("Reverse in order = ");
        myBinarySearchTree.reverseInOrder(myBinarySearchTree.getRoot());
        System.out.println();
        System.out.println(myBinarySearchTree.search(85));
    }
}
