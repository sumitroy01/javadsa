public class a1_oddevn {

    public static void main(String[] args) {
        oddevee(111111110);
    }

    static void oddevee(int num){
        if((num & 1)==1){
            System.out.println("your number is odd");
        }else{
            System.out.println("your number is even");
        }
    }    
}