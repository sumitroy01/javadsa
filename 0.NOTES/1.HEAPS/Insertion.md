Great! Let's go through **inserting a value into both a Max Heap and a Min Heap** with step-by-step ASCII diagrams.

---

## ✅ Rules Recap

When inserting:

1. Add the element to the **end** of the array (bottom of the tree).
2. **Heapify up** (aka "bubble up") to restore the heap property.

* In a **Max Heap**, parent must be **greater than or equal to** children.
* In a **Min Heap**, parent must be **less than or equal to** children.

---

## 🔺 Max Heap Insertion

### Original Heap Array:

```
[90, 15, 10, 7, 12, 2]
```

### Tree:

```
         90
       /    \
     15      10
    /  \     /
   7   12   2
```

### Step 1: Insert `20` at the end

New array:

```
[90, 15, 10, 7, 12, 2, 20]
```

Tree:

```
         90
       /    \
     15      10
    /  \     /  \
   7   12   2   20
```

### Step 2: Heapify Up

* `20` at index 7 → parent is `10` at index 3.
* `20 > 10` → **swap**

New array:

```
[90, 15, 20, 7, 12, 2, 10]
```

Tree:

```
         90
       /    \
     15      20
    /  \     /  \
   7   12   2   10
```

* `20` now at index 3 → parent is `90` at index 1 → no more swaps.

✅ Done!

---

## 🔻 Min Heap Insertion

### Original Min Heap:

```
[2, 3, 4, 5, 10, 7]
```

### Tree:

```
         2
       /   \
     3       4
    / \     /
   5  10   7
```

### Step 1: Insert `1` at the end

New array:

```
[2, 3, 4, 5, 10, 7, 1]
```

Tree:

```
         2
       /   \
     3       4
    / \     / \
   5  10   7   1
```

### Step 2: Heapify Up

* `1` at index 7 → parent is `4` at index 3.
* `1 < 4` → **swap**

New array:

```
[2, 3, 1, 5, 10, 7, 4]
```

Tree:

```
         2
       /   \
     3       1
    / \     / \
   5  10   7   4
```

* `1` now at index 3 → parent is `2` → `1 < 2` → **swap again**

New array:

```
[1, 3, 2, 5, 10, 7, 4]
```

Final Tree:

```
         1
       /   \
     3       2
    / \     / \
   5  10   7   4
```

✅ Done!

---

Let me know if you want a visual for deletion (extracting max/min) or code for heap insertion.
