

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;
}

public class MainTree {
    static Node root = null;

    static Node getNode(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }

    static Node insertNode(Node root, int val) {
        if (root == null) {
            return getNode(val);
        }
        if (root.data < val) {
            root.right = insertNode(root.right, val);
        }
        if (root.data > val) {
            root.left = insertNode(root.left, val);
        }
        return root;
    }
    
  
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data, ch;
        
        
     
        
    	System.out.println("1.insert a new node.");
        System.out.println("2.Inorder Traversal.");
        System.out.println("3.Preorder Traversal.");
        System.out.println("4.Postorder Traversal.");
        System.out.println("5.Exit");
        do {
        
            System.out.println("\nSelect one of the operations:");
            ch = sc.nextInt();
            switch (ch) {
            case 1:
                System.out.print("\nEnter the value to be inserted\n");
                data = sc.nextInt();
                root = insertNode(root, data);
                break;
            case 2:
                System.out.println("\nInorder Traversal ");
                inorder(root);
                break;
            case 3:
                System.out.println("\nPreorder Traversal ");
                preorder(root);
                break;
            case 4:
                System.out.println("\nPostorder Traversal ");
                postorder(root);
                break;
                
            case 5 :
            	return;
            	
            default:
                System.out.println("Wrong Choice");
                break;
            }
        } while (ch != 5);

        sc.close();
    }
}