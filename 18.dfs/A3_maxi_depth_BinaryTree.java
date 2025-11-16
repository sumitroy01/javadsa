class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A3_maxi_depth_BinaryTree {
    
    // Function to calculate the maximum depth of the binary tree
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // Base case: if the tree is empty, depth is 0
        }
        
        // Recursively calculate the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // The maximum depth is the greater of the left and right subtree depths, plus 1 for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }

    // Function to print the tree (inorder traversal) for testing purposes
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Driver code to test
    public static void main(String[] args) {
        A3_maxi_depth_BinaryTree tree = new A3_maxi_depth_BinaryTree();
        
        // Creating a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Maximum Depth of the Tree: " + tree.maxDepth(root)); // Output: 3
    }
}
