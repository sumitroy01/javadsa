public class circularlink {
    private Node head;
    private Node tail;
    private int size;

    public circularlink() {
    this.size=0;
    }

    private class Node{
        private Node next;
        private int value;

        public Node(Node next,int value ) {
            this.next=next;
            this.value=value;
        }
    }

    public void setfirst(int val){
        if (head==null) {
            Node node =new Node(head, val);
            head=node;
            tail=head;
            head.next=head;
            size++;
            return;
        }
        Node node=new Node(head, val);
        head=node;
        tail.next=head;
        size++;

    }

    public void display(){
        Node temp=head;
      do{
         System.out.print(temp.value+"->");
         temp=temp.next;
        }
        while (temp!=head); 
            System.out.println('E');
        
            



    }

    public static void main(String[] args) {
        circularlink mylink=new circularlink();
        mylink.setfirst(10);
        mylink.setfirst(9);
        mylink.setfirst(8);


        mylink.display();
    }
    
}
