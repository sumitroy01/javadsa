// questions --leetcode ...
//eg num=14..   expeced output=6
//step1  num--even then num/2  --ou =7
// s2; 7  num--odd  then num-1;  --ou =6
//s3 ;6  div  till num =0 count total number of steps...



public class a10_countsteps {
    public static void main(String[] args) {
        int num=25;
        System.out.println(cns(num));
    }

    static int cns(int num){
       
      
        if (num==0) {
            return 0;
        }

        if (num%2==0) {
            return 1+ cns(num/2);
        
        }else{
        
            return 1+ cns(num-1);
        }
       
    }
    
}
