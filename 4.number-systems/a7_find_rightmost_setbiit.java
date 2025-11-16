// let my my - 10110110
//ans = 2 
// the 1 in the right hand side


public class a7_find_rightmost_setbiit {
    public static void main(String[] args) {
       int num=10;
       int out=setbitrm(num);
        System.out.println(out);

       
               
    }
    static int setbitrm(int num){
        int mask=1<<0;

        if ((num&mask)==0) {

            return num|mask;
        }else{
           return  num^mask;
        }




    }


    

}
