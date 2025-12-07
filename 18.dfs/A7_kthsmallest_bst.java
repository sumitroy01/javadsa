class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A7_kthsmallest_bst {
    
    private int count = 0;
    private int kthSmallestValue = -1;

    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return kthSmallestValue;
    }

    private void inorderTraversal(TreeNode root, int k) {
        if (root == null) {
            return;
        }
        
        inorderTraversal(root.left, k);
        
        count++;
        
        if (count == k) {
            kthSmallestValue = root.val;
            return; 
        }
        
        inorderTraversal(root.right, k);
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
        A7_kthsmallest_bst bst = new A7_kthsmallest_bst();
        
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        int k = 0; 

        int kthSmallest = bst.kthSmallest(root, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}
