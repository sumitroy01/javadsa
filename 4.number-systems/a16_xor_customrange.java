public class a16_xor_customrange {
    public static void main(String[] args) {
        // start range 5,7
        int s1= xor(7);
        int s2=xor(4);
        int finalresult=s1^s2;
        System.out.println(finalresult);

    }

    static int xor(int nthele){

        switch(nthele%4){
            case 0:
            return nthele;          
           
            case 1:
            return 1;
          
            case 2:
            return nthele+1;
           
            case 3:
            return 0;
       }

       return -1;
    }
}
