//set the ith bit means if the ith bit is 0 make it 1 else 1;

public class a5_setbit {
public static void main(String[] args) {
    System.out.println(setbit(4, 2));
}

static int setbit(int num,int bit){
//100
//010


    int mask =1<<bit-1;
    if ((num&mask)!=0) {
        return num&mask;
        
    }else{
        return num | mask;
    }

}
    
}
