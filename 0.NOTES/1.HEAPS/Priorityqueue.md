A **Priority Queue** is a special type of **queue** in which **each element has a priority**, and elements are served **based on priority**, **not just arrival order**.

---

## 🔑 Key Concepts

* **Normal Queue** → First-In-First-Out (FIFO)
* **Priority Queue** → Highest (or lowest) priority is served first

---

## ✅ Characteristics

| Feature           | Priority Queue                                    |
| ----------------- | ------------------------------------------------- |
| Ordering          | Based on priority                                 |
| Insertion         | Anywhere, but structure maintains order           |
| Removal (Dequeue) | Always removes the highest priority item          |
| Implementation    | Usually done with **heaps**                       |
| Use Cases         | Scheduling, Dijkstra’s algorithm, CPU task queues |

---

## 💡 Real-Life Example

Imagine an **emergency room**:

* Patients arrive and are added to the queue.
* But a patient with **severe injury** gets treated before one with a **mild cold**, regardless of arrival order.

That’s a **priority queue**.

---

## 🏗 How It Works Internally

### Common Implementations:

* **Binary Heap** (most common):

  * Max Heap → for **highest priority first**
  * Min Heap → for **lowest priority first**
* Other structures: Fibonacci Heap, Pairing Heap (for advanced scenarios)

---

## 🧪 Example

Suppose we insert tasks with different priorities:

```text
Task:    A   B   C   D
Priority: 4   2   5   1
```

### Using Max Priority Queue:

* Highest priority is 5 → order of execution: **C, A, B, D**

### Using Min Priority Queue:

* Lowest priority is 1 → order of execution: **D, B, A, C**

---

## 🧠 In Code (Conceptually)

```python
# In Python (min priority queue using heapq)
import heapq

pq = []
heapq.heappush(pq, (2, "task B"))
heapq.heappush(pq, (1, "task D"))
heapq.heappush(pq, (5, "task C"))
heapq.heappush(pq, (4, "task A"))

while pq:
    priority, task = heapq.heappop(pq)
    print(task)
```

Output:

```
task D
task B
task A
task C
```

---

## 🚀 Applications

* **CPU Scheduling** (higher priority processes first)
* **Dijkstra’s algorithm** (shortest path)
* **Event-driven simulation**
* **Data compression** (Huffman Coding)
* **A* Search Algorithm*\*

---

Let me know if you want the Java implementation or a diagram to visualize how priority queue works!
