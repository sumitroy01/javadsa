class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A5_flatten_bnrytree_toLinkelist {

    // function to flatten the binary tree to a linked list
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        
        
        if (root.left != null) {
            flatten(root.left);
            
            TreeNode temp = root.right;
            
            root.right = root.left;
            root.left = null;
            
            while (root.right != null) {
                
                root = root.right;
            }
            
            root.right = temp;
        }
        
        flatten(root.right);
    }

    public void printFlattened(TreeNode root) {
        while (root != null) {
            System.out.print(root.val + " ");
            root = root.right;
        }
    }

    public static void main(String[] args) {
        A5_flatten_bnrytree_toLinkelist tree = new A5_flatten_bnrytree_toLinkelist();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        
        System.out.println("Original Tree (Preorder Traversal): ");
        tree.printFlattened(root);  
        System.out.println();

        tree.flatten(root);

        System.out.println("Flattened Tree (Linked List form): ");
        tree.printFlattened(root);
    }
}
