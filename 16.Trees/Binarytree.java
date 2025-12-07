import java.util.Scanner;

public class Binarytree {

    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int value) {
            this.val = value;
        }
    }

    private Node root;

    public void populate(Scanner scan) {
        System.out.println("Enter the value of root node:");
        int value = scan.nextInt();
        root = new Node(value);
        populate(scan, root);
    }

    private void populate(Scanner scan, Node node) {
        System.out.println("Do you want to enter the left child of " + node.val + "? (true/false)");
        boolean hasLeft = scan.nextBoolean();

        if (hasLeft) {
            System.out.println("Enter the value of the left node of " + node.val + ":");
            int leftVal = scan.nextInt();
            node.left = new Node(leftVal);
            populate(scan, node.left);
        }

        System.out.println("Do you want to enter the right child of " + node.val + "? (true/false)");
        boolean hasRight = scan.nextBoolean();

        if (hasRight) {
            System.out.println("Enter the value of the right node of " + node.val + ":");
            int rightVal = scan.nextInt();
            node.right = new Node(rightVal);
            populate(scan, node.right);
        }
    }

    // Optional: You could add a display method to print the tree.
    public void display() {
        display(root, "", true);
    }

    private void display(Node node, String indent, boolean isRight) {
        if (node == null) return;

        System.out.println(indent + (isRight ? "└── " : "├── ") + node.val);
        display(node.left, indent + (isRight ? "    " : "│   "), false);
        display(node.right, indent + (isRight ? "    " : "│   "), true);
    }

    // main method to run
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Binarytree tree = new Binarytree();
        tree.populate(scan);
        tree.display();
    }
}
