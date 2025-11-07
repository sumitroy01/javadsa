class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public MyStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = value;
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    // Check if empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Display stack
    public void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    // Main for testing
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();          // Output: Stack: 10 20 30
        System.out.println(s.pop());   // Output: 30
        s.display();          // Output: Stack: 10 20
        System.out.println(s.peek());  // Output: 20
    }
}
