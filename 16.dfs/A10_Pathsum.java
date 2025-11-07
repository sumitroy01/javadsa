class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A10_Pathsum {
    
    // Function to check if there is a root-to-leaf path with a given sum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: If the tree is empty
        if (root == null) {
            return false;
        }
        
        // Subtract the current node's value from targetSum
        targetSum -= root.val;
        
        // If the node is a leaf, check if the targetSum becomes 0
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        
        // Recursively check the left and right subtree
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }

    // Driver code to test
    public static void main(String[] args) {
        A10_Pathsum tree = new A10_Pathsum();
        
        // Create a sample tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);
        
        int targetSum = 22;
        
        // Check if the tree has a path with the given sum
        boolean result = tree.hasPathSum(root, targetSum);
        
        System.out.println("Does the tree have a path with sum " + targetSum + "? " + result);
    }
}
