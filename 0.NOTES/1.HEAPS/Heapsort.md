**Heap Sort** is a **comparison-based sorting algorithm** that uses a **heap data structure** to sort elements.

It has:

* **Time Complexity**: `O(n log n)`
* **Space Complexity**: `O(1)` (in-place)
* **Sorting Order**: Can be used for **ascending** or **descending** order

---

## 🧠 How Heap Sort Works

It works in **two main phases**:

### ✅ Phase 1: Build a Max Heap

* Convert the unsorted array into a **Max Heap** (i.e., largest element at root).
* Time: O(n)

### ✅ Phase 2: Extract Elements One by One

* Repeatedly remove the **max element** (root of the heap), place it at the **end of the array**, and **heapify** the reduced heap.
* Do this until the heap is empty.
* Time: O(n log n)

---

## 🔁 Step-by-Step Example (Heap Sort in Ascending Order)

### Input array:

```
[4, 10, 3, 5, 1]
```

---

### Step 1: Build Max Heap

Turn it into a Max Heap:

```
[10, 5, 3, 4, 1]
```

Tree:

```
         10
        /  \
       5    3
      / \
     4   1
```

---

### Step 2: Sort by Extracting Max

#### Iteration 1:

* Swap root (10) with last element (1)
* Array: `[1, 5, 3, 4, 10]`
* Heapify first 4 elements → `[5, 4, 3, 1, 10]`

#### Iteration 2:

* Swap root (5) with index 3 (1)
* Array: `[1, 4, 3, 5, 10]`
* Heapify → `[4, 1, 3, 5, 10]`

#### Iteration 3:

* Swap root (4) with index 2 (3)
* Array: `[3, 1, 4, 5, 10]`
* Heapify → `[3, 1, 4, 5, 10]` (already heapified)

#### Iteration 4:

* Swap root (3) with 1
* Array: `[1, 3, 4, 5, 10]` (sorted!)

---

### ✅ Final Sorted Array:

```
[1, 3, 4, 5, 10]
```

---

## 🔄 Heap Sort Variants

| Heap Type | Sort Order    |
| --------- | ------------- |
| Max Heap  | Ascending ⬆️  |
| Min Heap  | Descending ⬇️ |

---

## 🛠 Applications of Heap Sort

* Sorting large datasets when memory usage is critical.
* Embedded systems where **O(1) space** is required.
* Real-time systems where **predictable performance** matters.

---

Would you like to see the **code implementation of heap sort in Python or Java**?
