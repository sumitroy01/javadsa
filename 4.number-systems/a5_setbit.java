//set the ith bit means if the ith bit is 0 make it i else 0;

public class a5_setbit {
public static void main(String[] args) {
    System.out.println(setbit(22, 0));
}

static int setbit(int num,int bit){

    int mask =1<<bit;
    if ((num&mask)!=0) {
        return num^mask;
        
    }else{
        return num | mask;
    }

}
    
}
