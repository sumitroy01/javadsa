class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A2_InvertBinaryTree {
    
    // Function to invert the binary tree
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
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
        A2_InvertBinaryTree tree = new A2_InvertBinaryTree();
        
        // Creating a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Original Tree (Inorder Traversal): ");
        tree.inorder(root); // Output: 4 2 5 1 3
        System.out.println();
        
        // Invert the tree
        tree.invertTree(root);
        
        System.out.println("Inverted Tree (Inorder Traversal): ");
        tree.inorder(root); // Output: 3 1 5 2 4
    }
}
