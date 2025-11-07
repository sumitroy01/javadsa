class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A1_Diamteter {
    // Variable to store the maximum diameter
    private int diameter = 0;

    // Function to calculate the diameter of the binary tree
    public int diameterOfBinaryTree(TreeNode root) {
        // Call the helper function to start the DFS
        dfs(root);
        return diameter;
    }

    // Helper function for DFS traversal
    
    private int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }

        // Recursively find the height of left and right subtrees
        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        // The diameter at the current node is the sum of left and right heights
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return the height of the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Driver code to test
    public static void main(String[] args) {
        A1_Diamteter tree = new A1_Diamteter();
        
        // Creating a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calling the function to find the diameter
        System.out.println("Diameter of the tree: " + tree.diameterOfBinaryTree(root));
    }
}
