//level wise traversal of a binary tree

import java.util.LinkedList;
import java.util.Queue;

// Definition of a binary tree node
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class A1_bfs {

    // Function to perform level-order traversal
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll(); // Remove the front node
            System.out.print(node.data + " ");

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public static void main(String[] args) {
        /*
              1
            /   \
           2     3
          / \   / \
         4   5 6   7
        */

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        System.out.println("Level-order traversal of binary tree:");
        levelOrderTraversal(root);
    }
}
