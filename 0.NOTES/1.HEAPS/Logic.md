Great question!

I used `ArrayList` in the Min Heap implementation for **convenience** and **dynamic resizing**, but let's break down the reasoning and alternatives:

---

### ✅ Why `ArrayList`?

1. **Dynamic Size:**

   * A heap is typically a **binary tree**, and it's efficiently implemented using an **array-based structure**.
   * `ArrayList` grows dynamically, so you don’t have to manually handle resizing as you would with a plain array (`int[]`).

2. **Random Access:**

   * Heaps require frequent **index-based access** (e.g., to parent, left child, right child).
   * `ArrayList` provides O(1) time access to elements using `get(index)` and `set(index)`.

3. **Ease of Use:**

   * No need to predefine the maximum capacity.
   * Simplifies the code — especially for beginners or academic/demo purposes.

---

### ❌ Why NOT a normal array (`int[]`)?

* Fixed size: You have to guess or define a max size beforehand.
* Manual resizing: You’ll need to create a new array and copy elements when full.
* More code: Increases complexity, especially when trying to focus on heap logic.

---

### 🆚 `ArrayList` vs `int[]` Example

#### Using `int[]` (Fixed-size):

```java
int[] heap = new int[100]; // need to guess max size
int size = 0;
```

#### Using `ArrayList` (Dynamic):

```java
ArrayList<Integer> heap = new ArrayList<>();
```

---

### 🔄 Alternative: Use `PriorityQueue` (Java’s built-in Min Heap)

If you're okay with Java’s built-in structure:

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
minHeap.add(10);
minHeap.add(3);
System.out.println(minHeap.peek()); // 3
minHeap.poll(); // removes 3
```

But you lose control over the internal structure and customization.

---

### ✅ Summary

| Feature                     | `ArrayList` | `int[]`        | `PriorityQueue` |
| --------------------------- | ----------- | -------------- | --------------- |
| Resizable                   | ✅ Yes       | ❌ No           | ✅ Yes           |
| Easy to manage indices      | ✅ Yes       | ✅ Yes          | ❌ Hidden        |
| Manual memory management    | ❌ No        | ✅ Yes (needed) | ❌ No            |
| Control over implementation | ✅ Full      | ✅ Full         | ❌ Minimal       |

---

Let me know if you want the heap implemented using `int[]` instead!
