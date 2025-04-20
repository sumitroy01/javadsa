public class a3_forloopinreucr {
    public static void main(String[] args) {
        recursion(1,7,6);
    }
    

    static void recursion(int row ,int col,int n){
    if(n==0){

          return; 
          
        }else{
            if (col>row) {
                System.out.print("x");
                recursion(row, col-1,n);
             }else{
                 System.out.println();
                 recursion(row, col+n-1,n-=1);
                 
             }
        }
    }

}
