public class Avl {
    private Node root;

    private class Node {
        int value;
        Node left, right;

        public Node(int val) {
            this.value = val;
        }
    }

    public void populate(int val) {
        root = insert(root, val);
    }

    private Node insert(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insert(current.left, value);
        } else if (value > current.value) {
            current.right = insert(current.right, value);
        } else {
            return current; // duplicate values not allowed
        }

        return balance(current);
    }

    private Node balance(Node node) {
        int balance = getBalance(node);

        // Left heavy
        if (balance > 1) {
            if (getBalance(node.left) < 0) {
                node.left = rotateLeft(node.left); // LR case
            }
            return rotateRight(node); // LL case
        }

        // Right heavy
        if (balance < -1) {
            if (getBalance(node.right) > 0) {
                node.right = rotateRight(node.right); // RL case
            }
            return rotateLeft(node); // RR case
        }

        return node;
    }

    private Node rotateRight(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        return y;
    }

    private int height(Node node) {
        if (node == null) return -1;
        return 1 + Math.max(height(node.left), height(node.right));
    }

    private int getBalance(Node node) {
        if (node == null) return 0;
        return height(node.left) - height(node.right);
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) return;
        display(node.left);
        System.out.println(node.value + "___");
        display(node.right);
    }

    public boolean search(int val) {
        return search(root, val);
    }

    private boolean search(Node node, int val) {
        if (node == null) return false;
        if (node.value == val) return true;
        return val < node.value ? search(node.left, val) : search(node.right, val);
    }

    public int height() {
        return height(root);
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private Node delete(Node node, int value) {
        if (node == null) return null;

        if (value < node.value) {
            node.left = delete(node.left, value);
        } else if (value > node.value) {
            node.right = delete(node.right, value);
        } else {
            // node to delete
            if (node.left == null || node.right == null) {
                node = (node.left != null) ? node.left : node.right;
            } else {
                int minValue = findMin(node.right);
                node.value = minValue;
                node.right = delete(node.right, minValue);
            }
            
        }

        if (node == null) return null;

        return balance(node);
    }

    private int findMin(Node node) {
        while (node.left != null) node = node.left;
        return node.value;
    }

    public static void main(String[] args) {
        Avl mytree = new Avl();
        mytree.populate(10);
        mytree.populate(12);
        mytree.populate(8);
        mytree.populate(6);
        mytree.populate(14);
        mytree.populate(9);
        mytree.display();
        System.out.println("Height: " + mytree.height());
        mytree.delete(8);
        System.out.println("After deletion:");
        mytree.display();
    }
}
