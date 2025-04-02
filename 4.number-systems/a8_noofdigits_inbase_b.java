public class a8_noofdigits_inbase_b {
    public static void main(String[] args) {
        int num=2100;
      int b= count_digits(num);
        System.out.println(b);
      
    }
    static int count_digits(int num){
        int count=0;
        while (num>0) {
            num=num>>1;
           count++ ;
            
        }
        return count;
    }
}
