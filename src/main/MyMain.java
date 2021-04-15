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
    }
}
