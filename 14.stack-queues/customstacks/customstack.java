package customstacks;
public class customstack extends Exceptions {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;

    public customstack(int size){
        this.data=new int[size];
    }
    public customstack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if (isFull()) {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackEmptyException{
        if (isEmpty()) {
            throw new StackEmptyException();
        }
        int removed =data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{
        if (isEmpty()) {
            throw new Exception("cannot peek from empty ");
        }
        return data[ptr];
    }

    protected  boolean isFull(){
        return ptr==data.length-1;
    }

    private boolean isEmpty(){
        return ptr==-1;
    }

}
