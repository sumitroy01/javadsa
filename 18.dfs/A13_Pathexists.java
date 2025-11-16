//path exixts in binary tree from Root to leaf

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A13_Pathexists {
    
    // Function to check if a path exists from root to leaf with a given sum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: if the node is null, return false
        if (root == null) {
            return false;
        }
        
        // If it's a leaf node, check if the target sum equals the node's value
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        
        // Recursively check the left and right subtrees with the reduced target sum
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    // Driver code to test
    public static void main(String[] args) {
        A13_Pathexists tree = new A13_Pathexists();
        
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
        
        // Target sum to check
        int targetSum = 22;
        
        // Check if the path sum exists
        boolean result = tree.hasPathSum(root, targetSum);
        
        // Output the result
        System.out.println("Path exists with sum " + targetSum + ": " + result);
    }
}
