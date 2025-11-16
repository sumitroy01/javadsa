class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A4_sortedarr_to_bst {
    
    // Function to convert the sorted array to a balanced binary search tree
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }
    
    // Helper function to recursively build the tree
    private TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // Find the middle element
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        node.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, right);

        return node;
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
        A4_sortedarr_to_bst tree = new A4_sortedarr_to_bst();
        
        // Creating a sorted array
        int[] nums = {-10, -3, 0, 5, 9};
        
        // Convert the sorted array to a balanced BST
        TreeNode root = tree.sortedArrayToBST(nums);
        
        System.out.println("Inorder Traversal of the BST: ");
        tree.inorder(root); // Output: -10 -3 0 5 9
    }
}
