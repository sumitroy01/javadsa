class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A6_lowestcommonancestor_binarytree {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null; 
        }
        
        if (root == p || root == q) {
            return root;
        }
        
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        
        if (left != null && right != null) {
            return root;
        }
        
        return (left != null) ? left : right;
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
        A6_lowestcommonancestor_binarytree tree = new A6_lowestcommonancestor_binarytree();
        
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
        
        TreeNode lca = tree.lowestCommonAncestor(root, p, q);
        
        if (lca != null) {
            System.out.println("LCA of " + p.val + " and " + q.val + " is: " + lca.val);
        } else {
            System.out.println("LCA not found");
        }
    }
}
