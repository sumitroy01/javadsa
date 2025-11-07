class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A11_sumtoleaf {
    
    // Function to calculate the sum of root-to-leaf numbers
    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }
    
    // Helper function to traverse the tree and calculate the sum
    private int sumNumbersHelper(TreeNode node, int currentSum) {
        // Base case: if the node is null, return 0 (no path)
        if (node == null) {
            return 0;
        }
        
        // Update the current sum by appending the current node's value
        currentSum = currentSum * 10 + node.val;
        
        // If the node is a leaf, return the current sum
        if (node.left == null && node.right == null) {
            return currentSum;
        }
        
        // Recursively calculate the sum for the left and right subtrees
        return sumNumbersHelper(node.left, currentSum) + sumNumbersHelper(node.right, currentSum);
    }

    // Driver code to test
    public static void main(String[] args) {
        A11_sumtoleaf tree = new A11_sumtoleaf();
        
        // Create a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        // Calculate the sum of root-to-leaf numbers
        int result = tree.sumNumbers(root);
        
        // Output the result
        System.out.println("Sum of root-to-leaf numbers: " + result);
    }
}
