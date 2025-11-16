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
    
    // Iterative DFS using Stack
    public void dfsIterative(TreeNode root) {
        if (root == null) {
            return;
        }
        
        // Create a stack to simulate the recursive call stack
        Stack<TreeNode> stack = new Stack<>();
        
        // Push the root node onto the stack
        stack.push(root);
        
        // While the stack is not empty, continue processing nodes
        while (!stack.isEmpty()) {
            // Pop a node from the stack
            TreeNode currentNode = stack.pop();
            
            // Process the current node (e.g., print its value)
            System.out.print(currentNode.val + " ");
            
            // Push the right and left children onto the stack (right first to ensure left is processed first)
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }
    }
    
    // Driver code to test DFS using stack
    public static void main(String[] args) {
        A15_DFS_stacks tree = new A15_DFS_stacks();
        
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        // Perform DFS using the stack (iterative approach)
        System.out.println("DFS (Iterative) Traversal:");
        tree.dfsIterative(root);
    }
}
