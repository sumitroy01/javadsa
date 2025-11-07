//construct binary tree from inorder and preorder traversal

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A8_BinaryTree {
    
    // Function to build the tree from inorder and preorder traversal
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] preIndex = {0}; // To keep track of current index in preorder
        return buildTreeHelper(preorder, inorder, preIndex, 0, inorder.length - 1);
    }

    // Helper function to recursively build the tree
    private TreeNode buildTreeHelper(int[] preorder, int[] inorder, int[] preIndex, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null; // Base case: no elements to process
            
        }
        
        // The first element in preorder is the root
        int rootVal = preorder[preIndex[0]++];
        TreeNode root = new TreeNode(rootVal);
        
        // Find the index of the root in inorder
        int rootIndex = findIndex(inorder, inStart, inEnd, rootVal);
        
        // Recursively build the left and right subtrees
        root.left = buildTreeHelper(preorder, inorder, preIndex, inStart, rootIndex - 1);
                    root.right = buildTreeHelper(preorder, inorder, preIndex, rootIndex + 1, inEnd);
                    
                    return root;
    }

    // Function to find the index of a value in inorder
    private int findIndex(int[] inorder, int start, int end, int value) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == value) {
                return i;
            }
        }
        return -1;
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
        A8_BinaryTree tree = new A8_BinaryTree();
        
        // Sample inorder and preorder traversals
        int[] preorder = {5, 3, 2, 4, 8, 6, 9};
        int[] inorder = {2, 3, 4, 5, 6, 8, 9};
        
        // Construct the tree
        TreeNode root = tree.buildTree(preorder, inorder);
        
        // Print the tree using inorder traversal (should match the input inorder)
        System.out.println("Inorder traversal of the constructed tree:");
        tree.inorder(root);
    }
}
