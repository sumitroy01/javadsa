import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class A7_RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            TreeNode rightmost = null;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();

                // Capture the rightmost node
                if (i == levelSize - 1) {
                    rightmost = node;
                }

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(rightmost.val);
        }

        return result;
    }

    // Test
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        A7_RightSideView obj = new A7_RightSideView();
        List<Integer> view = obj.rightSideView(root);
        System.out.println("Right Side View: " + view);
    }
}
