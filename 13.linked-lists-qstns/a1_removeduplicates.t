class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class SortedLinkedList {
    Node head;

    // Removes duplicates from a sorted list
    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                // Skip the next node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
}





import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

public class UnsortedLinkedList {
    Node head;

    // Removes duplicates from an unsorted list
    public void removeDuplicates() {
        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node prev = null;

        while (current != null) {
            if (seen.contains(current.data)) {
                // Remove current node
                prev.next = current.next;
            } else {
                seen.add(current.data);
                prev = current;
            }
            current = current.next;
        }
    }
}


public void removeDuplicatesNoBuffer() {
    Node current = head;

    while (current != null) {
        Node runner = current;
        while (runner.next != null) {
            if (runner.next.data == current.data) {
                runner.next = runner.next.next;
            } else {
                runner = runner.next;
            }
        }
        current = current.next;
    }
}
