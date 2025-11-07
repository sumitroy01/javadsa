class MyQueue {
    int[] queue;
    int front, rear, size, capacity;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = queue[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        System.out.print("Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();         // Output: Queue: 10 20 30
        System.out.println(q.dequeue()); // Output: 10
        q.display();         // Output: Queue: 20 30
        System.out.println(q.peek());    // Output: 20
    }
}
