class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A12_maximum_pathsum {
    
    // This will store the global maximum sum
    private int maxSum = Integer.MIN_VALUE;
    
    // Function to calculate the maximum path sum
    public int maxPathSum(TreeNode root) {
        // Call the helper function that computes the max path sum
        maxPathSumHelper(root);
        return maxSum;
    }
    
    // Helper function to compute the max path sum for each node
    private int maxPathSumHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        // Recurse on the left and right subtrees
        int left = Math.max(0, maxPathSumHelper(node.left));  // If negative, consider 0 (don't include the left child)
        int right = Math.max(0, maxPathSumHelper(node.right));  // If negative, consider 0 (don't include the right child)
        
        // Update the global maximum sum by considering the path that passes through the current node
        maxSum = Math.max(maxSum, node.val + left + right);
        
        // Return the maximum sum path extending upwards (must include the node itself)
        return node.val + Math.max(left, right);
    }

    // Driver code to test
    public static void main(String[] args) {
        A12_maximum_pathsum tree = new A12_maximum_pathsum();
        
        // Create a sample tree
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        // Calculate the maximum path sum
        int result = tree.maxPathSum(root);
        
        // Output the result
        System.out.println("Maximum path sum: " + result);
    }
}
