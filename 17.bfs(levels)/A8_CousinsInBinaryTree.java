import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class A8_CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean foundX = false, foundY = false;

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                // Check if x and y are children of the same parent
                if (curr.left != null && curr.right != null) {
                    if ((curr.left.val == x && curr.right.val == y) ||
                        (curr.left.val == y && curr.right.val == x)) {
                        return false; // Same parent → not cousins
                    }
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                    if (curr.left.val == x) foundX = true;
                    if (curr.left.val == y) foundY = true;
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                    if (curr.right.val == x) foundX = true;
                    if (curr.right.val == y) foundY = true;
                }
            }

            // If both found at same level, and not siblings → cousins
            if (foundX && foundY) return true;

            // If only one found → not at same level
            if (foundX || foundY) return false;
        }

        return false;
    }

    // Test
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        A8_CousinsInBinaryTree obj = new A8_CousinsInBinaryTree();
        boolean result = obj.isCousins(root, 4, 5);
        System.out.println("Are 4 and 5 cousins? " + result);
    }
}
