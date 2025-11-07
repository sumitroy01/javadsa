Sure! Let's take a simple **Max Heap** stored in an array and visualize it as a **binary tree using ASCII**.

---

### 📦 Array Representation (1-based index):

Let's say the heap is:

```
Index:   1   2   3   4   5   6
Array: [90, 15, 10, 7, 12, 2]
```

Now let's visualize this as a **binary tree** using the formulas:

* Left child of `i`: `2 * i`
* Right child of `i`: `2 * i + 1`

---

### 🌲 Binary Tree (ASCII Diagram):

```
         90
       /    \
     15      10
    /  \     /
   7   12   2
```

---

### Breakdown:

* `90` is at index 1 → root
* `15` is at index 2 → left of 90
* `10` is at index 3 → right of 90
* `7` is at index 4 → left of 15
* `12` is at index 5 → right of 15
* `2` is at index 6 → left of 10

No right child for `10` because index `7` doesn’t exist.

---

If you want the **0-based index version** too, just let me know—it's slightly different in how children are calculated.

Want to try your own heap and I’ll draw it?
