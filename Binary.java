/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package adechandra.binary;

/**
 *
 * @author MI3 KOMPUTER
 */
public class Binary {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
    Node root = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    Node node5 = new Node(5);
    Node node6 = new Node(6);
    Node node7 = new Node(7);
    
    //set binary tree     
    root.setLeft(node2);
    node2.setLeft(node4);
    node2.setRight(node5);
    node5.setLeft(node7);
    root.setRight(node3);
    node3.setRight(node6);
    
    root.printInOrder(root);
    System.out.println("");
    root.printPostOrder(root);
    System.out.println("");
    root.printPreOrder(root);
    }
    
    
}
