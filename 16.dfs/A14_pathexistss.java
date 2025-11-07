//path exixts in binary tree at any nodes

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A14_pathexistss {
    
    // Function to check if a path exists in binary tree with the given sum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Start DFS from the root node
        return dfs(root, targetSum);
    }
    
    // Helper function to perform DFS and check if path sum exists
    private boolean dfs(TreeNode node, int remainingSum) {
        // Base case: if node is null, return false
        if (node == null) {
            return false;
        }
        
        // Check if we've reached a leaf node
        if (node.left == null && node.right == null) {
            // If the remaining sum equals the node's value, return true
            return node.val == remainingSum;
        }
        
        // Recursively check the left and right subtrees with the reduced remaining sum
        return dfs(node.left, remainingSum - node.val) || dfs(node.right, remainingSum - node.val);
    }

    // Driver code to test
    public static void main(String[] args) {
        A14_pathexistss tree = new A14_pathexistss();
        
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
