public class a1_removeduplicates {

    public static MyLinkedList.ListNode rmvduplicates(MyLinkedList.ListNode head){
        MyLinkedList.ListNode mynode=head;
        while (mynode!=null &&mynode.next!=null){
            if(mynode.val==mynode.next.val){
                mynode.next=mynode.next.next;
            }else{
                mynode=mynode.next;
            }
        }
        return head;



    }

}
