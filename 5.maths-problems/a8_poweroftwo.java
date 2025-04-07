public class a8_poweroftwo {
    public static void main(String[] args) {
        int num =10;
        if (powerof2(num)==(int)powerof2(num)) {
            System.out.println("yes the number is power of 2");
        }else{
            System.out.println("no its not");
        }
        System.out.println(powerof2(num));

    }

    static double powerof2(int num){
        
    
            double p2=Math.log(num)/Math.log(2);

        
       return p2;
    }
    
}
