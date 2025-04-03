public class p1 {
    public static void main(String[] args) {
        
       int num=5;
       isprime(num);

    }
    static void isprime(int num){
        int start=2;
        boolean value=true;
        for (int i = start; i <num; i++) {
            if (num%i==0) {
                value=false;
            }
            start=start*start;
        }

        System.out.println(value);
    }
    
}
