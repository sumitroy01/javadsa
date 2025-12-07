class brecurinsrt {
    static class aLL {
        int size;
        Node head, tail;

        class Node {
            Node prev, next;
            int value;

            public Node(int value) {
                this.value = value;
            }

            public Node(int value, Node prev, Node next) {
                this.value = value;
                this.prev = prev;
                this.next = next;
            }
        }

        public aLL() {
            size = 0;
            head = null;
            tail = null;
        }

        public void show() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public void recurinsert(int index, int value) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            head = helper(index, value, head);
        }

        private Node helper(int index, int val, Node current) {
         
            if (index == 0) {
                Node node = new Node(val);
                node.next = current;

                if (current != null) {
                    current.prev = node;
                } else {
                 
                    tail = node;
                }

                size++;
                return node;
            }

           
            if (current == null) {
                throw new IndexOutOfBoundsException("Index out of bounds in recursion");
            }

            
            Node nextNode = helper(index - 1, val, current.next);

           
            current.next = nextNode;
            nextNode.prev = current;

            
            if (nextNode.next == null) {
                tail = nextNode;
            }

            return current;
        }
    }

    public static void main(String[] args) {
        brecurinsrt.aLL mylist = new aLL();
        mylist.recurinsert(0, 10);
        mylist.recurinsert(1, 20);
        mylist.recurinsert(2, 30);
        mylist.recurinsert(3, 40);
        mylist.show();   // 10 20 30 40
    }
}
