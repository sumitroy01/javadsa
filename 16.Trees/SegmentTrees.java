public class SegmentTrees {

    private static class Node {
        int startInterval, endInterval, value;
        Node left, right;

        public Node(int start, int end) {
            this.startInterval = start;
            this.endInterval = end;
        }
    }

    private Node root;

    public SegmentTrees(int[] arr) {
        root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.value = arr[start];
            return leaf;
        }

        int mid = start + (end - start) / 2;
        Node node = new Node(start, end);
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);
        node.value = node.left.value + node.right.value;

        return node;
    }

    public int rangeBetween(int left, int right) {
        return rangeBetween(root, left, right);
    }

    private int rangeBetween(Node node, int left, int right) {
        if (node == null || right < node.startInterval || left > node.endInterval) {
            return 0; // No overlap
        }

        if (left <= node.startInterval && node.endInterval <= right) {
            return node.value; // Total overlap
        }

        // Partial overlap
        int leftSum = rangeBetween(node.left, left, right);
        int rightSum = rangeBetween(node.right, left, right);
        return leftSum + rightSum;
    }

    public void print() {
        print(root);
    }

    private void print(Node current) {
        if (current != null) {
            print(current.left);
            System.out.println("[" + current.startInterval + ", " + current.endInterval + "] = " + current.value);
            print(current.right);
        }
    }

    public static void main(String[] args) {
        int[] myArr = {3, 8, 7, -2, -8, 4, 9};
        SegmentTrees tree = new SegmentTrees(myArr);
        tree.print(); // Optional visualization
        System.out.println("Sum from index 2 to 5 = " + tree.rangeBetween(2, 5));
    }
}
