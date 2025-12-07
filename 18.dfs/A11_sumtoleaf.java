class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A11_sumtoleaf {
    
   
    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root, 0);
    }
    
    private int sumNumbersHelper(TreeNode node, int currentSum) {
        if (node == null) {
            return 0;
        }
        
        currentSum = currentSum * 10 + node.val;
        
        if (node.left == null && node.right == null) {
            return currentSum;
        }
        
        return sumNumbersHelper(node.left, currentSum) + sumNumbersHelper(node.right, currentSum);
    }

    public static void main(String[] args) {
        A11_sumtoleaf tree = new A11_sumtoleaf();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        int result = tree.sumNumbers(root);
        
        System.out.println("Sum of root-to-leaf numbers: " + result);
    }
}
