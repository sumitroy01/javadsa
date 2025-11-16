class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A6_lowestcommonancestor_binarytree {
    
    // Function to find the LCA of two nodes in a binary tree
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null; // If the root is null, return null
        }
        
        // If the current node matches one of the nodes, return it
        if (root == p || root == q) {
            return root;
        }
        
        // Recursively find the LCA in the left and right subtrees
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        // If both left and right subtrees contain one of the nodes, root is the LCA
        if (left != null && right != null) {
            return root;
        }
        
        // Otherwise, return the non-null subtree result
        return (left != null) ? left : right;
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
        A6_lowestcommonancestor_binarytree tree = new A6_lowestcommonancestor_binarytree();
        
        // Creating a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        
        TreeNode p = root.left;  // Node with value 5
        TreeNode q = root.left.right.right;  // Node with value 4
        
        // Finding the LCA of nodes 5 and 4
        TreeNode lca = tree.lowestCommonAncestor(root, p, q);
        
        if (lca != null) {
            System.out.println("LCA of " + p.val + " and " + q.val + " is: " + lca.val);
        } else {
            System.out.println("LCA not found");
        }
    }
}
