import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class A3_LevelOrderSuccessor {

    public static TreeNode findSuccessor(TreeNode root, int key) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
       
            TreeNode current = queue.poll();

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);

            
            if (current.val == key) {
                break;
            }
        }

     
        return queue.peek();  
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int key = 20;
        TreeNode successor = findSuccessor(root, key);
        if (successor != null) {
            System.out.println("Level order successor of " + key + " is: " + successor.val);
        } else {
            System.out.println("No successor found for " + key);
        }
    }
}
