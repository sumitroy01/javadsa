import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class A2_Average {
    public List<Double> a2_avgOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int count = queue.size();
            double sum = 0;

            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                sum += node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(sum / count);
        }

        return result;
    }

    // Test the code
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        A2_Average obj = new A2_Average();
        List<Double> averages = obj.a2_avgOfLevels(root);  // Corrected method call
        System.out.println("Average of levels: " + averages);
    }
}
