package cs2670.search;

import java.util.LinkedList;
import java.util.ListIterator;

public class BST {

    private Node root;
    private int counter;
    private LinkedList<Integer> inordered;
    private LinkedList<Integer> preordered;
    private LinkedList<Integer> postordered;

    private class Node {

        private int key;
        private Node parent;
        private Node leftChild;
        private Node rightChild;

        public Node() {
            this.key = -1;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        public Node(int key) {
            this.key = key;
            this.parent = null;
            this.leftChild = null;
            this.rightChild = null;
        }

        public Node(int key, Node parent, Node leftChild, Node rightChild) {
            this.key = key;
            this.parent = parent;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

        public void setKey(int key) {
            this.key = key;
        } // setKey

        public void setParent(Node parent) {
            this.parent = parent;
        } // setParent

        public void setLeftChild(Node leftChild) {
            this.leftChild = leftChild;
        } // setLeftChild

        public void setRightChild(Node rightChild) {
            this.rightChild = rightChild;
        } // setRightChild

        public int getKey() {
            return this.key;
        } // getKey

        public Node getParent() {
            return this.parent;
        } // getParent

        public Node getLeftChild() {
            return this.leftChild;
        } // getLeftChild

        public Node getRightChild() {
            return this.rightChild;
        } // getRightChild

    } // Node

    public BST() {
        this.root = null;
        this.counter = 0;
    }

    public int size() {
        return this.counter;
    } // size

    public void insert(int element) {
        if (element >= 0) {
            this.root = insertRecursively(this.root, element);
        } else {
            throw new IndexOutOfBoundsException("Cannot insert negative numbers");
        } // if
    } // insert

    private Node insertRecursively(Node position, int element) {
        if (position == null) {
            return new Node(element);
        } // if

        if (element < position.getKey()) { // element is less than
            position.leftChild = insertRecursively(position.getLeftChild(), element);
        } else if (element == position.getKey()) { // element is equal
            throw new IllegalArgumentException("Element is already in the tree!");
        } else { // element is greater than
            position.rightChild = insertRecursively(position.getRightChild(), element);
        } // if

        this.counter++;
        return position;
    } // insertRecursively

    public void delete(int element) {
        this.root = deleteRecursively(this.root, element);
    } // delete

    private Node deleteRecursively(Node position, int element) {
        if (position == null) {
            return null;
        } // if

        if (element < position.getKey()) { // element is less than
            position.leftChild = deleteRecursively(position.getLeftChild(), element);
        } else if (element == position.getKey()) { // element to delete
            if (position.getLeftChild() == null && position.getRightChild() == null) { // leaf node
                return null;
            } else if (position.getLeftChild() == null) { // only has right child node
                return position.getRightChild();
            } else if (position.getRightChild() == null) { // only has left child node
                return position.getLeftChild();
            } else { // has both children nodes, must reallocate positions
                Node temporary = position.getRightChild();
                while (temporary != null) {
                    temporary = temporary.getLeftChild();
                } // while
                position = temporary;
                return position;
            } // if
        } else { // element is greater than
            position.rightChild = deleteRecursively(position.getRightChild(), element);
        } // if

        this.counter--;
        return position;

    } // deleteRecursively

    public void preorder() {
        preordered = new LinkedList<>();
        preorderRecursively(this.root, preordered);
        ListIterator<Integer> it = preordered.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            } // if
        } // while
        System.out.println();
    } // preorder

    private void preorderRecursively(Node position, LinkedList<Integer> list) {
        if (position != null) {
            list.add(position.getKey());
            preorderRecursively(position.getLeftChild(), list);
            preorderRecursively(position.getRightChild(), list);
        } // if
    } // preorderRecursively

    public void postorder() {
        postordered = new LinkedList<>();
        postorderRecursively(this.root, postordered);
        ListIterator<Integer> it = postordered.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            } // if
        } // while
        System.out.println();
    } // postorder

    private void postorderRecursively(Node position, LinkedList<Integer> list) {
        if (position != null) {
            postorderRecursively(position.getLeftChild(), list);
            postorderRecursively(position.getRightChild(), list);
            list.add(position.getKey());
        } // if
    } // postorderRecursively


    public void inorder() {
        inordered = new LinkedList<>();
        inorderRecursively(this.root, inordered);
        ListIterator<Integer> it = inordered.listIterator();
        while (it.hasNext()) {
            System.out.print(it.next());
            if (it.hasNext()) {
                System.out.print(", ");
            } // if
        } // while
        System.out.println();
    } // inorder

    private void inorderRecursively(Node position, LinkedList<Integer> list) {
        if (position != null) {
            inorderRecursively(position.getLeftChild(), list);
            list.add(position.getKey());
            inorderRecursively(position.getRightChild(), list);
        } // if
    } // inorderRecursively

} // BST
