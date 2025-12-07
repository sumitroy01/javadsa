class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A12_maximum_pathsum {
    
    private int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        maxPathSumHelper(root);
        return maxSum;
    }
    
    private int maxPathSumHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int left = Math.max(0, maxPathSumHelper(node.left)); 
        int right = Math.max(0, maxPathSumHelper(node.right)); 
        
        maxSum = Math.max(maxSum, node.val + left + right);
        
        return node.val + Math.max(left, right);
    }

    public static void main(String[] args) {
        A12_maximum_pathsum tree = new A12_maximum_pathsum();
        
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        int result = tree.maxPathSum(root);
        
        System.out.println("Maximum path sum: " + result);
    }
}
