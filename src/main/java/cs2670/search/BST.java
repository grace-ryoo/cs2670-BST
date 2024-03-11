package cs2670.search;

public class BST {

    private Node root;
    private int counter;

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

    } // insert

    public void delete(int element) {

    } // delete

    public void preorder() {

    } // preorder

    public void postorder() {


    } // postorder

    public void inorder() {

    } // inorder

} // BST
