class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class A9_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    // Helper function to check if two trees are mirror images of each other
    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        

        
        // Check if values are the same and recursively check left subtree with right subtree
        return (left.val == right.val)
                && isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }

    // Test
    public static void main(String[] args) {
        A9_SymmetricTree obj = new A9_SymmetricTree();
        
        // Create a symmetric tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        // Check if the tree is symmetric
        boolean result = obj.isSymmetric(root);
        System.out.println("Is the tree symmetric? " + result);
    }
}
