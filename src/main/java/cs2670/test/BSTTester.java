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
        System.out.println("inserted: 3, 12, 1");
        System.out.println("size: " + tree1.size());
        System.out.print("inorder(): ");
        tree1.inorder();
        System.out.print("preorder(): ");
        tree1.preorder();
        System.out.print("postorder(): ");
        tree1.postorder();

        System.out.println("delete(3)");
        tree1.delete(3);
        System.out.println("delete(17)");
        tree1.delete(17);
        System.out.println("size: " + tree1.size());
        System.out.println("postorder(): ");
        tree1.postorder();
        tree1.size();

        System.out.println("inserted: 21, 11");
        tree1.insert(21);
        tree1.insert(11);
        System.out.println("size: " + tree1.size());
        System.out.println("postorder(): ");
        tree1.postorder();

        System.out.println("\ntree2");
        BST tree2 = new BST();
        tree2.insert(27);
        tree2.insert(35);
        tree2.insert(3);
        tree2.insert(25);
        tree2.insert(45);
        tree2.insert(109);
        tree2.insert(13);
        tree2.insert(7);

        System.out.println("inserted: 27, 35, 3, 25, 45, 109, 13, 7");
        System.out.println("size: " + tree2.size());
        System.out.print("inorder(): ");
        tree2.inorder();
        System.out.print("preorder(): ");
        tree2.preorder();
        System.out.print("postorder(): ");
        tree2.postorder();

        System.out.println("delete(13)");
        tree2.delete(13);
        System.out.print("postorder(): ");
        tree2.postorder();
        System.out.println("size: " + tree2.size());
        System.out.println("delete(57)");
        tree2.delete(57);
        System.out.print("postorder(): ");
        tree2.postorder();
        System.out.println("size: " + tree2.size());

        System.out.println("inserted: 39, 1");
        tree2.insert(39);
        tree2.insert(1);
        System.out.println("size: " + tree2.size());
        System.out.println("postorder(): ");
        tree2.postorder();




    } // main







} // BSTTester
