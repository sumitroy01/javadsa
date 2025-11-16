class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class dynamicstack {
    private Node top;

    // Push
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = top.data;
        top = top.next;
        return val;
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

    // IsEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // Display
    public void display() {
        Node curr = top;
        System.out.print("Stack: ");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        dynamicstack s = new dynamicstack();
        s.push(100);
        s.push(200);
        s.push(300);
        s.display();          // Output: Stack: 300 200 100
        System.out.println(s.pop());  // Output: 300
        s.display();          // Output: Stack: 200 100
        System.out.println(s.peek()); // Output: 200
    }
}
