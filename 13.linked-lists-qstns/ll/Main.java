public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        MyLinkedList list = new MyLinkedList();

        list.addAtHead(50);
        list.addAtHead(40);
        list.addAtHead(40);
        list.addAtHead(30);
        list.addAtHead(30);
        list.addAtHead(20);
        list.addAtHead(10);
        list.addAtHead(10);
        list.addAtHead(10);
    
        System.out.println("Original List:");
        list.printList();
    }
}