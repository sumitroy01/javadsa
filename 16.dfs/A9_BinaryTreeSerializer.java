import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
    }
}

public class A9_BinaryTreeSerializer {
    
    // Serialize the binary tree to a string
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }

    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append("null,");
            return;
        }
        sb.append(root.val).append(",");
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    // Deserialize the string back to binary tree
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(nodes));
        return deserializeHelper(queue);
    }

    private TreeNode deserializeHelper(Queue<String> queue) {
        if (queue.isEmpty()) return null;
        String val = queue.poll();
        if (val.equals("null")) return null;

        TreeNode node = new TreeNode(Integer.parseInt(val));
        node.left = deserializeHelper(queue);
        node.right = deserializeHelper(queue);
        return node;
    }

    // For testing: Inorder traversal print
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // Main function to test
    public static void main(String[] args) {
        A9_BinaryTreeSerializer treeUtil = new A9_BinaryTreeSerializer();

        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        // Serialize the tree
        String serialized = treeUtil.serialize(root);
        System.out.println("Serialized Tree: " + serialized);

        // Deserialize the tree
        TreeNode newRoot = treeUtil.deserialize(serialized);
        System.out.print("Inorder of Deserialized Tree: ");
        treeUtil.inorder(newRoot);
    }
}
