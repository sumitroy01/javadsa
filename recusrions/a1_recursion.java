public class a1_recursion {

    public static void main(String[] args) {
       
            
            sh(5);
        

    }

    static void sh(int num){
        System.out.println(num);
        if (num<5) {
            
            sh(num+1);
        }
    }
}