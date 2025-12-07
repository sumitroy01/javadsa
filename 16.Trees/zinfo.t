|_________________________________|
|# Tree Data Structure in Java    |
|_________________________________|
### 🔍 **Basic Terminology**

- **Node**: Each element in the tree.
- **Root**: The topmost node of the tree.
- **Edge**: The connection between one node and another.
- **Parent**: A node that has a branch to one or more other nodes.
- **Child**: A node that descends from another node.
- **Leaf**: A node with no children.
- **Subtree**: A tree formed by a node and its descendants.
- **Height**: Length of the longest path from root to a leaf.
- **Depth**: Distance from the root node to the current node.

---

### 🌲 **Types of Trees**

1. **Binary Tree**  
   - Each node has **at most 2 children** (left and right).

2. **Binary Search Tree (BST)**  
   - Left child < Parent < Right child.
   - Fast lookup, insertion, deletion: **O(log n)** average time.

3. **Balanced Binary Trees**
   - Trees that keep height minimal for better performance.
   - Examples:
     - **AVL Tree**: Self-balancing BST.
     - **Red-Black Tree**: Used in Java `TreeMap` and `TreeSet`.

4. **N-ary Tree**  
   - Each node can have **at most N children**.

5. **Trie (Prefix Tree)**  
   - Used for **storing strings** efficiently (like autocomplete).

6. **Heap**
   - A complete binary tree:
     - **Min-heap**: Parent ≤ Children.
     - **Max-heap**: Parent ≥ Children.
   - Used in priority queues.

---

### ✅ **Tree Traversals**

1. **Depth First Search (DFS)**:
   - **Inorder (LNR)**: Left → Node → Right
   - **Preorder (NLR)**: Node → Left → Right
   - **Postorder (LRN)**: Left → Right → Node

2. **Breadth First Search (BFS)**:
   - **Level Order Traversal**: Node by level, left to right.

---

### 🔧 **Basic Java Tree Node Example**

```java
class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}
```

---

### 💡 **Use Cases of Trees in DSA**

- **Binary Search Tree**: Searching, insertion, deletion.
- **Heap**: Priority queues, heap sort.
- **Trie**: Autocomplete, spell check.
- **Segment Tree / Fenwick Tree**: Range queries.
- **Expression Trees**: Evaluate arithmetic expressions.
