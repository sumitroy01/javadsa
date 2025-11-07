class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class a2_mergelinkedlist {

    // Merge two sorted linked lists and return the head of the merged list
    public Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1); // Temporary starter node
        Node tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining nodes
        if (l1 != null) tail.next = l1;
        if (l2 != null) tail.next = l2;

        return dummy.next; // The real head is after dummy
    }

    // Utility to print list
    public void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Example usage
    public static void main(String[] args) {
        a2_mergelinkedlist
     listOps = new a2_mergelinkedlist
    ();

        // List 1: 1 → 3 → 5
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        // List 2: 2 → 4 → 6
        Node l2 = new Node(2);
        l2.next = new Node(4);
        l2.next.next = new Node(6);

        Node merged = listOps.merge(l1, l2);
        listOps.printList(merged);
    }
}
