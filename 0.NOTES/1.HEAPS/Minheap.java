
import java.util.ArrayList;

public class Minheap<T extends Comparable <T>> {
    
    private ArrayList<T> heap;

    public Minheap(){
        heap=new ArrayList<>();

    }

    public int getrightindex(int index){
        return (index*2)+2;
    }
     public int getleftindex(int index){
        return (index*2)+1;
    }

    public int getparentindex(int index){
        return (index-1)/2;
    }
    public void swap(int first,int second){
        T temp=heap.get(first);
        heap.set(first, heap.get(second));
        heap.set(second, temp);
    }
  
    public void upheap(int index){
        if (index==0) {
            return;
        }
        int parent=getparentindex(index);
        if (heap.get(index).compareTo(heap.get(parent))<0) {
            swap(parent, index);
            upheap(parent);
        }
    }

    public void downheap(int index){
        if (index==heap.size()-1) {
            return;
        }
        int min=index;
        int right=getrightindex(index);
        int left=getleftindex(index);

       if (right<heap.size() && heap.get(min).compareTo(heap.get(right))>0) {
        min=right;
       }
       if(left<heap.size() && heap.get(min).compareTo(heap.get(left))>0){
        min=left;
       }

       if (index!=min) {
            swap(index, min);
            downheap(min);
       }
    }
     
    public void insertone(T value){
        if (heap.isEmpty()) {
            heap.add(value);
            return;
        }

        heap.add(value);
        upheap(heap.size()-1);

    }

    public void deleteroot(){
        if (heap.isEmpty()) {
            System.out.println("this heap is mt");
            return;
        }

        T lastone=heap.remove(heap.size()-1);
        if (!heap.isEmpty()) {
            
            heap.set(0, lastone);
            downheap(0);
        }
    }

    public void delte(T value){
        int index=heap.indexOf(value);
        if (heap.isEmpty() || index<0) {
            System.out.println("heap is empty or elemnet dont exits");
            return;
        }

        T lastones=heap.remove(heap.size()-1);
        if (index<heap.size()) {
            heap.set(index, lastones);
            upheap(index);
            downheap(index);
        }


    }

    public void showall(){
        System.out.println(heap);
    }
       
    public static void main(String[] args) {
        Minheap<Integer> myheap=new Minheap<>();
        myheap.insertone(10);
        myheap.insertone(20);
        myheap.insertone(30);
        myheap.insertone(8);
        myheap.insertone(15);
        myheap.insertone(2);
        myheap.showall();
        myheap.deleteroot();
        myheap.showall();
        myheap.delte(8);
        myheap.showall();


    }
}
