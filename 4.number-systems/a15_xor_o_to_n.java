public class a15_xor_o_to_n {
    public static void main(String[] args) {
        int num=6;
        sumofxor(num);

    }

    static void sumofxor(int nth){
        
        switch (nth%4) {
            case 0 :
            System.out.println(nth);    
            break;
            case 1:
            System.out.println(1);
            break;
            case 2:
            System.out.println(nth+1);
            break;        
            default:
            System.out.println(0);
                break;
        }

}
}