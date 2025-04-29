public class DLL {
    private int size;
    private Node head;
    private Node tail;

    public DLL() {
        this.size = 0;
    }

    private class Node {
        private Node prev;
        private Node next;
        private int value;

        public Node(Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    public void setFirst(int val) {
        Node node = new Node(null, head, val);
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void setLast(int val) {
        if (size == 0) {
            setFirst(val);
            return;
        }
        Node node = new Node(tail, null, val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void setAt(int index, int val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            setFirst(val);
            return;
        }

        if (index == size) {
            setLast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(temp, temp.next, val);
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    public void show() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void showReverse() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DLL myl = new DLL();
        myl.setFirst(10);
        myl.setFirst(12);
        myl.setFirst(18);
        myl.setFirst(30);
        myl.setLast(99);
        myl.setAt(2, 77); // Inserting at index 2

        myl.show();          // Forward display
        myl.showReverse();   // Reverse display
    }
}
