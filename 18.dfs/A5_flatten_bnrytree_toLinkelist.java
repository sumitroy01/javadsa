class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A5_flatten_bnrytree_toLinkelist {

    // Function to flatten the binary tree to a linked list
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        
        // Recursively flatten the left subtree
        if (root.left != null) {
            flatten(root.left);
            
            // Store the right subtree
            TreeNode temp = root.right;
            
            // Move the left subtree to the right
            root.right = root.left;
            root.left = null;
            
            // Go to the end of the new right subtree (which was the left subtree)
            while (root.right != null) {
                
                root = root.right;
            }
            
            // Attach the original right subtree
            root.right = temp;
        }
        
        // Recursively flatten the right subtree
        flatten(root.right);
    }

    // Function to print the flattened tree (for testing purposes)
    public void printFlattened(TreeNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }

    // Driver code to test
    public static void main(String[] args) {
        A5_flatten_bnrytree_toLinkelist tree = new A5_flatten_bnrytree_toLinkelist();
        
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        
        System.out.println("Original Tree (Preorder Traversal): ");
        tree.printFlattened(root);  // Output: 1 2 3 4 5 6
        System.out.println();

        // Flatten the binary tree
        tree.flatten(root);

        System.out.println("Flattened Tree (Linked List form): ");
        tree.printFlattened(root);  // Output: 1 2 3 4 5 6
    }
}
