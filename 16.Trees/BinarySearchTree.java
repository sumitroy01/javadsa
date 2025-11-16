// A simple Binary Search Tree (BST) in Java
public class BinarySearchTree {

    // Node class for each element in the BST
    static class Node {
        int value;         // The value of the node
        Node left, right;  // Left and right child nodes

        Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    // Root of the tree
    Node root;

    // Constructor to initialize an empty tree
    public BinarySearchTree() {
        root = null;
    }

    // Insert a new value into the BST
    public void insert(int value) {
        root = insertNode(root, value);
    }

    // Recursive function to insert a new value
    private Node insertNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertNode(current.left, value);
        } else if (value > current.value) {
            current.right = insertNode(current.right, value);
        }

        // If value is equal, do nothing (no duplicates allowed)
        return current;
    }

    // Inorder traversal (left → root → right)
    public void printInorder() {
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(Node current) {
        if (current != null) {
            inorderTraversal(current.left);
            System.out.print(current.value + " ");
            inorderTraversal(current.right);
        }
    }

    // Search for a value in the BST
    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(Node current, int value) {
        if (current == null) return false;

        if (value == current.value) return true;

        if (value < current.value) {
            return searchNode(current.left, value);
        } else {
            return searchNode(current.right, value);
        }
    }

    // Delete a value from the BST
    public void delete(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node current, int value) {
        if (current == null) return null;

        if (value < current.value) {
            current.left = deleteNode(current.left, value);
        } else if (value > current.value) {
            current.right = deleteNode(current.right, value);
        } else {
            // Node with only one child or no child
            if (current.left == null) return current.right;
            if (current.right == null) return current.left;

            // Node with two children:
            // Get the smallest value in the right subtree
            current.value = findMin(current.right);
            // Delete the smallest node in right subtree
            current.right = deleteNode(current.right, current.value);
        }

        return current;
    }

    // Find the minimum value in a subtree
    private int findMin(Node node) {
        int minValue = node.value;
        while (node.left != null) {
            node = node.left;
            minValue = node.value;
        }
        return minValue;
    }

    // Main function to test the BST
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert values into the BST
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Print the BST in inorder (sorted order)
        System.out.println("Inorder Traversal:");
        tree.printInorder();

        // Search for values
        System.out.println("\nSearch for 40: " + tree.search(40));
        System.out.println("Search for 90: " + tree.search(90));

        // Delete a node and show the new tree
        System.out.println("\nDeleting 20...");
        tree.delete(20);
        System.out.println("Inorder Traversal after deleting 20:");
        tree.printInorder();
    }
}


