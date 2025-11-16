import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class A4_ZigzagTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            LinkedList<Integer> level = new LinkedList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                if (leftToRight) {
                    level.addLast(node.val);   // append at end
                } else {
                    level.addFirst(node.val);  // insert at beginning
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(level);
            leftToRight = !leftToRight;  // toggle direction
        }

        return result;
    }

    // Test
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        A4_ZigzagTraversal obj = new A4_ZigzagTraversal();
        List<List<Integer>> result = obj.zigzagLevelOrder(root);
        System.out.println("Zigzag level order: " + result);
    }
}
