package customqueues;

public class circularqueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;

    int end=0;
    int front=0;
   protected int size=0;


    public circularqueue(){
        this(DEFAULT_SIZE);
    }

    public circularqueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        return size==data.length;
    }
    public boolean isEmpty(){
        return end==-1;
    }


    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }


    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed =data[front++];
        for (int i = 0; i < end; i++) {
            data[i-1]=data[i];
        }
        front=front%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("queue is empty");

        }
        return data[front];

    }
    public void display(){
       if (isEmpty()){
           return;
       }
       int i=front;
       do{
           System.out.println(data[i]);
            i++;
            i%=data.length;
       }while(i!=end);
        System.out.println("END");

    }

}
