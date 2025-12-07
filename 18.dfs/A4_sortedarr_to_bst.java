class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A4_sortedarr_to_bst {
    
    // function to convert the sorted array to a balanced binary search tree
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }
    
    
    private TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[mid]);

       
        node.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, right);

        return node;
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

 
    public static void main(String[] args) {
        A4_sortedarr_to_bst tree = new A4_sortedarr_to_bst();
        
    
        int[] nums = {-10, -3, 0, 5, 9};
        
        
        TreeNode root = tree.sortedArrayToBST(nums);
        
        System.out.println("Inorder Traversal of the BST: ");
        tree.inorder(root); 
    }
}
