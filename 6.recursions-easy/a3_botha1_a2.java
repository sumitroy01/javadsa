public class a3_botha1_a2 {
    public static void main(String[] args) {
        int num=5;
        order(num);
    }

    static void order(int num){
        if (num==0) {
            return;
            
        }
        System.out.println(num);
        order(num-1);
        System.out.println(num);
    }

}
