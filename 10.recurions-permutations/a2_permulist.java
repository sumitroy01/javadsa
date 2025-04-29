
import java.util.ArrayList;

public class a2_permulist {
    public static void main(String[] args) {
        ArrayList<String>mylist=permu("", "abc");
        System.out.println(mylist);
        
    }

    static ArrayList<String> permu(String returner,String original){
       ArrayList<String> mylist =new ArrayList<>();

        if (original.isEmpty()) {
            mylist.add(returner);
            return  mylist;
        }

        char let=original.charAt(0);
        String remains=original.substring(1);
        for (int i = 0; i <=returner.length(); i++) {
            String fl=returner.substring(0,i);
            String las=returner.substring(i);
            mylist.addAll(permu(fl+let+las, remains));

        }
        return mylist;

    }
    
}
