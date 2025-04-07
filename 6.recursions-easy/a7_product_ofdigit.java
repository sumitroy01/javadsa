public class a7_product_ofdigit {
    public static void main(String[] args) {
        int num=2222;
        System.out.println(pod(num));
       
    }

    static int pod(int num){
        if (num/10==0) {
            return num;
        }

        return num%10*pod(num/10);
    }

    
}
