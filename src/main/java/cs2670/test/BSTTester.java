package cs2670.test;

import cs2670.search.BST;

public class BSTTester {

    public static void main(String[] args) {

        System.out.println("\n--- BST Tester ---");
        System.out.println("tree1");
        BST tree1 = new BST();
        tree1.insert(3);
        tree1.insert(12);
        tree1.insert(1);
        System.out.print("inorder(): ");
        tree1.inorder();
        System.out.print("preorder(): ");
        tree1.preorder();
        System.out.print("postorder(): ");
        tree1.postorder();
        System.out.println("tree2");
        BST tree2 = new BST();
        tree2.insert(27);
        tree2.insert(35);
        tree2.insert(3);
        tree2.insert(25);
        tree2.insert(45);
        tree2.insert(109);
        tree2.insert(13);
        tree2.insert(7);
        System.out.print("inorder(): ");
        tree2.inorder();
        System.out.print("preorder(): ");
        tree2.preorder();
        System.out.print("postorder(): ");
        tree2.postorder();








    } // main







} // BSTTester
