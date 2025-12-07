class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A1_Diamteter {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter;
    }

    
    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        A1_Diamteter tree = new A1_Diamteter();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the tree: " + tree.diameterOfBinaryTree(root));
    }
}
