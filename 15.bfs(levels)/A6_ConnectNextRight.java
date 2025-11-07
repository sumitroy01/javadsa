import java.util.*;

class Node {
    int val;
    Node left, right, next;
    Node(int x) { val = x; }
}

public class A6_ConnectNextRight {
    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            Node prev = null;

            for (int i = 0; i < levelSize; i++) {
                Node curr = queue.poll();
                if (prev != null) {
                    prev.next = curr;
                }
                prev = curr;

                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }
        }

        return root;
    }

    // Optional: Print tree level-wise with next pointers
    public void printLevels(Node root) {
        Node levelStart = root;
        while (levelStart != null) {
            Node curr = levelStart;
            while (curr != null) {
                System.out.print(curr.val + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
            levelStart = levelStart.left;
        }
    }

    // Test
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        A6_ConnectNextRight obj = new A6_ConnectNextRight();
        obj.connect(root);
        obj.printLevels(root);
    }
}

