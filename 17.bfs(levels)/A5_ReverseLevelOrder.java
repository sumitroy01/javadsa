import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class A5_ReverseLevelOrder {
    public List<Integer> reverseLevelOrder(TreeNode root) {
        LinkedList<Integer> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            // Add to front of result to reverse the order
            result.addFirst( node.val);

            // IMPORTANT: Enqueue right first, then left
            if (node.right != null) queue.offer(node.right);
            if (node.left != null) queue.offer(node.left);
        }

        return result;
    }

    // Test it
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        A5_ReverseLevelOrder obj = new A5_ReverseLevelOrder();
        List<Integer> output = obj.reverseLevelOrder(root);
        System.out.println("Reverse Level Order: " + output);
    }
}
