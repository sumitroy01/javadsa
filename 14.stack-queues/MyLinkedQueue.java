class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class MyLinkedQueue {
    Node front, rear;

    // Enqueue
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Dequeue
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        return val;
    }

    // Peek
    public int peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Is Empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display
    public void display() {
        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        MyLinkedQueue q = new MyLinkedQueue();
        q.enqueue(100);
        q.enqueue(200);
        q.enqueue(300);
        q.display();         // Output: Queue: 100 200 300
        System.out.println(q.dequeue()); // Output: 100
        q.display();         // Output: Queue: 200 300
        System.out.println(q.peek());    // Output: 200
    }
}
