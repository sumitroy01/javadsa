import java.util.ArrayList;

public class Mins_heap<T extends Comparable<T>> {

    private ArrayList<T> heap;

    public Mins_heap() {
        heap = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = heap.get(first);
        heap.set(first, heap.get(second));
        heap.set(second, temp);
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int left(int index) {
        return (2 * index) + 1;
    }

    private int right(int index) {
        return (2 * index) + 2;
    }

    public void insert(T val) {
        heap.add(val);
        upheap(heap.size() - 1);
    }

    private void upheap(int index) {
        if (index == 0) return;
        int p = parent(index);
        if (heap.get(index).compareTo(heap.get(p)) < 0) {
            swap(index, p);
            upheap(p);
        }
    }

    public T remove() throws Exception {
        if (heap.isEmpty()) {
            throw new Exception("Removing from an empty heap");
        }
        T temp = heap.get(0);
        T last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            downheap(0);
        }
        return temp;
    }

    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < heap.size() && heap.get(min).compareTo(heap.get(left)) > 0) {
            min = left;
        }
        if (right < heap.size() && heap.get(min).compareTo(heap.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            downheap(min);
        }
    }

    
    public void delete(T val) {
        int index = heap.indexOf(val);
        if (index == -1) return;

        T last = heap.remove(heap.size() - 1);
        if (index < heap.size()) {
            heap.set(index, last);
            upheap(index);
            downheap(index);
        }
    }

    public void display() {
        System.out.println(heap);
    }

  
    public static void main(String[] args) throws Exception {
        Mins_heap<Integer> minHeap = new Mins_heap<>();
        minHeap.insert(10);
        minHeap.insert(20);
        minHeap.insert(30);
        minHeap.insert(22);
        minHeap.insert(18);
        minHeap.insert(5);
        minHeap.display(); // [3, 5, 20, 10]

        minHeap.display();
        System.out.println("Removed: " + minHeap.remove()); // 3
        minHeap.display(); // [5, 10, 20]

        minHeap.delete(10);
        minHeap.display(); // [5, 20]
    }


}
