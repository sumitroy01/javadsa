import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class A15_DFS_stacks {
    
    public void dfsIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        
        Stack<TreeNode> stack = new Stack<>();
        
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            
            System.out.print(currentNode.val + " ");
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
    }
    
    public static void main(String[] args) {
        A15_DFS_stacks tree = new A15_DFS_stacks();
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        System.out.println("DFS (Iterative) Traversal:");
        tree.dfsIterative(root);
    }
}
