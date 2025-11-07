public class lll {
    Node head;
    Node tail;
    int size;

        class Node{
            Node next;
            int value;

        public Node(int value) {
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
       }
       public lll(){
        int size=0;
       }


       public void inserthead(int value){
            Node my=new Node(value, head);
            head=my;
            if (tail==null) {
                tail=head;
            }
            size+=1;
       }

       public void inserttail(int value){
        if (size==0) {
            inserthead(value);
        }
      
        Node mynewtail=new Node(value);
        tail.next=mynewtail;
        tail=mynewtail;
       size+=1;
    }

   public void insertat(int val, int index) {
    try {
        if (index == 0) {
            inserthead(val);
            return;
        }

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is not valid");
        }

        if (index == size) {
            inserttail(val);
            return;
        }

        Node temps = head;
        for (int i = 1; i < index; i++) {
            temps = temps.next;
        }

        Node newnode = new Node(val, temps.next);
        temps.next = newnode;
        size += 1;
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Exception: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Unexpected error: " + e.getMessage());
    }
}

    public void deletehead(){
        if (size==0) {
            System.out.println("cant delete head ll null");
            return;
        }
        Node temp=head.next;
        head=null;
        head=temp;


    }

    public void deletetail(){
        if (size==0) {
            return;
        }

        Node tem=head;
        for (int i = 0; i < size; i++) {
            
        }
    }



public static void main(String[] args) {
    lll mylist= new lll();
    mylist.inserthead(20);
    mylist.inserttail(30);
    mylist.insertat(100, 2);
    mylist.insertat(500, 3);
    mylist.insertat(900, 7);
    

    int val=mylist.head.value;
    // int vals=mylist.size;
    System.out.println(val);
}


}
