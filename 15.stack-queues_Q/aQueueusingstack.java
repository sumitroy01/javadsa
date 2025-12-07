import java.util.Stack;

class QueueUsingStacks {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStacks() {
        first = new Stack<>();
        second = new Stack<>();
    }

    // Enqueue
    public void add(int item) {
        first.push(item);
    }

    // Dequeue
    public int remove() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }

        return second.pop();
    }

    // Peek front item
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }

        return second.peek();
    }

    public boolean isEmpty() {
        return first.isEmpty() && second.isEmpty();
    }

    // Print queue in FIFO order
    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue (front -> rear): ");

        // Print from second stack (if any elements there)
        if (!second.isEmpty()) {
            for (int i = second.size() - 1; i >= 0; i--) {
                System.out.print(second.get(i) + " ");
            }
        }

        // Print from first stack
        for (int i = 0; i < first.size(); i++) {
            System.out.print(first.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.add(10);
        q.add(20);
        q.add(30);
        q.print(); // Output: 10 20 30

        System.out.println(q.remove()); // 10
        q.print(); // Output: 20 30

        q.add(40);
        q.print(); // Output: 20 30 40
    }
}
