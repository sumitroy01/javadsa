class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A7_kthsmallest_bst {
    
    // Variable to store the result
    private int count = 0;
    private int kthSmallestValue = -1;

    // Function to find the kth smallest element in the BST
    public int kthSmallest(TreeNode root, int k) {
        // Perform an in-order traversal and find the kth smallest element
        inorderTraversal(root, k);
        return kthSmallestValue;
    }

    // In-order traversal function
    private void inorderTraversal(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        
        // Traverse the left subtree
        inorderTraversal(root.left, k);
        
        // Increment the count of visited nodes
        count++;
        
        // If the count matches k, we found the kth smallest element
        if (count == k) {
            kthSmallestValue = root.val;
            return; // No need to traverse further
        }
        
        // Traverse the right subtree
        inorderTraversal(root.right, k);
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
        A7_kthsmallest_bst bst = new A7_kthsmallest_bst();
        
        // Creating a sample BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        int k = 3; // Let's find the 3rd smallest element

        // Finding the kth smallest element
        int kthSmallest = bst.kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}
