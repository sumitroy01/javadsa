class aLL{
    int size;
    Node head,tail;

    class Node{
        Node prev,next;
        int value;


        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node prev,Node next){
            this.value=value;
            this.prev=prev;
            this.next=next;
        }


    }
     public aLL(){
        size=0;
     }



}