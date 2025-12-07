class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A3_maxi_depth_BinaryTree {
    
    // function to calculate the maximum depth of the binary tree
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
      
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
    
        return Math.max(leftDepth, rightDepth) + 1;
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
        A3_maxi_depth_BinaryTree tree = new A3_maxi_depth_BinaryTree();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Maximum Depth of the Tree: " + tree.maxDepth(root)); 
    }
}
