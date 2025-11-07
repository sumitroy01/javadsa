Perfect! Let’s now go over **deletion** (i.e., **extracting the max from a Max Heap** or the **min from a Min Heap**), step-by-step with diagrams.

---

## 🔺 Deleting from a Max Heap (Extract Max)

### Initial Max Heap:

Array: `[90, 15, 20, 7, 12, 2, 10]`

Tree:

```
         90
       /    \
     15      20
    /  \     /  \
   7   12   2   10
```

### Step 1: Remove Root (`90`)

* Replace root with the **last element** (`10`)
* New array (before heapify): `[10, 15, 20, 7, 12, 2]`

Tree:

```
         10
       /    \
     15      20
    /  \     /
   7   12   2
```

### Step 2: Heapify Down

* Compare `10` with its children `15` and `20`
* Max child is `20` → swap `10` and `20`

New array: `[20, 15, 10, 7, 12, 2]`

Tree:

```
         20
       /    \
     15      10
    /  \     /
   7   12   2
```

✅ Done!

---

## 🔻 Deleting from a Min Heap (Extract Min)

### Initial Min Heap:

Array: `[1, 3, 2, 5, 10, 7, 4]`

Tree:

```
         1
       /   \
     3       2
    / \     / \
   5  10   7   4
```

### Step 1: Remove Root (`1`)

* Replace with the last element (`4`)
* New array: `[4, 3, 2, 5, 10, 7]`

Tree:

```
         4
       /   \
     3       2
    / \     /
   5  10   7
```

### Step 2: Heapify Down

* `4` has children `3` and `2`
* Min child is `2` → swap `4` and `2`

New array: `[2, 3, 4, 5, 10, 7]`

Tree:

```
         2
       /   \
     3       4
    / \     /
   5  10   7
```

✅ Done!

---

Would you like the **Java or Python code** for insert and delete in a heap next?
