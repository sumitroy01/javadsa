
public class z2_rightshift {
    public static void main(String[] args) {
      
        int b=20;
        System.out.println(Integer.toBinaryString(b)+"---before ");
        int a=b>>3;
        System.out.println(b+" shfited and got "+a);
        System.out.println(Integer.toBinaryString(a));
        
    }
}
