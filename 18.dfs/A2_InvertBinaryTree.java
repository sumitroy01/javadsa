class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A2_InvertBinaryTree {
    
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        invertTree(root.left);
        invertTree(root.right);
        
        return root;
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
        A2_InvertBinaryTree tree = new A2_InvertBinaryTree();
        
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
