public class a6_subse_ascii {
    public static void main(String[] args) {
        asciivcal("", "abc");
    }

    static void asciivcal(String giver,String original){
        if (original.isEmpty()) {
          for(int i=0;i<giver.length();i++){
            int nums=giver.charAt(i)+0;
            System.out.print(nums+" ");
        }
        
        System.out.println();
        return;
      
        }

        char charsat=original.charAt(0);
        String ramins =original.substring(1);

        asciivcal(giver+charsat, ramins);
        asciivcal(giver, ramins);

       


   
    }

}